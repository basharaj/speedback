package com.speeddating

class User {

    private String name;
    private Gender gender;
    private String email;
    private String phoneNumber;
    private byte[] profileImage

    static constraints = {
        name()
        gender()
        email(email: true)
        phoneNumber()
        profileImage maxSize: 1024 * 1024 * 10
    }

    static mapping = {
        profileImage column: 'profile_image', sqlType: 'blob'
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    Gender getGender() {
        return gender
    }

    void setGender(Gender gender) {
        this.gender = gender
    }

    String getEmail() {
        return email
    }

    void setEmail(String email) {
        this.email = email
    }

    String getPhoneNumber() {
        return phoneNumber
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber
    }

    byte[] getProfileImage() {
        return profileImage
    }

    void setProfileImage(byte[] profileImage) {
        this.profileImage = profileImage
    }

    String toString() {
        return name
    }

    public enum Gender {
        MALE("Male"),
        FEMALE("Female"),

        private final String value;

        Gender(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public String toString() {
            return value;
        }
    }
}
