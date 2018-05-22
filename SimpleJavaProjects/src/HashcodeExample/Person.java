package HashcodeExample;

public class Person
{
   private final String lastName;
   private final String firstName;

   public Person(final String newLastName, final String newFirstName)
   {
      this.lastName = newLastName;
      this.firstName = newFirstName;
   }

   @Override
   public int hashCode()
   {
      return lastName.hashCode() + firstName.hashCode();
   }

   @Override
   public boolean equals(Object obj)
   {
      if (obj == null)
      {
         return false;
      }
      if (this == obj)
      {
         return true;
      }
      if (this.getClass() != obj.getClass())
      {
         return false;
      }
      final Person other = (Person) obj; 
      if (this.lastName == null ? other.lastName != null : !this.lastName.equals(other.lastName))
      {
         return false;
      }
      if (this.firstName == null ? other.firstName != null : !this.firstName.equals(other.firstName))
      {
         return false;
      }
      return true;
   }

   public String getLastName() {
	return lastName;
}

public String getFirstName() {
	return firstName;
}

@Override
   public String toString()
   {
      return this.firstName + " " + this.lastName;
   }
}