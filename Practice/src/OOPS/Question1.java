//package OOPS;
//
//import java.util.Scanner;
//
//public class Question1 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of users:");
//        int n = in.nextInt();
//        User[] arr = new User[n];
//        for(int i =0;i<n;i++)
//        {
//            System.out.println("Enter the details of User "+i+1);
//            System.out.println("Enter the mobile number of the user:");
//            String name = in.next();
//            System.out.println("Enter the mobile number of the user:");
//            String mobileNumber = in.next();
//            System.out.println("Enter the username of the user:");
//            String username = in.next();
//
//            System.out.println("Enter the password of the user:");
//            String password = in.next();
//            User user = new User(name,mobileNumber,username,password);
//
//            arr[i] = user;
//
//        }
//        System.out.println("User details as entered:");
//        userBO.displayAll(userArray);
//        userBO.sortUsers(userArray);
//        System.out.println("After sorting:");
//        userBO.displayAll(userArray);
//        System.out.println("Enter the user to be deleted:");
//        String nameToDelete = scanner.nextLine();
//        Boolean isDeleted = userBO.deleteUser(userArray, nameToDelete);
//        if (isDeleted) {
//            System.out.println("User deleted successfully");
//            System.out.println("After Deleting:");
//            userBO.displayAll(arr);
//        } else {
//            System.out.println("No user found with given name");
//        }
//    }
//      public static class User {
//        //write your code here
//        private String name;
//        private String mobileNumber;
//        private String username;
//        private String password;
//        public User(String name, String mobileNumber, String username, String password)
//        {
//            this.name = name;
//            this.mobileNumber = mobileNumber;
//            this.username = username;
//            this.password = password;
//
//        }
//        public String getName()
//        {
//            return name;
//        }
//        public String getMobileNumber()
//        {
//            return mobileNumber;
//        }
//        public String getUsername()
//        {
//            return username;
//        }
//        public String getPassword()
//        {
//            return password;
//        }
//        public String toString()
//        {
//            return "Name:" + this.name + "\nMobile Number:" + this.mobileNumber;
//        }
//
//
//
//    }
//    public static class userBO
//    {
//
//        public void addUser(User[] userArrray,User userIns,int i)
//        {
//            userArrray[i] = userIns;
//        }
//
//        public static void sortUsers(User[] users)
//        {
//            Arrays.sort(users, new Comparator<User>()
//            {
//                @Override
//                public int compare(User u1, User u2)
//                {
//                    return u1.getName().compareTo(u2.getName());
//                }
//            });
//        }
//
//        public static Boolean deleteUser(User[] users, String nameToDelete)
//        {
//            //write your code here
//            for (int i = 0; i < users.length; i++) {
//                if (users[i].getName().equals(nameToDelete))
//                {
//                    users[i] = null;
//                    for (int j = i; j < users.length - 1; j++)
//                    {
//                        users[j] = users[j + 1];
//                    }
//                    users[users.length - 1] = null;
//                    return true;
//                }
//            }
//            return false;
//        }
//
//
//        public void displayAll(User[] users)
//        {
//
//            //write your code here
//            System.out.println("User Details:");
//
//            for (int i = 0; i < users.length; i++)
//            {
//                    System.out.println("User " + i+1);
//                    System.out.println(users[i].toString());
//
//            }
//        }
//    }
//
//
//}
