|Resources   |HTTP Verb|Resource URL                                                  |Use Case                              |
|------------|---------|--------------------------------------------------------------|--------------------------------------|
|Visitor     |POST     |zoos/{zooId}/visitors/{visitorId}/tickets/                    |Buy a ticket                          |
|Ticket      |GET      |zoos/{zooId}/tickets/{ticketId}                               |Get a specific ticket                 |
|Visitor     |GET      |zoos{zooId}/visitors/{visitorId}/                             |Get a specific visitor                |
|Ticket      |GET      |zoos/{zooId}/tickets                                          |List all tickets                      |
|VisitorTasks|GET      |zoos/{zooId}/visitors/{visitorId}/tasks                       |Get visitor's available tasks         |
|Enclosure   |POST     |zoos/{zooId}/enclosures/{enclosureId}/feeed/animals/{animalid}|Feed an animal on a specific enclosure|
|Shop        |POST     |zoos/{zooId}/shops/{shopId}/purchase/products/{productId}     |Make a purchase in a shop             |
|Hospital    |POST     |zoos/{zooId}/hospitals/{hospitaIId}/lectures/                 |Attend a science lecture              |
|Visitor     |POST     |zoos/{zooId}/visitor/{visitorId}/exit                         |Leave the zoo                         |
