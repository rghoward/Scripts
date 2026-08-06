package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.a;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bu7 extends fg3 {
    public final int e;
    public EditText f;
    public final au7 g;

    /* JADX WARN: Type inference failed for: r1v2, types: [au7] */
    public bu7(a aVar, int i) {
        super(aVar);
        this.e = R.drawable.design_password_eye;
        this.g = new View.OnClickListener() { // from class: au7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bu7 bu7Var = this.t;
                EditText editText = bu7Var.f;
                if (editText == null) {
                    return;
                }
                int selectionEnd = editText.getSelectionEnd();
                EditText editText2 = bu7Var.f;
                boolean z = editText2 != null && (editText2.getTransformationMethod() instanceof PasswordTransformationMethod);
                EditText editText3 = bu7Var.f;
                if (z) {
                    editText3.setTransformationMethod(null);
                } else {
                    editText3.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    bu7Var.f.setSelection(selectionEnd);
                }
                bu7Var.p();
            }
        };
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.fg3
    public final void b() {
        p();
    }

    @Override // defpackage.fg3
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.fg3
    public final int d() {
        return this.e;
    }

    @Override // defpackage.fg3
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.fg3
    public final boolean j() {
        return true;
    }

    @Override // defpackage.fg3
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.fg3
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.fg3
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.fg3
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
