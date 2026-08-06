package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class rz extends oq1 implements yy {
    public gz x;
    public final qz y;

    /* JADX WARN: Type inference failed for: r2v2, types: [qz] */
    public rz(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.y = new oo5.a() { // from class: qz
            @Override // oo5.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.t.e(keyEvent);
            }
        };
        dz dzVarD = d();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((gz) dzVarD).n0 = i;
        dzVarD.o();
    }

    @Override // defpackage.oq1, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        d().c(view, layoutParams);
    }

    public final dz d() {
        if (this.x == null) {
            dz.c cVar = dz.t;
            this.x = new gz(getContext(), getWindow(), this, this);
        }
        return this.x;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().p();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return oo5.b(this.y, getWindow().getDecorView(), this, keyEvent);
    }

    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i) {
        return (T) d().e(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().l();
    }

    @Override // defpackage.oq1, android.app.Dialog
    public void onCreate(Bundle bundle) {
        d().k();
        super.onCreate(bundle);
        d().o();
    }

    @Override // defpackage.oq1, android.app.Dialog
    public final void onStop() {
        super.onStop();
        d().t();
    }

    @Override // defpackage.yy
    public final u8 onWindowStartingSupportActionMode(u8.a aVar) {
        return null;
    }

    @Override // defpackage.oq1, android.app.Dialog
    public void setContentView(int i) {
        c();
        d().w(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        d().B(getContext().getString(i));
    }

    @Override // defpackage.oq1, android.app.Dialog
    public void setContentView(View view) {
        c();
        d().x(view);
    }

    @Override // defpackage.oq1, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        d().y(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().B(charSequence);
    }

    @Override // defpackage.yy
    public final void onSupportActionModeFinished(u8 u8Var) {
    }

    @Override // defpackage.yy
    public final void onSupportActionModeStarted(u8 u8Var) {
    }
}
