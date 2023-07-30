
import android.app.Activity
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment

class Permissions(fragment: Fragment) {

    val permissionArray = mutableListOf<String>()

    val  currentActivity = fragment.requireActivity()

    fun Camera(){
        if(ActivityCompat.checkSelfPermission(currentActivity, android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            val permission = mutableListOf<String>()

            permission.add(android.Manifest.permission.CAMERA)

            if (permissionArray.isNotEmpty()){
                ActivityCompat.requestPermissions(currentActivity , permissionArray.toTypedArray() ,0)
            }
        }
    }

    fun Contacts() {
        if (ActivityCompat.checkSelfPermission(currentActivity, android.Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED){
            permissionArray.add(android.Manifest.permission.READ_CONTACTS)
            if (permissionArray.isNotEmpty()){
                ActivityCompat.requestPermissions(currentActivity , permissionArray.toTypedArray() ,0)
            }
        }

    }


    fun Location() {
        if (ActivityCompat.checkSelfPermission(currentActivity, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            permissionArray.add(android.Manifest.permission.ACCESS_FINE_LOCATION)
            if (permissionArray.isNotEmpty()){
                ActivityCompat.requestPermissions(currentActivity , permissionArray.toTypedArray() ,0)
            }

        }
    }

    fun Calendar() {
        if (ActivityCompat.checkSelfPermission(
                currentActivity,
                android.Manifest.permission.READ_CALENDAR
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            val permissionArray = mutableListOf<String>()
            permissionArray.add(android.Manifest.permission.READ_CONTACTS)
            if (permissionArray.isNotEmpty()){
                ActivityCompat.requestPermissions(currentActivity , permissionArray.toTypedArray() ,0)
            }

        }}


    fun WriteExternalStrorage() {
        if (ActivityCompat.checkSelfPermission(currentActivity , android.Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            permissionArray.add(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)

            if (permissionArray.isNotEmpty()){
                ActivityCompat.requestPermissions(currentActivity , permissionArray.toTypedArray() ,0)
            }
        }

    }
    fun ReadExternalStrorage() {


        if (ActivityCompat.checkSelfPermission(currentActivity, android.Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            permissionArray.add(android.Manifest.permission.READ_EXTERNAL_STORAGE)

            if (permissionArray.isNotEmpty()){
                ActivityCompat.requestPermissions(currentActivity , permissionArray.toTypedArray() ,0)
            }
        }

    }



}