package nurulhakiki.polbeng.ac.id.jasaonline.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class User (
    @SerializedName("id")
    var id:Int = 0,
    @SerializedName("nama")
    var nama:String?=null,
    @SerializedName("tanggal_lahir")
    var tanggal_lahir:String?=null,
    @SerializedName("jenis_kelamin")
    var jenis_kelamin:String?=null,
    @SerializedName("nomor_hp")
    var nomor_hp:String?=null,
    @SerializedName("alamat")
    var alamat:String?=null,
    @SerializedName("email")
    var email:String?=null,
    @SerializedName("password")
    var password:String?=null,
): Serializable