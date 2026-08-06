package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.ChooseTimeEditText;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rb3 extends hx4 {
    public ld3 A;
    public kx3.b B;
    public final vg4 C = new vg4(new k());
    public final shb D;
    public final o7a E;
    public final o7a F;
    public final o7a G;
    public final o7a H;
    public final o7a I;
    public final xy7 J;
    public static final /* synthetic */ ho5<Object>[] K = {new ne8(rb3.class, "binding", "getBinding()Lcom/hwpo_training_app/edit_performance/databinding/FragmentEditPerformanceBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static rb3 a(int i, int i2, boolean z, tc8 tc8Var, zc8 zc8Var, boolean z2, String str) {
            tc8Var.getClass();
            zc8Var.getClass();
            rb3 rb3Var = new rb3();
            rb3Var.setArguments(uy0.c(new js7("PROGRAM_ID_KEY", Integer.valueOf(i)), new js7("SESSION_ID_KEY", Integer.valueOf(i2)), new js7("IS_PERFORMANCE_COMPLETED_KEY", Boolean.valueOf(z)), new js7("INIT_PERFORMANCE_KEY", tc8Var), new js7("INIT_SCORE_KEY", zc8Var), new js7("SHOULD_LOAD_SESSION_DETAILS", Boolean.valueOf(z2)), new js7("TITLE", str)));
            return rb3Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            pc3 pc3Var = (pc3) this.receiver;
            pc3Var.getClass();
            oy0.d(rhb.b(pc3Var), null, null, new yc3(pc3Var, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c extends pi4 implements oh4<l89, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(l89 l89Var) {
            l89 l89Var2 = l89Var;
            l89Var2.getClass();
            pc3 pc3Var = (pc3) this.receiver;
            pc3Var.getClass();
            oy0.d(rhb.b(pc3Var), null, null, new dd3(l89Var2, pc3Var, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class d extends pi4 implements oh4<l89, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(l89 l89Var) {
            l89 l89Var2 = l89Var;
            l89Var2.getClass();
            pc3 pc3Var = (pc3) this.receiver;
            pc3Var.getClass();
            oy0.d(rhb.b(pc3Var), null, null, new gd3(l89Var2, pc3Var, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.edit_performance.presentation.EditPerformanceFragment$initListeners$1$2", f = "EditPerformanceFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public e(r02<? super e> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return rb3.this.new e(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            rb3 rb3Var = rb3.this;
            xy7 xy7Var = rb3Var.J;
            androidx.fragment.app.l childFragmentManager = rb3Var.getChildFragmentManager();
            childFragmentManager.getClass();
            xy7Var.s(childFragmentManager);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.edit_performance.presentation.EditPerformanceFragment$initListeners$1$3", f = "EditPerformanceFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public f(r02<? super f> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return rb3.this.new f(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = rb3.Companion;
            pc3 pc3VarS = rb3.this.s();
            oy0.d(rhb.b(pc3VarS), null, null, new fd3(pc3VarS, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.edit_performance.presentation.EditPerformanceFragment$initListeners$1$4", f = "EditPerformanceFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public g(r02<? super g> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return rb3.this.new g(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = rb3.Companion;
            pc3 pc3VarS = rb3.this.s();
            if (yx.b(pc3VarS.b().a) || pc3VarS.b().b.B) {
                pc3VarS.f(sc3.b);
            } else if (pc3VarS.b().k) {
                oy0.d(rhb.b(pc3VarS), null, null, new kd3(pc3VarS, null), 3);
            } else if (!pc3VarS.b().k) {
                oy0.d(rhb.b(pc3VarS), null, null, new zc3(pc3VarS, null), 3);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class i extends pi4 implements oh4<l89, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(l89 l89Var) {
            l89 l89Var2 = l89Var;
            l89Var2.getClass();
            pc3 pc3Var = (pc3) this.receiver;
            pc3Var.getClass();
            oy0.d(rhb.b(pc3Var), null, null, new dd3(l89Var2, pc3Var, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class j extends pi4 implements oh4<l89, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(l89 l89Var) {
            l89 l89Var2 = l89Var;
            l89Var2.getClass();
            pc3 pc3Var = (pc3) this.receiver;
            pc3Var.getClass();
            oy0.d(rhb.b(pc3Var), null, null, new gd3(l89Var2, pc3Var, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k implements oh4<rb3, pe4> {
        @Override // defpackage.oh4
        public final pe4 invoke(rb3 rb3Var) {
            rb3 rb3Var2 = rb3Var;
            rb3Var2.getClass();
            return pe4.bind(rb3Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class l extends wp5 implements mh4<androidx.fragment.app.f> {
        public l() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return rb3.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class m extends wp5 implements mh4<whb> {
        public final /* synthetic */ l u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l lVar) {
            super(0);
            this.u = lVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class n extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class o extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final lb2 invoke() {
            whb whbVar = (whb) this.u.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return wt4Var != null ? wt4Var.getDefaultViewModelCreationExtras() : lb2.a.b;
        }
    }

    public rb3() {
        int i2 = 0;
        pb3 pb3Var = new pb3(i2, this);
        ss5 ss5VarC = hv5.c(j26.u, new m(new l()));
        this.D = new shb(ll8.a(pc3.class), new n(ss5VarC), pb3Var, new o(ss5VarC));
        this.E = new o7a(new qb3(i2, this));
        this.F = new o7a(new mh4() { // from class: ta3
            @Override // defpackage.mh4
            public final Object invoke() {
                rb3.a aVar = rb3.Companion;
                de1 de1Var = new de1();
                de1Var.J = new rb3.b(0, this.t.s(), pc3.class, "clearPerformance", "clearPerformance()V", 0);
                return de1Var;
            }
        });
        this.G = new o7a(new ua3());
        this.H = new o7a(new bq1(1, this));
        this.I = new o7a(new va3(i2, this));
        this.J = new xy7();
    }

    public static void p(rb3 rb3Var, String str, Bundle bundle) {
        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("arg_dialog_media_library_selected_ids", t60.class) : bundle.getParcelableArrayList("arg_dialog_media_library_selected_ids");
        if (parcelableArrayList == null) {
            z90.a("Required value was null.");
            return;
        }
        pc3 pc3VarS = rb3Var.s();
        ArrayList arrayList = new ArrayList(ph1.n(parcelableArrayList, 10));
        int size = parcelableArrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = parcelableArrayList.get(i2);
            i2++;
            t60 t60Var = (t60) obj;
            long j2 = t60Var.t;
            String str2 = t60Var.u;
            u60 u60Var = t60Var.v;
            String str3 = t60Var.w;
            String str4 = t60Var.x;
            String str5 = BuildConfig.FLAVOR;
            if (str4 == null) {
                str4 = BuildConfig.FLAVOR;
            }
            String str6 = t60Var.y;
            if (str6 == null) {
                str6 = BuildConfig.FLAVOR;
            }
            String str7 = t60Var.z;
            ArrayList arrayList2 = parcelableArrayList;
            String str8 = t60Var.A;
            if (str8 != null) {
                str5 = str8;
            }
            Long l2 = t60Var.B;
            arrayList.add(new l89(j2, str2, u60Var, str3, str4, str6, str7, str5, l2 != null ? l2.longValue() : 0L, t60Var.C, s60.t, z60.w, null, null));
            parcelableArrayList = arrayList2;
        }
        pc3VarS.e(new pc3.a.l(th1.K(arrayList, pc3VarS.b().c.v)));
    }

    public static ld3 q(rb3 rb3Var) {
        Parcelable parcelable;
        Parcelable parcelable2;
        ld3 ld3Var = rb3Var.A;
        if (ld3Var == null) {
            xj5.e("viewModelFactory");
            throw null;
        }
        Bundle bundleRequireArguments = rb3Var.requireArguments();
        bundleRequireArguments.getClass();
        ld3Var.q = bundleRequireArguments.getInt("PROGRAM_ID_KEY", -1);
        ld3Var.r = bundleRequireArguments.getInt("SESSION_ID_KEY", -1);
        ld3Var.s = bundleRequireArguments.getBoolean("IS_PERFORMANCE_COMPLETED_KEY", false);
        ld3Var.t = bundleRequireArguments.getBoolean("SHOULD_LOAD_SESSION_DETAILS");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            parcelable = (Parcelable) bundleRequireArguments.getParcelable("INIT_PERFORMANCE_KEY", tc8.class);
        } else {
            Parcelable parcelable3 = bundleRequireArguments.getParcelable("INIT_PERFORMANCE_KEY");
            if (!(parcelable3 instanceof tc8)) {
                parcelable3 = null;
            }
            parcelable = (tc8) parcelable3;
        }
        if (parcelable == null) {
            z90.a("Required value was null.");
            return null;
        }
        ld3Var.v = (tc8) parcelable;
        if (i2 >= 33) {
            parcelable2 = (Parcelable) bundleRequireArguments.getParcelable("INIT_SCORE_KEY", zc8.class);
        } else {
            Parcelable parcelable4 = bundleRequireArguments.getParcelable("INIT_SCORE_KEY");
            if (!(parcelable4 instanceof zc8)) {
                parcelable4 = null;
            }
            parcelable2 = (zc8) parcelable4;
        }
        if (parcelable2 == null) {
            z90.a("Required value was null.");
            return null;
        }
        ld3Var.w = (zc8) parcelable2;
        String string = bundleRequireArguments.getString("TITLE", rb3Var.getString(R.string.notes));
        string.getClass();
        ld3Var.u = string;
        return ld3Var;
    }

    @Override // defpackage.hk0
    public final void i() {
        pe4 pe4VarR = r();
        pc3 pc3VarS = s();
        r54 r54VarD = xgb.d(pe4VarR.i);
        r54VarD.getClass();
        yk2.o(new k74(r54VarD, new ed3(pc3VarS, null)), rhb.b(pc3VarS));
        pe4VarR.p.setNavigationOnClickListener(new View.OnClickListener() { // from class: za3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rb3.a aVar = rb3.Companion;
                this.t.j();
            }
        });
        xgb.a(pe4VarR.c, new e(null));
        xgb.a(pe4VarR.l, new f(null));
        xgb.a(pe4VarR.b, new g(null));
        pe4VarR.m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ab3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                rb3.a aVar = rb3.Companion;
                compoundButton.getClass();
                pc3 pc3VarS2 = this.a.s();
                pc3VarS2.e(new pc3.a.i(zc8.a(pc3VarS2.b().d, dd8.a(pc3VarS2.b().d.z, 0.0d, null, null, 0, 0, z, false, false, 895))));
            }
        });
        pe4VarR.g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: bb3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                rb3.a aVar = rb3.Companion;
                compoundButton.getClass();
                pc3 pc3VarS2 = this.a.s();
                pc3VarS2.e(new pc3.a.i(zc8.a(pc3VarS2.b().d, dd8.a(pc3VarS2.b().d.z, 0.0d, null, null, 0, 0, false, z, false, 767))));
            }
        });
        pe4VarR.h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: db3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                rb3.a aVar = rb3.Companion;
                compoundButton.getClass();
                pc3 pc3VarS2 = this.a.s();
                pc3VarS2.e(new pc3.a.i(zc8.a(pc3VarS2.b().d, dd8.a(pc3VarS2.b().d.z, 0.0d, null, null, 0, 0, false, false, z, 511))));
            }
        });
        pe4VarR.i.addTextChangedListener(new h(pe4VarR, this));
        getChildFragmentManager().f0("result_dialog_confirm", getViewLifecycleOwner(), new pf4() { // from class: eb3
            @Override // defpackage.pf4
            public final void d(Bundle bundle, String str) {
                rb3.a aVar = rb3.Companion;
                if (bundle.getBoolean("arg_dialog_is_confirmed")) {
                    this.t.s().z.b();
                }
            }
        });
    }

    @Override // defpackage.hk0
    public final void j() {
        pc3 pc3VarS = s();
        if (pc3VarS.i()) {
            pc3VarS.f(wc3.b);
        } else {
            pc3VarS.z.b();
        }
    }

    @Override // androidx.fragment.app.f
    public final void onStop() {
        super.onStop();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        View view = getView();
        Object systemService = contextRequireContext.getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view != null ? view.getWindowToken() : null, 0);
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new fb3(), view2);
        }
        int dimension = (int) getResources().getDimension(R.dimen.default_margin);
        RecyclerView recyclerView = r().d;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 4));
        recyclerView.h(new xo4(dimension, 4));
        recyclerView.setAdapter((vm6) this.H.getValue());
        recyclerView.setItemAnimator(null);
        RecyclerView recyclerView2 = r().e;
        recyclerView2.setLayoutManager(new GridLayoutManager(recyclerView2.getContext(), 2));
        recyclerView2.h(new xo4(dimension, 2));
        recyclerView2.setAdapter((iw3) this.I.getValue());
        recyclerView2.setItemAnimator(null);
        int i2 = 0;
        gb3 gb3Var = new gb3(i2, this);
        xy7 xy7Var = this.J;
        xy7Var.getClass();
        xy7Var.K = gb3Var;
        xy7Var.L = new hb3(i2, this);
        int i3 = 1;
        xy7Var.M = new qw(i3, this);
        xy7Var.N = new ib3(i2, this);
        kx3 kx3Var = (kx3) this.E.getValue();
        y31 y31Var = new y31(i3, this);
        kx3Var.getClass();
        kx3Var.B = y31Var;
        xgb.a(r().q, new sb3(this, null));
        r().i.setOnTouchListener(new sa3());
        s().O.e(getViewLifecycleOwner(), new tb3(new wb3(this)));
        s().P.e(getViewLifecycleOwner(), new tb3(new xb3(this)));
        s().Q.e(getViewLifecycleOwner(), new tb3(new yb3(this)));
        s().R.e(getViewLifecycleOwner(), new tb3(new zb3(this)));
        s().S.e(getViewLifecycleOwner(), new tb3(new ac3(this)));
        s().T.e(getViewLifecycleOwner(), new tb3(new bc3(this)));
        s().U.e(getViewLifecycleOwner(), new tb3(new cc3(this)));
        s().V.e(getViewLifecycleOwner(), new tb3(new dc3(this)));
        s().W.e(getViewLifecycleOwner(), new tb3(new me(i3, this)));
        s().X.e(getViewLifecycleOwner(), new tb3(new ub3(this)));
        s().Y.e(getViewLifecycleOwner(), new tb3(new vb3(r().p)));
        pc3 pc3VarS = s();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        pc3VarS.c(viewLifecycleOwner, new jb3(i2, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final pe4 r() {
        return (pe4) this.C.a(this, K[0]);
    }

    public final pc3 s() {
        return (pc3) this.D.getValue();
    }

    public final void t(LinearLayoutCompat linearLayoutCompat, final int i2, final int i3, String str, String str2) {
        ks5 ks5VarInflate = ks5.inflate(LayoutInflater.from(getContext()));
        ks5VarInflate.getClass();
        ChooseTimeEditText chooseTimeEditText = ks5VarInflate.c;
        chooseTimeEditText.setText(str);
        ChooseTimeEditText chooseTimeEditText2 = ks5VarInflate.b;
        chooseTimeEditText2.setText(str2);
        linearLayoutCompat.addView(ks5VarInflate.a);
        od3.c(chooseTimeEditText2, false, i3, new oh4() { // from class: xa3
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                String string;
                Editable editable = (Editable) obj;
                rb3.a aVar = rb3.Companion;
                if (editable != null && (string = editable.toString()) != null) {
                    this.t.s().l(i2, i3, string);
                }
                return g2b.a;
            }
        }, 6);
        od3.c(chooseTimeEditText, false, 0, new oh4() { // from class: ya3
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                String string;
                Editable editable = (Editable) obj;
                rb3.a aVar = rb3.Companion;
                if (editable != null && (string = editable.toString()) != null) {
                    pc3 pc3VarS = this.t.s();
                    pc3.b bVar = pc3.Companion;
                    pc3VarS.m(i2, Integer.MAX_VALUE, string);
                }
                return g2b.a;
            }
        }, 14);
    }

    public final void u(LinearLayoutCompat linearLayoutCompat, final int i2, String str) {
        ms5 ms5VarInflate = ms5.inflate(LayoutInflater.from(getContext()));
        ms5VarInflate.getClass();
        ChooseTimeEditText chooseTimeEditText = ms5VarInflate.b;
        chooseTimeEditText.setText(str);
        chooseTimeEditText.setCursorVisible(true);
        linearLayoutCompat.addView(ms5VarInflate.a);
        su0.c(chooseTimeEditText, new oh4() { // from class: cb3
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                Editable editable = (Editable) obj;
                rb3.a aVar = rb3.Companion;
                if (editable != null) {
                    this.t.s().n(i2, editable.toString());
                }
                return g2b.a;
            }
        });
    }

    public final void v(LinearLayoutCompat linearLayoutCompat, boolean z, final int i2, String str) {
        ns5 ns5VarInflate = ns5.inflate(LayoutInflater.from(getContext()));
        ns5VarInflate.getClass();
        ChooseTimeEditText chooseTimeEditText = ns5VarInflate.b;
        chooseTimeEditText.setInputType(z ? 8194 : 2);
        od3.c(chooseTimeEditText, z, 0, new oh4() { // from class: wa3
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                Editable editable = (Editable) obj;
                rb3.a aVar = rb3.Companion;
                if (editable != null) {
                    this.t.s().n(i2, editable.toString());
                }
                return g2b.a;
            }
        }, 14);
        chooseTimeEditText.setText(str);
        linearLayoutCompat.addView(ns5VarInflate.a);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h implements TextWatcher {
        public final /* synthetic */ pe4 t;
        public final /* synthetic */ rb3 u;

        public h(pe4 pe4Var, rb3 rb3Var) {
            this.t = pe4Var;
            this.u = rb3Var;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            this.t.j.setText(this.u.getString(R.string.notes_symbols_count, Integer.valueOf(editable != null ? editable.length() : 0)));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
