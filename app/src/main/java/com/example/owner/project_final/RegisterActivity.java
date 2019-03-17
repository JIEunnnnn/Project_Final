package com.example.owner.project_final;

/** ViewPager - Fragment
 *  TabHost (Failed)
 */

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.owner.project_final.model.UserModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();

   //  CollectionReference userRef = db.collection("users");


    private EditText email;
    private EditText password;
    private EditText name;
    private EditText address;

    private Button signup;
    public static RegisterActivity register ;

    //private String splash_background;

    //FirebaseDatabase fd;
    //DatabaseReference fdRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        FirebaseRemoteConfig mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        String splash_background = mFirebaseRemoteConfig.getString("splash_background");
        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.parseColor(splash_background));
        }
        */

        register = RegisterActivity.this;
        final RegisterActivity  registeract = (RegisterActivity)RegisterActivity.register;


        email = (EditText)findViewById(R.id.registerActivity_edittext_email);
        password = (EditText)findViewById(R.id.registerActivity_edittext_password);
        name = (EditText)findViewById(R.id.registerActivity_edittext_name);
        address = (EditText)findViewById(R.id.registerActivity_edittext_address);
        signup = (Button)findViewById(R.id.registerActivity_button_signup);

        //signup.setBackgroundColor(Color.parseColor(splash_background));

        signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if (email.getText().toString() == null || name.getText().toString() == null || password.getText().toString() == null || address.getText().toString() == null ) {
                    return;
                }
                else {


                    FirebaseAuth.getInstance().createUserWithEmailAndPassword(email.getText().toString(), password.getText().toString()).addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                                /*UserModel userModel = new UserModel();
                                userModel.userEmail = email.getText().toString();
                                userModel.userPassword = password.getText().toString();
                                userModel.userName = name.getText().toString();
                                userModel.userAddress = address.getText().toString();
*/
                            // String uid = task.getResult().getUser().getUid();
                            // FirebaseDatabase.getInstance().getReference().child("users").child(uid).setValue(userModel);


                        }
                    });

                    String emailtext =  email.getText().toString();
                    String passwordtext = password.getText().toString();
                    String nametext =  name.getText().toString();
                    String addresstext = address.getText().toString();

                    Map<String, Object> userdata = new HashMap<>();

                    userdata.put("email", emailtext);
                    userdata.put("password", passwordtext );
                    userdata.put("name", nametext );
                    userdata.put("address", addresstext );



                    db.collection("user").document(emailtext)
                            .set(userdata)
                            .addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                                    System.out.println("성공");
                                }
                            })
                            .addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    System.out.println("실패");
                                }
                            });


                    // DocumentReference docRef = db.collection("users").document(email.getText().toString());


                   /*
                    docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                    @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if (task.isSuccessful()) {
                                DocumentSnapshot document = task.getResult();
                                if (document.exists()) {





                                    userRef.document(emailtext).set(userdata)

                                            .addOnSuccessListener(new OnSuccessListener<Void>() {
                                        @Override
                                        public void onSuccess(Void aVoid) {
                                            System.out.println("성공");
                                        }
                                    }).addOnFailureListener(new OnFailureListener() {
                                        @Override
                                        public void onFailure(@NonNull Exception e) {
                                            System.out.println("실패");
                                        }
                                    });


                                } else {
                                    System.out.println("document실패");
                                }

                            } else {
                                System.out.println("task회원가입실패");
                            }
                        }
                    });

                     */


                }

                Intent intent = new Intent (getApplicationContext() ,LoginActivity.class);
                startActivity(intent);
                registeract.finish();
            }

        });


    }
}
