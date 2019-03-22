# filmRecommendations

This is a command-line program into which we can enter film ratings from users, find out the best rated movies, give recommendations, look through every movie and its ratings, as well as see all the ratings that a specific person has entered.  

For this we mainly use the class Rating Register, which stores two hashmaps:   
First one has Films - List of Ratings as key value pairs. This is used to store every movie and every rating that it has received.  
Second one has People as keys and their film - rating pairs as values in a hashmap.
  
Classes in the package comparator such as FilmComparator, PersonComparator lets us compare the movies and figure out the highest rated ones.  
Classes in the package domainFilm, Person, Rating inside of package domain lets us create objects of films, movies, and have have ratings as enums.

If we want a recommendation for a person that hasn't seen any of the movies yet, we use the class Reference that helps us figure out the highest rated movie and return it as the recommendation.
