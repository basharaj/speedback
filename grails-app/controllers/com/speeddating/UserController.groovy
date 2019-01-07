package com.speeddating

class UserController {

  static scaffold = User

  def viewImage = {
    User user = User.get(params.id)
    byte[] image = user.profileImage
    response.outputStream << image
  }

}
