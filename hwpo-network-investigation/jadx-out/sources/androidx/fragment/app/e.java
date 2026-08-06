package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.l.r;
import com.hwpo_training_app.R;
import defpackage.aa0;
import defpackage.le4;
import defpackage.m76;
import defpackage.oq1;
import defpackage.pp2;
import defpackage.qf7;
import defpackage.z90;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class e extends f implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean A;
    public int B;
    public boolean C;
    public final d D;
    public Dialog E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public Handler t;
    public final a u;
    public final b v;
    public final c w;
    public int x;
    public int y;
    public boolean z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            eVar.w.onDismiss(eVar.E);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            e eVar = e.this;
            Dialog dialog = eVar.E;
            if (dialog != null) {
                eVar.onCancel(dialog);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            e eVar = e.this;
            Dialog dialog = eVar.E;
            if (dialog != null) {
                eVar.onDismiss(dialog);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d implements qf7<m76> {
        public d() {
        }

        @Override // defpackage.qf7
        public final void a(m76 m76Var) {
            if (m76Var != null) {
                e eVar = e.this;
                if (eVar.A) {
                    View viewRequireView = eVar.requireView();
                    if (viewRequireView.getParent() != null) {
                        aa0.c("DialogFragment can not be attached to a container view");
                        return;
                    }
                    if (eVar.E != null) {
                        if (l.M(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + eVar.E);
                        }
                        eVar.E.setContentView(viewRequireView);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class C0018e extends le4 {
        public final /* synthetic */ le4 t;

        public C0018e(le4 le4Var) {
            this.t = le4Var;
        }

        @Override // defpackage.le4
        public final View b(int i) {
            le4 le4Var = this.t;
            if (le4Var.c()) {
                return le4Var.b(i);
            }
            Dialog dialog = e.this.E;
            if (dialog != null) {
                return dialog.findViewById(i);
            }
            return null;
        }

        @Override // defpackage.le4
        public final boolean c() {
            return this.t.c() || e.this.I;
        }
    }

    public e() {
        this.u = new a();
        this.v = new b();
        this.w = new c();
        this.x = 0;
        this.y = 0;
        this.z = true;
        this.A = true;
        this.B = -1;
        this.D = new d();
        this.I = false;
    }

    @Override // androidx.fragment.app.f
    public final le4 createFragmentContainer() {
        return new C0018e(super.createFragmentContainer());
    }

    public void i() {
        k(false, false);
    }

    public void j() {
        k(true, false);
    }

    public final void k(boolean z, boolean z2) {
        if (this.G) {
            return;
        }
        this.G = true;
        this.H = false;
        Dialog dialog = this.E;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.E.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.t.getLooper()) {
                    onDismiss(this.E);
                } else {
                    this.t.post(this.u);
                }
            }
        }
        this.F = true;
        if (this.B >= 0) {
            l parentFragmentManager = getParentFragmentManager();
            int i = this.B;
            parentFragmentManager.getClass();
            if (i < 0) {
                z90.a(pp2.a(i, "Bad id: "));
                return;
            } else {
                parentFragmentManager.y(parentFragmentManager.new r(null, i, 1), z);
                this.B = -1;
                return;
            }
        }
        l parentFragmentManager2 = getParentFragmentManager();
        parentFragmentManager2.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager2);
        aVar.p = true;
        aVar.k(this);
        if (z) {
            aVar.h(true, true);
        } else {
            aVar.h(false, true);
        }
    }

    public int l() {
        return this.y;
    }

    public Dialog m() {
        if (l.M(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new oq1(requireContext(), l());
    }

    public void n(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void o(l lVar, String str) {
        this.G = false;
        this.H = true;
        lVar.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(lVar);
        aVar.p = true;
        aVar.d(0, this, str, 1);
        aVar.h(false, true);
    }

    @Override // androidx.fragment.app.f
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().f(this.D);
        if (this.H) {
            return;
        }
        this.G = false;
    }

    @Override // androidx.fragment.app.f
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t = new Handler();
        this.A = this.mContainerId == 0;
        if (bundle != null) {
            this.x = bundle.getInt("android:style", 0);
            this.y = bundle.getInt("android:theme", 0);
            this.z = bundle.getBoolean("android:cancelable", true);
            this.A = bundle.getBoolean("android:showsDialog", this.A);
            this.B = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.f
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.E;
        if (dialog != null) {
            this.F = true;
            dialog.setOnDismissListener(null);
            this.E.dismiss();
            if (!this.G) {
                onDismiss(this.E);
            }
            this.E = null;
            this.I = false;
        }
    }

    @Override // androidx.fragment.app.f
    public final void onDetach() {
        super.onDetach();
        if (!this.H && !this.G) {
            this.G = true;
        }
        getViewLifecycleOwnerLiveData().i(this.D);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.F) {
            return;
        }
        if (l.M(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        k(true, true);
    }

    @Override // androidx.fragment.app.f
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z = this.A;
        if (z && !this.C) {
            if (z && !this.I) {
                try {
                    this.C = true;
                    Dialog dialogM = m();
                    this.E = dialogM;
                    if (this.A) {
                        n(dialogM, this.x);
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.E.setOwnerActivity((Activity) context);
                        }
                        this.E.setCancelable(this.z);
                        this.E.setOnCancelListener(this.v);
                        this.E.setOnDismissListener(this.w);
                        this.I = true;
                    } else {
                        this.E = null;
                    }
                    this.C = false;
                } catch (Throwable th) {
                    this.C = false;
                    throw th;
                }
            }
            if (l.M(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.E;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (l.M(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.A) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return layoutInflaterOnGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.f
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.E;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.x;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.y;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.z;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.A;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.B;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.f
    public void onStart() {
        super.onStart();
        Dialog dialog = this.E;
        if (dialog != null) {
            this.F = false;
            dialog.show();
            View decorView = this.E.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.f
    public void onStop() {
        super.onStop();
        Dialog dialog = this.E;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.f
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.E == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.E.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.f
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.E == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.E.onRestoreInstanceState(bundle2);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    public e(int i) {
        super(i);
        this.u = new a();
        this.v = new b();
        this.w = new c();
        this.x = 0;
        this.y = 0;
        this.z = true;
        this.A = true;
        this.B = -1;
        this.D = new d();
        this.I = false;
    }
}
