<%@page import="com.modalclasses.SrcDestDate"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.modalclasses.AvailableModal"%>  
<% ArrayList<AvailableModal> ams =(ArrayList<AvailableModal>)request.getAttribute("AvailableModals"); %>
<% ArrayList<SrcDestDate> all=(ArrayList<SrcDestDate>) request.getAttribute("separate"); %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <!-- Style CSS -->
    <link rel="stylesheet" href="./css/style.css" />
    <!-- Demo CSS (No need to include it into your project) -->
    <link rel="stylesheet" href="./css/demo.css" />
    <link rel="stylesheet" href="./css/seats.css" />
    
    <!-- bootstrP scc link -->
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
      crossorigin="anonymous"
    />

    <!-- botsrtarp js link -->
    <script
      src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
      integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
      integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
      integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
      crossorigin="anonymous"
    ></script>
  </head>
  <body>
    <div class="main" >
      <main class="app">
        <div class="screen-wrap">
          <section class="screen-bus" style="opacity: 1">
           <% for(SrcDestDate sdd :all){ %>
            <div class="screen-bus__location-filter-wrap">
              <div class="screen-bus__location-filter-row">
                <div class="screen-bus__location">
                  <div class="screen-bus__location-row">
                    <span class="screen-bus__location-col" style="font-size: 30px;font-weight: 600;"><%=sdd.getSource()%></span>
                    <span class="screen-home__rs-arrow"></span>
                    <span class="screen-bus__location-col" style="font-size: 30px;font-weight: 600;"><%=sdd.getDestination()%></span>
                  </div>
                  <div class="screen-bus__date-row">
                    <span><%=sdd.getRegNo()%></span> -
                    
                  </div>
                </div>
                <div class="screen-bus__filter">
                  <figure>
                    <img src="https://i.ibb.co/ZJt9tkM/filter.png" />
                  </figure>
                </div>
              </div>
            </div>
            <% }%> 
           
            <% for(AvailableModal av :ams){ %>
            <div class="screen-bus__travels-wrap">
              <div class="screen-bus__travels-row">
                <div
                  class="screen-bus__travels-col"
                  style="opacity: 1; transform: matrix(1, 0, 0, 1, 0, 0)"
                >
                  <div class="screen-bus__name-time-seat">
                    <div class="screen-bus__name-wrap bus-name-style">
                      <span class="screen-bus__name" style="font-size: 20px;font-weight:600;"><%=av.getRegNo() %></span>
                      <span class="screen-bus__type" style="font-size: 20px;font-weight:600;">Non A/C</span>
                    </div>
                    <div class="screen-bus__time-wrap">
                      <div class="screen-bus__time">
                        <div class="screen-bus__start" style="font-size: 20px;font-weight:600;"><%=av.getArrivalTime() %></div>
                        <div class="screen-bus__time-arrow-wrap">
                          <span class="screen-bus__time-arrow"></span>
                        </div>
                        <div class="screen-bus__end" style="font-size: 20px;font-weight:600;"><%=av.getDeparturetime() %></div>
                      </div>
                      <!-- <div class="screen-bus__hrs">
                        <span style="font-size: 20px;font-weight:600;">2 hrs</span>
                      </div> -->
                    </div>
                    <div class="screen-bus__seat-wrap">
                      <div>
                        <span style="font-weight: 500;font-size: 20px;font-weight:600;">Seats Available: </span>
                        <span class="screen-bus__count" style="font-size: 20px;">26</span>
                        <!-- <span><span>₹</span> 1220</span> -->
                      </div>
                    </div>
                  </div>
                  <div class="screen-bus__rating-price">
                    <div class="screen-bus__rating-price-row" style="justify-content: space-between;">
    
                      <span><span style="font-weight: 500;"> Ticket Price: </span><span>₹</span> <%=av.getTicketCharges() %></span>
                      <div class="screen-bus__price">
                        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                          click to book
                        </button>
                      </div>
                    </div>
                </div>
            </div>
            <% }%>
          </section>
        </div>
      </main>
    </div>
    <!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true" style="margin-left: 485px; margin-top: 100px;">
  <div class="modal-dialog" role="document">
    <div class="modal-content" style="width: 89%;" >
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Choose Your Seats</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <form action="linklogiin" method ="post">
      <div class="modal-body">
        <div class="bus seat2-2 border-0 p-0">
          <div class="seat-row-1">
            <ol class="seats">
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-1"
                  value="1"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-1"> 1 </label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-2"
                  value="2"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-2"> 2 </label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-3"
                  value="3"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-3"> 3 </label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-4"
                  value="4"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-4"> 4 </label>
              </li>
            </ol>
          </div>
          <div class="seat-row-2">
            <ol class="seats">
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-5"
                  value="5"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-5"> 5 </label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-6"
                  value="6"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-6"> 6 </label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-7"
                  value="7"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-7"> 7 </label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-8"
                  value="8"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-8"> 8 </label>
              </li>
            </ol>
          </div>
          <div class="seat-row-3">
            <ol class="seats">
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-9"
                  value="9"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-9"> 9 </label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-10"
                  value="10"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-10"> 10 </label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-11"
                  value="11"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-11"> 11 </label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-12"
                  value="12"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-12"> 12 </label>
              </li>
            </ol>
          </div>
          <div class="seat-row-4">
            <ol class="seats">
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-13"
                  value="13"
                  required=""
                  type="radio"
                  disabled
                />
                <label for="seat-radio-1-13"> 13 </label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-14"
                  value="14"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-14"> 14 </label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-15"
                  value="15"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-15"> 15 </label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-16"
                  value="16"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-16"> 16 </label>
              </li>
            </ol>
          </div>
          <div class="seat-row-5">
            <ol class="seats">
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-17"
                  value="17"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-17"> 17 </label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-18"
                  value="18"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-18"> 18 </label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-19"
                  value="19"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-19"> 19 </label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-20"
                  value="20"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-20"> 20 </label>
              </li>
            </ol>
          </div>
          <div class="seat-row-6">
            <ol class="seats">
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-21"
                  value="21"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-21"> 21 </label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-22"
                  value="22"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-22"> 22 </label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-23"
                  value="23"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-23"> 23 </label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-24"
                  value="24"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-24"> 24 </label>
              </li>
            </ol>
          </div>
          <div class="seat-row-7">
            <ol class="seats">
              <li class="seat">
                <label for="seat-radio-1-BLANK" style="background: none"></label>
              </li>
              <li class="seat">
                <label for="seat-radio-1-BLANK" style="background: none"></label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-25"
                  onclick="func()"
                  value="25"
                  required=""
                  type="radio"
                />
                <label for="seat-radio-1-25"> 25 </label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-26"
                  value="26"
                  onclick="func()"
                  type="radio"
                />
                <label for="seat-radio-1-26"> 26 </label>
              </li>
            </ol>
          </div>
          <div class="seat-row-8">
            <ol class="seats">
              <li class="seat">
                <label for="seat-radio-1-BLANK" style="background: none"></label>
              </li>
              <li class="seat">
                <label for="seat-radio-1-BLANK" style="background: none"></label>
              </li>
              <li class="seat">
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-27"
                  value="27"
                  onclick="func()"
                  type="radio"
                />
                <label for="seat-radio-1-27"> 27 </label>
              </li>
              <li class="seat" >
                <input
                  role="input-passenger-seat"
                  name="passengers[1][seat]"
                  id="seat-radio-1-28"
                  value="28"
                  onclick="func()"
                  type="radio"
                  
                />
                <label for="seat-radio-1-28"> 28 </label>
              </li>
            </ol>
          </div>
          
          <div style="font-weight: 600;">Selected seat</div>
          <li class="seat"  >
          
            <!-- <label for="seat-radio-1-14" id="result" name="seatNumber"> 0</label>  -->   
              <input type="text" id="seatt" name="seatNumber" />
         
         
          
         <div id="result" ></div> 
          </li>
          <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" > <input type ="submit"   >
            
          </button> 
          
          <!--  <input type="submit"> -->
          
        </div>
        </form>

 
      </div>
      <div class="modal-footer">
        <div class="text-left mt-2">
          <button
            class="btn btn-primary btn-xs mb-2 btn-style btn-hover1"
            style="background-color: #3783b5"
          >
            Available
          </button>
          <button
            class="btn btn-success btn-xs mb-2 btn-style btn-hover2"
            style="background-color: #46be8a"
          >
            Choosen
          </button>
          <button
            class="btn btn-danger btn-xs mb-2 btn-style btn-hover3"
            style="background-color: #f73737"
          >
            Booked
          </button>
        </div>
      </div>
    </div>
  </div>
</div>
<script type="text/javascript">
  const buttons = document.getElementsByName("passengers[1][seat]");
  const result = document.getElementById("result");

  const buttonPressed = (e) => {
    result.textContent = e.target.value;
    var re = result.textContent;
    document.getElementById("seatt").value = re;
  };

  for (let button of buttons) {
    button.addEventListener("click", buttonPressed);
  }
</script>
  </body>
</html>
