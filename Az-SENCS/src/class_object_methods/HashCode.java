/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_object_methods;

/**

 @author EMAM
 */
public class HashCode {

      public static void main(String[] args) {
            User user1 = new User(123, "mohamed", "mohamed@gmail");
            User user2 = new User(123, "mohame", "mohamed123@gmail");

            System.out.println();
//            System.out.println(user2);
      }

}

//vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
//vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
//vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
//vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
//vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
//vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
//vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
//vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
//vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
//vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
class User {

      private long id;
      private String name;
      private String email;

      public User(long _id, String _name, String _email) {
            this.id = _id;
            this.name = _name;
            this.email = _email;
      }

      /**
       equals() Contract
       <ul>
       <li>reflexive:<ul>an object must equal itself</ul></li>
       <li>symmetric:<ul>x.equals(y) must return the same result as y.equals(x)</ul></li>
       <li>transitive:<ul>if x.equals(y) and y.equals(z) then also x.equals(z)</ul></li>
       <li>consistent:<ul>the value of equals() should change only if a property that is contained in equals() changes (no randomness allowed)</ul></li>
       </ul>

       @param _obj
       @return
       */
      @Override
      public boolean equals(Object o) {
            if ( this == o ) {
                  return true;
            }
            if ( o == null ) {
                  return false;
            }
//            if ( this.getClass() != o.getClass() ) {
            if ( !(o instanceof User) ) {
                  return false;
            }
            User user = (User)o;
            return id == user.id && name.equals(user.name) && email.equals(user.email);
      }
//      Naive , Improved, Standard

      /**
       <b>hashCode() Contract</b>
       <ul>
       <li>internal consistency:<ul>the value of hashCode() may only change if a property that is in equals() changes</ul></li>
       <li>equals consistency:<ul>objects that are equal to each other must return the same hashCode</ul></li>
       <li>collisions:<ul>unequal objects may have the same hashCode</ul></li>
       </ul>

       @return
       */
      @Override
      public int hashCode() {
//            return 1;
//            return (int) id * name.hashCode() * email.hashCode();
            int result = 7;
            result = (int)(31 * result + id); // 31 * i == (i << 5) - i
            result = 31 * result + (name == null ? 0 : name.hashCode());
            result = 31 * result + (email == null ? 0 : email.hashCode());
            return result;
      }
}
