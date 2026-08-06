package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.fragment.app.l;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.intercom.twig.BuildConfig;
import j$.time.LocalDate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fi3 extends ix4 {
    public kx3.b A;
    public final o7a B;
    public final vg4 C = new vg4(new n());
    public final shb D;
    public final xy7 E;
    public final o7a F;
    public k G;
    public boolean H;
    public final o7a I;
    public final o7a J;
    public static final /* synthetic */ ho5<Object>[] K = {new ne8(fi3.class, "binding", "getBinding()Lcom/hwpo_training_app/tracking/databinding/FragmentEnterValueBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static fi3 a(ebb ebbVar, boolean z, Integer num, LocalDate localDate, String str, vn0 vn0Var, List list) {
            ebbVar.getClass();
            list.getClass();
            fi3 fi3Var = new fi3();
            Bundle bundle = new Bundle();
            bundle.putSerializable("com.fitr_training.tracking.presentation.enter_value.EnterValueFragment.VALUE_TYPE", ebbVar);
            bundle.putSerializable("com.fitr_training.tracking.presentation.enter_value.EnterValueFragment.DATE", localDate);
            bundle.putString("com.fitr_training.tracking.presentation.enter_value.EnterValueFragment.NOTE", str);
            bundle.putParcelable("com.fitr_training.tracking.presentation.enter_value.EnterValueFragment.VALUE", vn0Var);
            if (num != null) {
                bundle.putInt("com.fitr_training.tracking.presentation.enter_value.EnterValueFragment.VALUE_ID", num.intValue());
            }
            bundle.putParcelableArrayList("com.fitr_training.tracking.presentation.enter_value.EnterValueFragment.ATTACHMENTS", new ArrayList<>(list));
            bundle.putBoolean("com.fitr_training.tracking.presentation.enter_value.EnterValueFragment.IS_FROM_VALUE_DETAILS", z);
            fi3Var.setArguments(bundle);
            return fi3Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends wa implements oh4<l89, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(l89 l89Var) {
            l89 l89Var2 = l89Var;
            l89Var2.getClass();
            fj3 fj3Var = (fj3) this.receiver;
            fj3Var.getClass();
            oy0.d(rhb.b(fj3Var), null, null, new kj3(l89Var2, fj3Var, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c extends wa implements oh4<l89, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(l89 l89Var) {
            l89 l89Var2 = l89Var;
            l89Var2.getClass();
            fj3 fj3Var = (fj3) this.receiver;
            fj3Var.getClass();
            oy0.d(rhb.b(fj3Var), null, null, new lj3(l89Var2, fj3Var, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.enter_value.EnterValueFragment$initListeners$1$10", f = "EnterValueFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public d(r02<? super d> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return fi3.this.new d(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            fi3 fi3Var = fi3.this;
            xy7 xy7Var = fi3Var.E;
            androidx.fragment.app.l childFragmentManager = fi3Var.getChildFragmentManager();
            childFragmentManager.getClass();
            xy7Var.s(childFragmentManager);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.enter_value.EnterValueFragment$initListeners$1$11", f = "EnterValueFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public e(r02<? super e> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return fi3.this.new e(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = fi3.Companion;
            fj3 fj3VarR = fi3.this.r();
            LocalDate localDateNow = LocalDate.now();
            LocalDate localDate = fj3VarR.b().g;
            if (localDate == null) {
                localDate = localDateNow;
            }
            localDate.getClass();
            localDateNow.getClass();
            fj3VarR.f(new wh3.a(localDate, localDateNow));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class f extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            fj3 fj3Var = (fj3) this.receiver;
            fj3Var.getClass();
            fj3Var.f(wh3.d.b);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class g extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() throws IOException {
            ((kx3) this.receiver).c();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class h extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            ((kx3) this.receiver).d();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class i extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            ((kx3) this.receiver).b();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.enter_value.EnterValueFragment$initListeners$1$9", f = "EnterValueFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class j extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public j(r02<? super j> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return fi3.this.new j(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            String string;
            dv8.b(obj);
            a aVar = fi3.Companion;
            fj3 fj3VarR = fi3.this.r();
            vn0 vn0Var = fj3VarR.b().c;
            if (vn0Var != null) {
                xn0 xn0Var = vn0Var.z;
                js7<Integer, Integer> js7VarG = xn0Var == xn0.D ? wn0.g(fj3VarR.b().d) : new js7<>(wn0.b(xn0Var, fj3VarR.b().d, vn0Var.y), null);
                Integer num = js7VarG.t;
                Integer num2 = js7VarG.u;
                ebb ebbVar = fj3VarR.J;
                Integer num3 = fj3VarR.M;
                int iIntValue = num3 != null ? num3.intValue() : vn0Var.t;
                LocalDate localDate = fj3VarR.b().g;
                if (localDate == null || (string = localDate.toString()) == null) {
                    string = BuildConfig.FLAVOR;
                }
                String str = string;
                m2b m2bVar = vn0Var.y;
                String str2 = fj3VarR.b().k;
                List<l89> list = fj3VarR.b().h;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((l89) obj2).E == z60.w) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    arrayList2.add(Long.valueOf(((l89) obj3).t));
                }
                a4b a4bVar = new a4b(ebbVar, iIntValue, str, m2bVar, num, num2, str2, arrayList2);
                fj3VarR.e(vh3.d.a);
                oy0.d(rhb.b(fj3VarR), null, null, new nj3(fj3VarR, a4bVar, null), 3);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class l extends wa implements oh4<l89, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(l89 l89Var) {
            l89 l89Var2 = l89Var;
            l89Var2.getClass();
            fj3 fj3Var = (fj3) this.receiver;
            fj3Var.getClass();
            oy0.d(rhb.b(fj3Var), null, null, new kj3(l89Var2, fj3Var, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class m extends wa implements oh4<l89, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(l89 l89Var) {
            l89 l89Var2 = l89Var;
            l89Var2.getClass();
            fj3 fj3Var = (fj3) this.receiver;
            fj3Var.getClass();
            oy0.d(rhb.b(fj3Var), null, null, new lj3(l89Var2, fj3Var, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class n implements oh4<fi3, qe4> {
        @Override // defpackage.oh4
        public final qe4 invoke(fi3 fi3Var) {
            fi3 fi3Var2 = fi3Var;
            fi3Var2.getClass();
            return qe4.bind(fi3Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class o extends wp5 implements mh4<androidx.fragment.app.f> {
        public o() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return fi3.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class p extends wp5 implements mh4<whb> {
        public final /* synthetic */ o u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(o oVar) {
            super(0);
            this.u = oVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class q extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class r extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ss5 ss5Var) {
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

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class s extends wp5 implements mh4<thb.c> {
        public final /* synthetic */ ss5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ss5 ss5Var) {
            super(0);
            this.v = ss5Var;
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            thb.c defaultViewModelProviderFactory;
            whb whbVar = (whb) this.v.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? fi3.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public fi3() {
        int i2 = 1;
        this.B = new o7a(new oj(i2, this));
        ss5 ss5VarC = hv5.c(j26.u, new p(new o()));
        this.D = new shb(ll8.a(fj3.class), new q(ss5VarC), new s(ss5VarC), new r(ss5VarC));
        this.E = new xy7();
        this.F = new o7a(new jd2(1, this));
        this.I = new o7a(new zh3(0, this));
        this.J = new o7a(new ld2(i2, this));
    }

    public static void p(fi3 fi3Var, String str, Bundle bundle) {
        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("arg_dialog_media_library_selected_ids", t60.class) : bundle.getParcelableArrayList("arg_dialog_media_library_selected_ids");
        if (parcelableArrayList == null) {
            z90.a("Required value was null.");
            return;
        }
        fj3 fj3VarR = fi3Var.r();
        ArrayList arrayList = new ArrayList(ph1.n(parcelableArrayList, 10));
        int size = parcelableArrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = parcelableArrayList.get(i2);
            i2++;
            t60 t60Var = (t60) obj;
            t60Var.getClass();
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
        fj3VarR.e(new vh3.f(th1.K(arrayList, fj3VarR.b().h)));
    }

    @Override // defpackage.hk0
    public final void i() {
        qe4 qe4VarQ = q();
        f fVar = new f(0, r(), fj3.class, "onOpenMyMediaLibraryClicked", "onOpenMyMediaLibraryClicked()V", 0);
        xy7 xy7Var = this.E;
        xy7Var.getClass();
        xy7Var.K = fVar;
        o7a o7aVar = this.B;
        xy7Var.L = new g(0, (kx3) o7aVar.getValue(), kx3.class, "pickImageFromCamera", "pickImageFromCamera()V", 0);
        xy7Var.M = new h(0, (kx3) o7aVar.getValue(), kx3.class, "pickVideoFromCamera", "pickVideoFromCamera()V", 0);
        xy7Var.N = new i(0, (kx3) o7aVar.getValue(), kx3.class, "pickFileOrMedia", "pickFileOrMedia()V", 0);
        qe4VarQ.l.setNavigationOnClickListener(new View.OnClickListener() { // from class: ci3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fi3.a aVar = fi3.Companion;
                this.t.j();
            }
        });
        kx3 kx3Var = (kx3) o7aVar.getValue();
        oh4<? super kx3.c, g2b> oh4Var = new oh4() { // from class: di3
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                kx3.c cVar = (kx3.c) obj;
                fi3.a aVar = fi3.Companion;
                cVar.getClass();
                boolean z = cVar instanceof kx3.c.b;
                fi3 fi3Var = this.t;
                if (z) {
                    fj3 fj3VarR = fi3Var.r();
                    List<rc9> list = ((kx3.c.b) cVar).a;
                    list.getClass();
                    for (rc9 rc9Var : list) {
                        int iOrdinal = rc9Var.a.ordinal();
                        oy0.d(rhb.b(fj3VarR), null, null, new gj3(iOrdinal != 0 ? iOrdinal != 1 ? u60.w : u60.u : u60.v, rc9Var, fj3VarR, null), 3);
                    }
                } else {
                    if (!(cVar instanceof kx3.c.a)) {
                        u.b();
                        return null;
                    }
                    fi3Var.m(((kx3.c.a) cVar).a);
                }
                return g2b.a;
            }
        };
        kx3Var.getClass();
        kx3Var.B = oh4Var;
        getChildFragmentManager().f0("result_dialog_media_library", getViewLifecycleOwner(), new z20(this));
        getChildFragmentManager().f0("result_dialog_confirm", getViewLifecycleOwner(), new ei3(this));
        xgb.a(qe4VarQ.e, new j(null));
        xgb.a(qe4VarQ.b, new d(null));
        xgb.a(qe4VarQ.f, new e(null));
        TextInputEditText textInputEditText = qe4VarQ.h;
        k kVar = new k();
        textInputEditText.addTextChangedListener(kVar);
        this.G = kVar;
        fj3 fj3VarR = r();
        zl9<HashMap<Integer, String>> benchmarkUpdatesFlow = qe4VarQ.d.getBenchmarkUpdatesFlow();
        benchmarkUpdatesFlow.getClass();
        yk2.o(new k74(yk2.h(benchmarkUpdatesFlow, 300L), new jj3(fj3VarR, null)), rhb.b(fj3VarR));
    }

    @Override // defpackage.hk0
    public final void j() {
        fj3 fj3VarR = r();
        List<l89> list = fj3VarR.b().h;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((l89) it.next()).E == z60.u) {
                    fj3VarR.f(wh3.e.b);
                    return;
                }
            }
        }
        fj3VarR.x.a();
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        qe4 qe4VarQ = q();
        int dimension = (int) getResources().getDimension(R.dimen.default_margin);
        RecyclerView recyclerView = qe4VarQ.c;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 4));
        recyclerView.h(new xo4(dimension, 4));
        recyclerView.setAdapter((vm6) this.I.getValue());
        recyclerView.setItemAnimator(null);
        RecyclerView recyclerView2 = qe4VarQ.g;
        recyclerView2.setLayoutManager(new GridLayoutManager(recyclerView2.getContext(), 2));
        recyclerView2.h(new xo4(dimension, 2));
        recyclerView2.setAdapter((iw3) this.J.getValue());
        recyclerView2.setItemAnimator(null);
        q().h.setOnTouchListener(new bi3());
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new ai3(), view2);
            g2b g2bVar = g2b.a;
        }
        fj3 fj3VarR = r();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        fj3VarR.c(viewLifecycleOwner, new oh4() { // from class: xh3
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                gm3 gm3Var = (gm3) obj;
                fi3.a aVar = fi3.Companion;
                gm3Var.getClass();
                boolean z = gm3Var instanceof wh3.b;
                fi3 fi3Var = this.t;
                if (z) {
                    fi3Var.m(((wh3.b) gm3Var).b);
                } else if (gm3Var instanceof wh3.c) {
                    fi3Var.n(((wh3.c) gm3Var).b);
                } else if (gm3Var instanceof wh3.d) {
                    vo6 vo6Var = new vo6();
                    l childFragmentManager = fi3Var.getChildFragmentManager();
                    childFragmentManager.getClass();
                    vo6Var.s(childFragmentManager);
                } else if (gm3Var instanceof wh3.e) {
                    yy3.Companion.getClass();
                    yy3 yy3Var = new yy3();
                    l childFragmentManager2 = fi3Var.getChildFragmentManager();
                    childFragmentManager2.getClass();
                    yy3Var.r(childFragmentManager2);
                } else if (gm3Var instanceof wh3.a) {
                    wh3.a aVar2 = (wh3.a) gm3Var;
                    gk6 gk6VarA = rh2.a(R.string.date, aVar2.b, aVar2.c);
                    final hi3 hi3Var = new hi3(1, fi3Var.r(), fj3.class, "dateSelected", "dateSelected(J)V", 0);
                    gk6VarA.J.add((ik6<? super S>) new ik6() { // from class: yh3
                        @Override // defpackage.ik6
                        public final void a(Object obj2) {
                            fi3.a aVar3 = fi3.Companion;
                            hi3Var.invoke(obj2);
                        }
                    });
                    hk0.l(fi3Var, gk6VarA);
                }
                return g2b.a;
            }
        });
        r().O.e(getViewLifecycleOwner(), new gi3(new li3(new ui3(q().j, SimpleProgressBar.class, "isVisible", "isVisible()Z", 0))));
        r().P.e(getViewLifecycleOwner(), new gi3(new mi3(q().l)));
        r().Q.e(getViewLifecycleOwner(), new gi3(new ni3(q().e)));
        r().U.e(getViewLifecycleOwner(), new gi3(new oi3(q().e)));
        r().S.e(getViewLifecycleOwner(), new gi3(new pi3(new vi3(q().k, hhb.class, "isVisible", "isVisible(Landroid/view/View;)Z", 1))));
        r().W.e(getViewLifecycleOwner(), new gi3(new qi3(q().k)));
        r().T.e(getViewLifecycleOwner(), new gi3(new ri3(this)));
        r().V.e(getViewLifecycleOwner(), new gi3(new si3(this)));
        r().R.e(getViewLifecycleOwner(), new gi3(new ti3(this, 0)));
        r().X.e(getViewLifecycleOwner(), new gi3(new ii3(this)));
        r().Y.e(getViewLifecycleOwner(), new gi3(new ji3(this)));
        r().Z.e(getViewLifecycleOwner(), new gi3(new ki3(q().i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qe4 q() {
        return (qe4) this.C.a(this, K[0]);
    }

    public final fj3 r() {
        return (fj3) this.D.getValue();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k implements TextWatcher {
        public k() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String string;
            a aVar = fi3.Companion;
            fj3 fj3VarR = fi3.this.r();
            if (editable == null || (string = editable.toString()) == null) {
                string = BuildConfig.FLAVOR;
            }
            fj3VarR.e(new vh3.c(string));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
