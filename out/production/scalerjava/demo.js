import {
  Box,
  Button,
  Card,
  Grid,
  Link,
  List,
  ListItem,
  MenuItem,
  Select,
  Table,
  TableBody,
  TableCell,
  TableContainer,
  TableHead,
  TableRow,
  Typography,
} from '@mui/material';
import axios from 'axios';
import dynamic from 'next/dynamic';
import Image from 'next/image';
import NextLink from 'next/link';
import { useRouter } from 'next/router';
import { useSnackbar } from 'notistack';
import { useContext } from 'react';
import Layout from '../components/Layout';
import { Store } from '../utils/Store';
import EmptyCart from  './EmptyCart'
import CheckoutItemComponent from "../components/checkout-item/checkout-item.component";

function CartScreen() {
  const router = useRouter();
  const {
    state: {
      cart: { cartItems },
    },
    dispatch,
  } = useContext(Store);

  const { enqueueSnackbar } = useSnackbar();

  const updateCartHandler = async (item, quantity) => {
    const { data } = await axios.get(`/api/products/${item._id}`);
    if (data.countInStock < quantity) {
      enqueueSnackbar('Sorry. Product is out of stock', { variant: 'error' });
      return;
    }
    dispatch({
      type: 'CART_ADD_ITEM',
      payload: {
        _key: item._key,
        name: item.name,
        countInStock: item.countInStock,
        slug: item.slug,
        price: item.price,
        image: item.image,
        quantity,
      },
    });
    enqueueSnackbar(`${item.name} updated in the cart`, {
      variant: 'success',
    });
  };
  const removeItemHandler = (item) => {
    dispatch({ type: 'CART_REMOVE_ITEM', payload: item });
  };
  return (
    <Layout title="Shopping Cart">

     <div className="flex  justify-center  ">
          <div className="text-center  text-gray-800 py-8 px-6">
            <svg
              xmlns="http://www.w3.org/2000/svg"
              viewBox="0 0 24 24"
              fill="currentColor"
              className="inline-block w-20 h-20 bg-black-500 rounded-full bg-yellow-500 my-8 mx-8 px-4 py-4  basis-1/4 transition duration-150 ease-in-out"
            >
              <path d="M2.25 2.25a.75.75 0 000 1.5h1.386c.17 0 .318.114.362.278l2.558 9.592a3.752 3.752 0 00-2.806 3.63c0 .414.336.75.75.75h15.75a.75.75 0 000-1.5H5.378A2.25 2.25 0 017.5 15h11.218a.75.75 0 00.674-.421 60.358 60.358 0 002.96-7.228.75.75 0 00-.525-.965A60.864 60.864 0 005.68 4.509l-.232-.867A1.875 1.875 0 003.636 2.25H2.25zM3.75 20.25a1.5 1.5 0 113 0 1.5 1.5 0 01-3 0zM16.5 20.25a1.5 1.5 0 113 0 1.5 1.5 0 01-3 0z" />
            </svg>
            <div className="flex flex-col text-center w-full ">
              <h1 className="sm:text-3xl text-2xl  mb-4 text-gray-900">Cart</h1>
              <hr />
              <p className="lg:w-2/3 mx-auto leading-relaxed text-base"></p>
            </div>
            <div className=" flex  w-full justify-center ">
              <div className="flex-row  flex-grow md:items-start sm:justify-center  flex-auto  p-4 rounded-xl border-2 ">
                <div className="flex flex-row bg-white">
                  <svg
                    xmlns="http://www.w3.org/2000/svg"
                    fill="none"
                    viewBox="0 0 24 24"
                    strokeWidth="1.5"
                    stroke="currentColor"
                    className="w-6 h-6"
                  >
                    <path
                      strokeLinecap="round"
                      strokeLinejoin="round"
                      d="M21 11.25v8.25a1.5 1.5 0 01-1.5 1.5H5.25a1.5 1.5 0 01-1.5-1.5v-8.25M12 4.875A2.625 2.625 0 109.375 7.5H12m0-2.625V7.5m0-2.625A2.625 2.625 0 1114.625 7.5H12m0 0V21m-8.625-9.75h18c.621 0 1.125-.504 1.125-1.125v-1.5c0-.621-.504-1.125-1.125-1.125h-18c-.621 0-1.125.504-1.125 1.125v1.5c0 .621.504 1.125 1.125 1.125z"
                    />
                  </svg>
                  <span className="font-semibold text-lg  mx-2">
                    Available Offers
                  </span>
                </div>
                <div className="flex flex-col rounded-md   p-4 text-center md:flex-row md:items-center md:justify-between  md:text-left">
                  <div className="text-sm  ">
                    <div className="text-gray-900">
                      Lorem ipsum dolor sit amet consectetur adipisicing elit.
                    </div>
                    <div className="text-gray-900">
                      Lorem ipsum dolor sit amet consectetur adipisicing elit.
                    </div>{" "}
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      {cartItems.length === 0 ? (
        <Box>
            <EmptyCart/>
        </Box>
      ) : (
        <>
        <div>
        {cartItems.map((item) => (
   <div className="flex flex-row">
      <div className=" my-5   mx-auto rounded-xl border-2 p-6  text-gray-700">
        <div className="flex flex-row justify-between">
          <div className="flex"></div>
          <div className="flex">
            <div className="flex  rounded-full">
              <button
                className="rounded-full bg-red-600 px-1 py-1 text-white"
                onClick={() => removeItemHandler(item)}
              >
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  fill="none"
                  viewBox="0 0 24 24"
                  strokeWidth="4"
                  stroke="currentColor"
                  className="w-6 h-6"
                >
                  <path
                    strokeLinecap="round"
                    strokeLinejoin="round"
                    d="M6 18L18 6M6 6l12 12"
                  />
                </svg>
              </button>
            </div>
          </div>
        </div>

        <div className=" justify-center">
          <div className="relative  flex flex-col md:flex-row md:space-x-5  md:space-y-0 rounded-xl  p-3 border border-white bg-white">
            <div className="w-full md:w-1/6 bg-white grid place-items-center">
            <NextLink href={`/product/${item.slug}`} passHref>
                  <Link>
                  <img src={item.image} alt={item.name} className="rounded" />
                  </Link>
            </NextLink>
            </div>
            <div className="w-full md:w-2/3 bg-white flex flex-col space-y-2 p-3">
              <div className="flex justify-between item-center">
                <button className="text-cyan-500 font-medium  md:block ">
                  Move to Wishlist
                </button>
              </div>
              <h3 className=" text-gray-800 ">{item.name}</h3>
              <p className="md:text-lg text-gray-500 text-base">₹ {item.price}</p>
              <div className=" ">
                {/* ========================== */}

                <div className="flex flex-row">
                  <div className="flex flex-row justify-start">
                    <div className=" flex flex-row  justify-content mb-3 mr-4  ">
                      <h1 className="mr-2 flex">SIZE:</h1>
                      <select
                        className=" flex form-select appearance-none

                                    w-max
                                    px-2

                                    text-center
                                    font-normal
                                    text-gray-700
                                    bg-white bg-clip-padding bg-no-repeat
                                    border border-solid border-gray-300
                                    rounded
                                    transition
                                    ease-in-out
                                    m-0
                                    focus:text-gray-700 focus:bg-white focus:border-blue-600 focus:outline-none"
                        aria-label="Default select example"
                      >
                        <option className="bg-white" selected>
                          S
                        </option>
                        <option className="bg-white" value="M">
                          M
                        </option>
                        <option className="bg-white" value="L">
                          L
                        </option>
                        <option className="bg-white" value="XL">
                          XL
                        </option>
                        <option className="bg-white" value="XXL">
                          XXL
                        </option>
                      </select>
                    </div>
                    <div className="mb-3  flex flex-row justify-between">
                      <h1 className="flex">Quantity: </h1>
                      <div className="flex h-8 ">
                      <Select
                            value={item.quantity}
                            onChange={(e) =>
                              updateCartHandler(item, e.target.value)
                            }
                          >
                            {[...Array(item.countInStock).keys()].map((x) => (
                              <MenuItem key={x + 1} value={x + 1}>
                                {x + 1}
                              </MenuItem>
                            ))}
                          </Select>
                      </div>
                    </div>
                  </div>
                </div>
                {/* ========================== */}
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
        ))}
        <div className="flex  justify-between mx-10 my-8">
          <div className="flex flex-row w-full justify-between form-check my-6 mx-6">
            <div className="flex flex-row">
              <input
                className=" form-check-input  h-4 w-4 border border-gray-300 rounded-sm bg-white checked:bg-cyan-500 checked:border-blue-600 focus:outline-none transition duration-200 mt-1 align-top bg-no-repeat bg-center bg-contain float-left mr-2 cursor-pointer"
                type="checkbox"
                value=""
                id="openOrders"
              />
              <label
                className=" form-check-label  text-gray-800"
                for="openOrders"
              >
                {/* 0/{itemCount === 0 ? "0" : itemCount} Items Selected */}
                ({cartItems.reduce((a, c) => a + c.quantity, 0)}{' '}
                      items)

              </label>
            </div>

            {/* =========+Dropdown Starts */}
            <div className="flex flex-row">
              <div className="flex justify-between center ">
                <button
                  className="flex px-4 text-cyan-500 font-medium "
                  onClick={() => removeItemHandler(item)}
                >
                  Remove
                </button>
                <h1 className="flex">|</h1>
                <button
                  className="px-4 flex text-cyan-500 font-medium"
                  // onClick={() => addItem(cartItem)}
                >
                  Move to Wishlist
                </button>
              </div>
            </div>
          </div>
        </div>



          <Grid container spacing={1}>
            <Grid item md={9} xs={12}>
              <TableContainer>
                <Table>
                  <TableHead>
                    <TableRow>
                      <TableCell>Image</TableCell>
                      <TableCell>Name</TableCell>
                      <TableCell align="right">Quantity</TableCell>
                      <TableCell align="right">Price</TableCell>
                      <TableCell align="right">Action</TableCell>
                    </TableRow>
                  </TableHead>
                  <TableBody>
                    {cartItems.map((item) => (
                      <TableRow key={item._key}>
                        <TableCell>
                          <NextLink href={`/product/${item.slug}`} passHref>
                            <Link>
                              <Image
                                src={item.image}
                                alt={item.name}
                                width={50}
                                height={50}
                              ></Image>
                            </Link>
                          </NextLink>
                        </TableCell>
                        <TableCell>
                          <NextLink href={`/product/${item.slug}`} passHref>
                            <Link>
                              <Typography>{item.name}</Typography>
                            </Link>
                          </NextLink>
                        </TableCell>
                        <TableCell align="right">
                          <Select
                            value={item.quantity}
                            onChange={(e) =>
                              updateCartHandler(item, e.target.value)
                            }
                          >
                            {[...Array(item.countInStock).keys()].map((x) => (
                              <MenuItem key={x + 1} value={x + 1}>
                                {x + 1}
                              </MenuItem>
                            ))}
                          </Select>
                        </TableCell>
                        <TableCell align="right">
                          <Typography>${item.price}</Typography>
                        </TableCell>
                        <TableCell align="right">
                          <Button
                            variant="contained"
                            color="secondary"
                            onClick={() => removeItemHandler(item)}
                          >
                            x
                          </Button>
                        </TableCell>
                      </TableRow>
                    ))}
                  </TableBody>
                </Table>
              </TableContainer>
            </Grid>
            <Grid item md={3} xs={12}>
              <Card>
                <List>
                  <ListItem>
                    <Typography variant="h2">
                      Subtotal ({cartItems.reduce((a, c) => a + c.quantity, 0)}{' '}
                      items) : ${' '}
                      {cartItems.reduce((a, c) => a + c.quantity * c.price, 0)}
                    </Typography>
                  </ListItem>
                  <ListItem>
                    <Button
                      onClick={() => {
                        router.push('/shipping');
                      }}
                      fullWidth
                      color="primary"
                      variant="contained"
                    >
                      Checkout
                    </Button>
                  </ListItem>
                </List>
              </Card>
            </Grid>
          </Grid>
        </div>
        <div>
      <div>

        <div className="flex flex-col w-full justify-center">
          {/* {cartItems.length === 0 ? (
            <EmptyCart />
          ) : (
            cartItems.map((cartItem) => (
              <CheckoutItemComponent
                className=" "
                key={cartItem.id}
                cartItem={cartItem}
              ></CheckoutItemComponent>
            ))
          )} */}
        </div>

        {/* Last part */}
        {cartItems.map((item) => (
        <div className="m-10">
          <div className="w-full   p-4 rounded-xl border-2 ">
            <div className="flex justify-between">
              <div className="flex flex-row mx-10">
                <div className="flex">
                  <svg
                    xmlns="http://www.w3.org/2000/svg"
                    fill="none"
                    viewBox="0 0 24 24"
                    stroke-width="1.5"
                    stroke="currentColor"
                    className="w-6 h-6"
                  >
                    <path
                      stroke-linecap="round"
                      stroke-linejoin="round"
                      d="M16.5 3.75V16.5L12 14.25 7.5 16.5V3.75m9 0H18A2.25 2.25 0 0120.25 6v12A2.25 2.25 0 0118 20.25H6A2.25 2.25 0 013.75 18V6A2.25 2.25 0 016 3.75h1.5m9 0h-9"
                    />
                  </svg>
                </div>
                <div className=" flex mx-4 text-lg">
                  <h1>Apply Coupons</h1>
                </div>
              </div>
              <div className="flex ">
                <button
                  type="button"
                  className="flex  px-6 py-2.5   bg-amber-500 text-neutral-700 rounded shadow-md hover:bg-neutral-700  hover:text-white hover:shadow-lg focus:bg-neutral-700 focus:shadow-lg focus:outline-none focus:ring-0 active:bg-neutral-800 active:shadow-lg transition duration-150 ease-in-out"
                  // onClick={displayRazorPage}
                  // onClick={showSuccessPage}
                >
                  Apply
                </button>
              </div>
            </div>
            <div className="my-2">
              <hr />
            </div>
            <div className=" justify-center">
              <div className="p-6 rounded-lg  text-gray-700">
                <h1 className="uppercase text-2xl">
                  {/* Product Details({itemCount === 0 ? "0" : itemCount} Items) */}
                </h1>
                <div className="flex flex-row justify-content">
                  <p className="uppercase w-4/12 text-lg">Total Mrp: </p>
                  <p className="mx-10 text-lg   w-8/12 justify-center">
                    {/* ₹{itemCount === 0 ? "0" : price}{" "} */}
                  </p>
                </div>
                <div className="flex flex-row justify-content">
                  <p className="uppercase w-4/12 text-lg">Delivery Charge</p>
                  <p className="mx-10 text-lg w-8/12 justify-center">₹100</p>
                </div>
                <br />
                <div className="flex flex-row justify-content">
                  <p className="uppercase w-4/12 text-lg">Coupon Discount</p>
                  <p className="mx-10 text-lg w-8/12 justify-center">
                    Coupon Name
                  </p>
                </div>
                <hr className="my-6 border-gray-300" />
                <div className="flex flex-row justify-content">
                  <p className="uppercase w-4/12 text-lg">Total Amount</p>
                  <p className="mx-10 text-lg w-8/12 justify-center">
                      ${item.price}
                  </p>
                </div>
                <div className="flex flex-row justify-content">
                  <p className="uppercase w-4/12 text-lg">You Save</p>
                  <p className="mx-10 text-lg w-8/12 justify-center">
                    {/* ₹{itemCount === 0 ? "0" : price}{" "} */}
                  </p>
                </div>
                <button
                  type="button"
                  className="inline-block px-6 py-2.5 w-full mt-4 bg-amber-500 text-neutral-700 rounded shadow-md hover:bg-neutral-700  hover:text-white hover:shadow-lg focus:bg-neutral-700 focus:shadow-lg focus:outline-none focus:ring-0 active:bg-amber-800 active:shadow-lg transition duration-150 ease-in-out"
                  onClick=""
                >
                  Proceed
                </button>
              </div>
            </div>
          </div>
        </div>
        ))}
      </div>
    </div>
    </>
      )}

    </Layout>
  );
}

export default dynamic(() => Promise.resolve(CartScreen), { ssr: false });
