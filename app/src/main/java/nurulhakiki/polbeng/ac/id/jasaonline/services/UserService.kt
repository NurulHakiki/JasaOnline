package nurulhakiki.polbeng.ac.id.jasaonline.services

import nurulhakiki.polbeng.ac.id.jasaonline.models.DefaultResponse
import nurulhakiki.polbeng.ac.id.jasaonline.models.LoginResponse
import nurulhakiki.polbeng.ac.id.jasaonline.models.User
import retrofit2.Call
import retrofit2.http.*

interface UserService {
    @GET("login")
    fun loginUser(
        @QueryMap filter:HashMap<String, String>
    ): Call<LoginResponse>

    @POST("users")
    fun registerUser(
        @Body newUser: User
    ): Call<DefaultResponse>

    @PUT("users")
    fun updateUser(
        @Body updatedUser: User
    ): Call<DefaultResponse>

    @DELETE("users/{id}")
    fun deleteUser(
        @Path("id") id: Int
    ): Call<DefaultResponse>
}