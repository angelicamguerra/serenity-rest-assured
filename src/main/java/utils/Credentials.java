package utils;

//import com.opencsv.bean.CsvBindByName;

public class Credentials {

    private String email;
    private String password;

    public class CredentialsBuilder {
        private String email;
        private String password;

        public CredentialsBuilder Email(String email) {
            this.email = email;
            return this;
        }

        public CredentialsBuilder Password(String password) {
            this.password = password;
            return this;
        }

        public Credentials build (){
            return new Credentials(this);

        }
    }
    private Credentials (CredentialsBuilder credentialsBuilder ) {
        this.email = credentialsBuilder.email;
        this.password = credentialsBuilder.password;
    }
}

/*
    //@CsvBindByPosition(position = 0)
    @CsvBindByName(column = "email")
    private String email;
    //@CsvBindByPosition(position = 1)
    @CsvBindByName(column = "password")
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "Credential{" + "email= " + email + '\'' + ", password='" + password + '\'' + '}';
    }


}*/

















