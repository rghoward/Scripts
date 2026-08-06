package defpackage;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.BarChart;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.tracking.presentation.widget.ScoreInfoExpandableLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class o8b extends ny4 {
    public final vg4 A = new vg4(new m());
    public final shb B;
    public final wj3 C;
    public final o7a D;
    public static final /* synthetic */ ho5<Object>[] E = {new ne8(o8b.class, "binding", "getBinding()Lcom/hwpo_training_app/tracking/databinding/FragmentValueDetailsBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static o8b a(int i, ebb ebbVar, xn0 xn0Var, m2b m2bVar, String str, boolean z) {
            ebbVar.getClass();
            xn0Var.getClass();
            m2bVar.getClass();
            str.getClass();
            o8b o8bVar = new o8b();
            Bundle bundle = new Bundle();
            bundle.putInt("com.fitr_training.tracking.presentation.value_details.ValueDetailsFragment.ID", i);
            bundle.putSerializable("com.fitr_training.tracking.presentation.value_details.ValueDetailsFragment.VALUE_TYPE", ebbVar);
            bundle.putSerializable("com.fitr_training.tracking.presentation.value_details.ValueDetailsFragment.MEASURE_TYPE", xn0Var);
            bundle.putSerializable("com.fitr_training.tracking.presentation.value_details.ValueDetailsFragment.UNITS", m2bVar);
            bundle.putString("com.fitr_training.tracking.presentation.value_details.ValueDetailsFragment.NAME", str);
            bundle.putBoolean("com.fitr_training.tracking.presentation.value_details.ValueDetailsFragment.CAME_FROM_COMMENTS", false);
            bundle.putBoolean("com.fitr_training.tracking.presentation.value_details.ValueDetailsFragment.CAME_FROM_LEADERBOARDS", z);
            o8bVar.setArguments(bundle);
            return o8bVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements oh4<vy2, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(vy2 vy2Var) {
            vy2 vy2Var2 = vy2Var;
            vy2Var2.getClass();
            String str = vy2Var2.f;
            o9b o9bVar = (o9b) this.receiver;
            o9bVar.getClass();
            ebb ebbVar = o9bVar.O;
            int i = o9b.a.a[ebbVar.ordinal()];
            pta ptaVar = o9bVar.x;
            if (i == 1) {
                ptaVar.r(vy2Var2.a, vy2Var2.b, str);
            } else {
                ptaVar.g(vy2Var2.b, o9bVar.R, ebbVar.ordinal(), str, vy2Var2.a, o9bVar.P.ordinal());
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c extends pi4 implements oh4<vy2, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(vy2 vy2Var) {
            vy2 vy2Var2 = vy2Var;
            vy2Var2.getClass();
            o9b o9bVar = (o9b) this.receiver;
            o9bVar.getClass();
            o9bVar.X = Integer.valueOf(vy2Var2.a);
            o9bVar.f(k8b.b);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class d extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            o9b o9bVar = (o9b) this.receiver;
            m59 m59Var = o9bVar.b().m;
            m59 m59Var2 = m59.t;
            if (m59Var == m59Var2 || m59Var == m59.v) {
                m59Var2 = m59.u;
            }
            o9bVar.e(new d8b.l(m59Var2));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class e extends pi4 implements oh4<l89, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(l89 l89Var) {
            l89 l89Var2 = l89Var;
            l89Var2.getClass();
            o9b o9bVar = (o9b) this.receiver;
            pta ptaVar = o9bVar.x;
            r60 r60Var = o9bVar.K;
            List<l89> list = o9bVar.b().l.f;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((l89) obj).v == u60.u) {
                    arrayList.add(obj);
                }
            }
            t6 t6Var = new t6(1, ptaVar, pta.class, "goToPhotoPreview", "goToPhotoPreview(Ljava/lang/String;)V", 0, 1);
            y9b y9bVar = new y9b(2, ptaVar, pta.class, "goToVideoPlayer", "goToVideoPlayer(I[Ljava/lang/String;)V", 0);
            r60Var.a(l89Var2, arrayList, t6Var, new m5(3, o9bVar), new z9b(2, o9bVar, o9b.class, "downloadFile", "downloadFile(JLjava/lang/String;)V", 0), new aab(1, o9bVar, o9b.class, "cancelFileDownload", "cancelFileDownload(Ljava/lang/String;)V", 0), y9bVar, new bab(2, o9bVar, o9b.class, "openFile", "openFile(Ljava/io/File;Ljava/lang/String;)V", 0));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class f extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            o9b o9bVar = (o9b) this.receiver;
            pta ptaVar = o9bVar.x;
            if (o9bVar.S) {
                ptaVar.a();
            } else {
                String str = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(Long.valueOf(o9bVar.b().l.h));
                bu8 bu8Var = o9bVar.z;
                str.getClass();
                ptaVar.i(o9bVar.R, o9bVar.b().l.d, bu8Var.b(R.string.last_updated, str), o9bVar.N);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsFragment$initListeners$1$5", f = "ValueDetailsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public g(r02<? super g> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return o8b.this.new g(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = o8b.Companion;
            o8b.this.r().j(c13.t);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsFragment$initListeners$1$6", f = "ValueDetailsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public h(r02<? super h> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return o8b.this.new h(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = o8b.Companion;
            o8b.this.r().j(c13.u);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsFragment$initListeners$1$7", f = "ValueDetailsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class i extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public i(r02<? super i> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return o8b.this.new i(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = o8b.Companion;
            o9b o9bVarR = o8b.this.r();
            o9bVarR.x.e(o9bVarR.N, o9bVarR.R, o9bVarR.Q.ordinal(), o9bVarR.P.ordinal(), o9bVarR.O.ordinal(), true);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class j extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            o9b o9bVar = (o9b) this.receiver;
            bu8 bu8Var = o9bVar.z;
            if (o9bVar.X != null) {
                o9bVar.f(new h8b(new l55.b(bu8Var.b(R.string.confirm_entry_deletion_title, new Object[0]), bu8Var.b(R.string.confirm_entry_deletion_text, new Object[0]), bu8Var.b(R.string.cancel, new Object[0]), bu8Var.b(R.string.delete, new Object[0]), Integer.valueOf(bu8Var.a(R.color.alertErrorText)))));
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class k extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            o9b o9bVar = (o9b) this.receiver;
            o9bVar.getClass();
            o9bVar.e(d8b.j.a);
            if (o9b.a.a[o9bVar.O.ordinal()] == 1) {
                oy0.d(rhb.b(o9bVar), null, null, new s9b(o9bVar, null), 3);
            } else {
                oy0.d(rhb.b(o9bVar), null, null, new t9b(o9bVar, null), 3);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class l implements eh7 {
        public l() {
        }

        @Override // defpackage.eh7
        public final void a(qj3 qj3Var) {
            if (qj3Var != null) {
                Object obj = qj3Var.u;
                if ((obj instanceof jl3 ? (jl3) obj : null) == null) {
                    a aVar = o8b.Companion;
                    o8b.this.r().f(f8b.b);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class m implements oh4<o8b, tg4> {
        @Override // defpackage.oh4
        public final tg4 invoke(o8b o8bVar) {
            o8b o8bVar2 = o8bVar;
            o8bVar2.getClass();
            return tg4.bind(o8bVar2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class n extends wp5 implements mh4<androidx.fragment.app.f> {
        public n() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return o8b.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class o extends wp5 implements mh4<whb> {
        public final /* synthetic */ n u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(n nVar) {
            super(0);
            this.u = nVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class p extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class q extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ss5 ss5Var) {
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
    public static final class r extends wp5 implements mh4<thb.c> {
        public final /* synthetic */ ss5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ss5 ss5Var) {
            super(0);
            this.v = ss5Var;
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            thb.c defaultViewModelProviderFactory;
            whb whbVar = (whb) this.v.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? o8b.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public o8b() {
        ss5 ss5VarC = hv5.c(j26.u, new o(new n()));
        this.B = new shb(ll8.a(o9b.class), new p(ss5VarC), new r(ss5VarC), new q(ss5VarC));
        this.C = new wj3();
        this.D = new o7a(new rs9(1, this));
    }

    public static float p(float f2, float f3, xn0 xn0Var) {
        if (xn0Var.a()) {
            return f3;
        }
        while (true) {
            int iB = wk6.b(f3 - f2) % 3;
            if (iB + ((((iB ^ 3) & ((-iB) | iB)) >> 31) & 3) == 0) {
                return f3;
            }
            f3 += 1.0f;
        }
    }

    @Override // defpackage.hk0
    public final void i() {
        tg4 tg4VarQ = q();
        tg4VarQ.d.setOnExpandActionClick(new d(0, r(), o9b.class, "toggleChallengeExpandState", "toggleChallengeExpandState()V", 0));
        ScoreInfoExpandableLayout scoreInfoExpandableLayout = tg4VarQ.d;
        scoreInfoExpandableLayout.setOnAttachmentClick(new e(1, r(), o9b.class, "onAttachmentClick", "onAttachmentClick(Lcom/hwpo_training_app/core/presentation/entity/section_details/SectionAttachment;)V", 0));
        scoreInfoExpandableLayout.setOnOpenLeaderboardClick(new f(0, r(), o9b.class, "onOpenLeaderboardClick", "onOpenLeaderboardClick()V", 0));
        tg4VarQ.k.setNavigationOnClickListener(new View.OnClickListener() { // from class: l8b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o8b.a aVar = o8b.Companion;
                this.t.j();
            }
        });
        xgb.a(tg4VarQ.i, new g(null));
        xgb.a(tg4VarQ.g, new h(null));
        xgb.a(tg4VarQ.c, new i(null));
        j jVar = new j(0, r(), o9b.class, "dialogDeleteClicked", "dialogDeleteClicked()V", 0);
        wj3 wj3Var = this.C;
        wj3Var.getClass();
        wj3Var.M = jVar;
        wj3Var.L = new k(0, r(), o9b.class, "dialogEditClicked", "dialogEditClicked()V", 0);
        tg4VarQ.b.setOnChartValueSelectedListener(new l());
        getChildFragmentManager().f0("result_dialog_confirm", getViewLifecycleOwner(), new pf4() { // from class: m8b
            @Override // defpackage.pf4
            public final void d(Bundle bundle, String str) {
                o8b.a aVar = o8b.Companion;
                if (bundle.getBoolean("arg_dialog_is_confirmed")) {
                    o9b o9bVarR = this.t.r();
                    oy0.d(rhb.b(o9bVarR), null, null, new q9b(o9bVarR, null), 3);
                }
            }
        });
    }

    @Override // defpackage.hk0
    public final void j() {
        r().x.a();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        q().m.getLayoutTransition().enableTransitionType(2);
        int color = requireContext().getColor(R.color.colorStroke);
        int color2 = requireContext().getColor(R.color.labelSecondary);
        Typeface typefaceA = iu8.a(requireContext(), R.font.proxima_nova_bold);
        BarChart barChart = q().b;
        if (typefaceA == null) {
            z90.a("Required value was null.");
            return;
        }
        Context context = barChart.getContext();
        context.getClass();
        cb1 cb1Var = new cb1(context);
        cb1Var.setChartView(barChart);
        barChart.setMarker(cb1Var);
        int i2 = 0;
        barChart.setScaleEnabled(false);
        barChart.setPinchZoom(false);
        barChart.setScaleYEnabled(false);
        barChart.setScaleXEnabled(false);
        barChart.setAutoScaleMinMaxEnabled(false);
        barChart.setDragEnabled(false);
        barChart.setDragXEnabled(false);
        barChart.setDragYEnabled(false);
        barChart.setDoubleTapToZoomEnabled(false);
        barChart.getDescription().a = false;
        barChart.getLegend().a = false;
        hrb xAxis = barChart.getXAxis();
        xAxis.h = color;
        xAxis.f = color2;
        xAxis.t = false;
        xAxis.i = t6b.c(1.0f);
        barChart.setExtraBottomOffset(4.0f);
        int i3 = 1;
        xAxis.q = true;
        xAxis.v = new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f);
        xAxis.d = typefaceA;
        xAxis.G = hrb.a.u;
        mrb axisRight = barChart.getAxisRight();
        axisRight.u = false;
        axisRight.s = false;
        axisRight.t = false;
        mrb axisLeft = barChart.getAxisLeft();
        axisLeft.t = false;
        axisLeft.d = typefaceA;
        axisLeft.h = color;
        axisLeft.f = color2;
        axisLeft.i = t6b.c(1.0f);
        axisLeft.A = true;
        axisLeft.D = 0.0f;
        axisLeft.E = Math.abs(axisLeft.C - 0.0f);
        axisLeft.o = 4;
        axisLeft.r = true;
        bib viewPortHandler = barChart.getViewPortHandler();
        viewPortHandler.getClass();
        hrb xAxis2 = barChart.getXAxis();
        xAxis2.getClass();
        ova ovaVar = barChart.getRendererXAxis().c;
        ovaVar.getClass();
        barChart.setXAxisRenderer(new b61(viewPortHandler, xAxis2, ovaVar));
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new n8b(), view2);
            g2b g2bVar = g2b.a;
        }
        o9b o9bVarR = r();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        o9bVarR.c(viewLifecycleOwner, new r22(i3, this));
        r().Y.e(getViewLifecycleOwner(), new p8b(new u8b(this)));
        r().Z.e(getViewLifecycleOwner(), new p8b(new v8b(this)));
        r().d0.e(getViewLifecycleOwner(), new p8b(new w8b(this)));
        r().c0.e(getViewLifecycleOwner(), new p8b(new x8b(i2, q().k)));
        r().a0.e(getViewLifecycleOwner(), new p8b(new y8b(i2, this)));
        r().g0.e(getViewLifecycleOwner(), new p8b(new z8b(i2, q().i)));
        r().h0.e(getViewLifecycleOwner(), new p8b(new a9b(i2, q().g)));
        r().b0.e(getViewLifecycleOwner(), new p8b(new b9b(this)));
        r().e0.e(getViewLifecycleOwner(), new p8b(new c9b(new e9b(q().j, SimpleProgressBar.class, "isVisible", "isVisible()Z", 0))));
        r().i0.e(getViewLifecycleOwner(), new p8b(new q8b(q().f)));
        r().l0.e(getViewLifecycleOwner(), new p8b(new r8b(new f9b(q().c, hhb.class, "isVisible", "isVisible(Landroid/view/View;)Z", 1))));
        r().f0.e(getViewLifecycleOwner(), new p8b(new yx6(i3, this)));
        r().j0.e(getViewLifecycleOwner(), new p8b(new s8b(q().d)));
        r().k0.e(getViewLifecycleOwner(), new p8b(new t8b(q().d)));
        RecyclerView recyclerView = q().l;
        int dimension = (int) recyclerView.getResources().getDimension(R.dimen.values_list_margin_vertical);
        int dimension2 = (int) recyclerView.getResources().getDimension(R.dimen.values_list_margin_horizontal);
        int dimension3 = (int) recyclerView.getResources().getDimension(R.dimen.values_list_margin_between);
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((e8b) this.D.getValue());
        recyclerView.h(new gbb(dimension2, dimension3, dimension, dimension));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final tg4 q() {
        return (tg4) this.A.a(this, E[0]);
    }

    public final o9b r() {
        return (o9b) this.B.getValue();
    }
}
