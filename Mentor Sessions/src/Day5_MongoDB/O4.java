package Day5_MongoDB;

public class O4 {
    public static void main(String[] args) {
        System.out.println("Download of Mongo DB");
        /*
        download the mongo db from mongo db community website

        use the mongo shell from mongo db only

        commands - use sumi3

       write query -
                    to create a collection
                    db.createCollection("myapp")

                    -----

                    if there is no collection then new database

                    for using the database
                    ex - use sumi4
                    then for inserting the data

                    db.myapp.insertOne({name:'sumi'})
                    // all the data should be in the curly braces
                    // here the name is the key
                    ----------

                    db.myapp.insertOne({name:'Josh'})
                    db.myapp.insertOne({name:'Hannah'})

                    ------
                    db.myapp.find()
                    -> it is listing out all the documents in the collection

                    ------

                    db.myapp.insertMany([{name:'vivek'},{name :'ashik'}])

                        each and every curly braces are considered as objects
                        in json and also in js
                        it is an array of objects

                        [] array of objects

                        -----------

                        findOne() function

                        db.myapp.find({name:'vivek'})
                        // it is case sensitive

                        ------ projection

                        dp.myapp.find({}, {name :1})

                        ----------
                        updating the records

                        db.myapp.updateOne({name:'sumi'},{$set:{name:'mishra'}})

                        ----------
                        delete

                        db.myapp.deleteOne({name:'mishra'})



                        ----------




         */
    }
}
