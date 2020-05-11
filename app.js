/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
document.addEventListener('DOMContentLoaded', () => { 

  //card options
  const cardArray = [
    {
      name: '1',
      img: '1.jpg'
    },
    {
      name: '2',
      img: '2.jpg'
    },
    {
      name: '3',
      img: '3.jpg'
    },
    {
      name: '4',
      img: '4.jpg'
    },
    {
      name: '5',
      img: '5.jpg'
    },
    {
      name: '6',
      img: '6.jpg'
     },
     {
       name: '1',
      img: '1.jpg'
    },
    {
      name: '2',
      img: '2.jpg'
    },
    {
      name: '3',
      img: '3.jpg'
    },
    {
      name: '4',
      img: '4.jpg'
    },
    {
      name: '5',
      img: '5.jpg'
    },
    {
      name: '6',
      img: '6.jpg'
     }
  ];

  cardArray.sort(() => 0.5 - Math.random());

  const grid = document.querySelector('.grid');
  const resultDisplay = document.querySelector('#result');
  var cardsChosen = [];
  var cardsChosenId = [];
  var cardsWon = [];
  
  //create your board
  function createBoard() {
    for (let i = 0; i < cardArray.length; i++) {
      var card = document.createElement('img');
      card.setAttribute('src', '7.jpg');
      card.setAttribute('data-id', i);
      card.addEventListener('click', flipCard);
      grid.appendChild(card);
    }
  }
  createBoard();
  //check for matches
  function checkForMatch(){
    var cards = document.querySelectorAll('img');
    const optionOneId = cardsChosenId[0];
    const optionTwoId = cardsChosenId[1];
    
    if(optionOneId === optionTwoId) {
      cards[optionOneId].setAttribute('src', '7.jpg');
      cards[optionTwoId].setAttribute('src', '7.jpg');
      alert('You have clicked the same image!');
    }
    else if (cardsChosen[0] === cardsChosen[1]) {
      cards[optionOneId].setAttribute('src', '9.png');
      cards[optionTwoId].setAttribute('src', '9.png');
      cards[optionOneId].removeEventListener('click', flipCard);
      cards[optionTwoId].removeEventListener('click', flipCard);
      cardsWon.push(cardsChosen);
    } else {
      cards[optionOneId].setAttribute('src', '7.jpg');
      cards[optionTwoId].setAttribute('src', '7.jpg');
    }
    cardsChosen = [];
    cardsChosenId = [];
    resultDisplay.textContent = cardsWon.length;
    if  (cardsWon.length === cardArray.length/2) {
      resultDisplay.textContent = 'Congratulations! You found them all!';
    };
      
  }//close check for match

  //flipCard
  function flipCard(){
      var cardId = this.getAttribute('data-id');
      cardsChosen.push(cardArray[cardId].name);
      cardsChosenId.push(cardId);
      this.setAttribute('src', cardArray[cardId].img);
      if(cardsChosen.length === 2){
          setTimeout(checkForMatch, 500);
      }
      
      
      
      
      
      
      
  }
  
  



});//finished this dubm listener


