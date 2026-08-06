package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class oq1 extends Dialog implements m76, bh7, f87, f19 {
    public n76 t;
    public final c19 u;
    public final o7a v;
    public final o7a w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq1(Context context, int i) {
        super(context, i);
        context.getClass();
        this.u = new c19(new e19(this, new s97(1, this)));
        int i2 = 0;
        this.v = new o7a(new lq1(i2, this));
        this.w = new o7a(new mq1(i2, this));
    }

    public static void a(oq1 oq1Var) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.addContentView(view, layoutParams);
    }

    public final n76 b() {
        n76 n76Var = this.t;
        if (n76Var != null) {
            return n76Var;
        }
        n76 n76Var2 = new n76(this, true);
        this.t = n76Var2;
        return n76Var2;
    }

    public final void c() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.m76
    public final s66 getLifecycle() {
        return b();
    }

    @Override // defpackage.f87
    public final e87 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().c().c;
    }

    @Override // defpackage.bh7
    public final zg7 getOnBackPressedDispatcher() {
        return (zg7) this.w.getValue();
    }

    @Override // defpackage.f19
    public final b19 getSavedStateRegistry() {
        return this.u.b;
    }

    @Override // android.app.Dialog
    @gy2
    public final void onBackPressed() {
        ((z03) this.v.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            zg7 onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            onBackPressedDispatcher.d(onBackInvokedDispatcher);
        }
        this.u.b(bundle);
        b().f(s66.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.u.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().f(s66.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().f(s66.a.ON_DESTROY);
        this.t = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.setContentView(view, layoutParams);
    }
}
