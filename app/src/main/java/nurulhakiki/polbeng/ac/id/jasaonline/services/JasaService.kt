package nurulhakiki.polbeng.ac.id.jasaonline.services

import nurulhakiki.polbeng.ac.id.jasaonline.models.JasaResponse
import retrofit2.Call
import retrofit2.http.GET

interface JasaService {
    @GET("services")
    fun getJasa() : Call<JasaResponse>
}