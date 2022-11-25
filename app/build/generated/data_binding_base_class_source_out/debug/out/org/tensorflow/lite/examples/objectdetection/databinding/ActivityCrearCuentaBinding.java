// Generated by view binder compiler. Do not edit!
package org.tensorflow.lite.examples.objectdetection.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.tensorflow.lite.examples.objectdetection.R;

public final class ActivityCrearCuentaBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton crearCuentaBtnCerrar;

  @NonNull
  public final EditText crearcuentaApellidos;

  @NonNull
  public final Button crearcuentaBtnCrearCuenta;

  @NonNull
  public final EditText crearcuentaEmail;

  @NonNull
  public final ImageView crearcuentaLogo;

  @NonNull
  public final EditText crearcuentaNombre;

  @NonNull
  public final EditText crearcuentaPassword;

  @NonNull
  public final TextView crearcuentaTitulo;

  @NonNull
  public final TextView crearcuentaTituloApp;

  private ActivityCrearCuentaBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton crearCuentaBtnCerrar, @NonNull EditText crearcuentaApellidos,
      @NonNull Button crearcuentaBtnCrearCuenta, @NonNull EditText crearcuentaEmail,
      @NonNull ImageView crearcuentaLogo, @NonNull EditText crearcuentaNombre,
      @NonNull EditText crearcuentaPassword, @NonNull TextView crearcuentaTitulo,
      @NonNull TextView crearcuentaTituloApp) {
    this.rootView = rootView;
    this.crearCuentaBtnCerrar = crearCuentaBtnCerrar;
    this.crearcuentaApellidos = crearcuentaApellidos;
    this.crearcuentaBtnCrearCuenta = crearcuentaBtnCrearCuenta;
    this.crearcuentaEmail = crearcuentaEmail;
    this.crearcuentaLogo = crearcuentaLogo;
    this.crearcuentaNombre = crearcuentaNombre;
    this.crearcuentaPassword = crearcuentaPassword;
    this.crearcuentaTitulo = crearcuentaTitulo;
    this.crearcuentaTituloApp = crearcuentaTituloApp;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCrearCuentaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCrearCuentaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_crear_cuenta, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCrearCuentaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.crearCuenta_btnCerrar;
      ImageButton crearCuentaBtnCerrar = ViewBindings.findChildViewById(rootView, id);
      if (crearCuentaBtnCerrar == null) {
        break missingId;
      }

      id = R.id.crearcuenta_apellidos;
      EditText crearcuentaApellidos = ViewBindings.findChildViewById(rootView, id);
      if (crearcuentaApellidos == null) {
        break missingId;
      }

      id = R.id.crearcuenta_btnCrearCuenta;
      Button crearcuentaBtnCrearCuenta = ViewBindings.findChildViewById(rootView, id);
      if (crearcuentaBtnCrearCuenta == null) {
        break missingId;
      }

      id = R.id.crearcuenta_email;
      EditText crearcuentaEmail = ViewBindings.findChildViewById(rootView, id);
      if (crearcuentaEmail == null) {
        break missingId;
      }

      id = R.id.crearcuenta_logo;
      ImageView crearcuentaLogo = ViewBindings.findChildViewById(rootView, id);
      if (crearcuentaLogo == null) {
        break missingId;
      }

      id = R.id.crearcuenta_nombre;
      EditText crearcuentaNombre = ViewBindings.findChildViewById(rootView, id);
      if (crearcuentaNombre == null) {
        break missingId;
      }

      id = R.id.crearcuenta_password;
      EditText crearcuentaPassword = ViewBindings.findChildViewById(rootView, id);
      if (crearcuentaPassword == null) {
        break missingId;
      }

      id = R.id.crearcuenta_titulo;
      TextView crearcuentaTitulo = ViewBindings.findChildViewById(rootView, id);
      if (crearcuentaTitulo == null) {
        break missingId;
      }

      id = R.id.crearcuenta_tituloApp;
      TextView crearcuentaTituloApp = ViewBindings.findChildViewById(rootView, id);
      if (crearcuentaTituloApp == null) {
        break missingId;
      }

      return new ActivityCrearCuentaBinding((ConstraintLayout) rootView, crearCuentaBtnCerrar,
          crearcuentaApellidos, crearcuentaBtnCrearCuenta, crearcuentaEmail, crearcuentaLogo,
          crearcuentaNombre, crearcuentaPassword, crearcuentaTitulo, crearcuentaTituloApp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}