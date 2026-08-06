package defpackage;

import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.hwpo_training_app.R;
import com.hwpo_training_app.benchmarks.presentation.widget.BenchmarksExpandableLayout;
import com.hwpo_training_app.core.widget.layout_manager.HorizontalRatioLayoutManager;
import com.hwpo_training_app.sessions.presentation.widget.PerformanceExpandableLayout;
import java.io.File;
import net.cachapa.expandablelayout.ExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class bf9 extends fy4 {
    public mg9 A;
    public final vg4 B = new vg4(new i());
    public final shb C;
    public final o7a D;
    public final o7a E;
    public static final /* synthetic */ ho5<Object>[] F = {new ne8(bf9.class, "binding", "getBinding()Lcom/hwpo_training_app/sessions/databinding/FragmentSessionDetailsBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.sessions.presentation.session_details.SessionDetailsFragment$initListeners$1$2", f = "SessionDetailsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public b(r02<? super b> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return bf9.this.new b(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = bf9.Companion;
            qf9 qf9VarQ = bf9.this.q();
            mf9 mf9Var = qf9VarQ.A;
            int i = qf9VarQ.b().f.t;
            String str = qf9VarQ.b().c;
            String str2 = qf9VarQ.b().d;
            if (str2.length() <= 0) {
                str2 = null;
            }
            mf9Var.t(i, str, str2);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            qf9 qf9Var = (qf9) this.receiver;
            if (wn0.a(qf9Var.b().i)) {
                qf9Var.A.b(qf9Var.x, qf9Var.y, qf9Var.b().i);
            } else {
                qf9Var.f(uf9.b);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class d extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            qf9 qf9Var = (qf9) this.receiver;
            qf9Var.A.b(qf9Var.x, qf9Var.y, qf9Var.b().i);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class e extends pi4 implements oh4<vn0, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(vn0 vn0Var) {
            vn0 vn0Var2 = vn0Var;
            vn0Var2.getClass();
            qf9 qf9Var = (qf9) this.receiver;
            qf9Var.getClass();
            qf9Var.A.q(vn0Var2.t, vn0Var2.z, vn0Var2.y, vn0Var2.u);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class f extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            qf9 qf9Var = (qf9) this.receiver;
            if (qf9Var.b().j.b) {
                qf9Var.e(new qf9.b.c(rv7.a(qf9Var.b().j, false, new js7(Boolean.valueOf(!qf9Var.b().j.c.t.booleanValue()), Boolean.TRUE), false, false, false, false, false, false, false, null, null, null, null, null, 32763)));
            } else {
                qf9Var.A.p(qf9Var.x, qf9Var.y, qf9Var.b().j.j, qf9Var.b().e, qf9Var.b().f);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class g extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            qf9 qf9Var = (qf9) this.receiver;
            qf9Var.A.p(qf9Var.x, qf9Var.y, qf9Var.b().j.j, qf9Var.b().e, qf9Var.b().f);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class h extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            qf9 qf9Var = (qf9) this.receiver;
            if (qf9Var.b().j.j) {
                oy0.d(rhb.b(qf9Var), null, null, new lg9(qf9Var, null), 3);
            } else {
                oy0.d(rhb.b(qf9Var), null, null, new wf9(qf9Var, null), 3);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i implements oh4<bf9, tf4> {
        @Override // defpackage.oh4
        public final tf4 invoke(bf9 bf9Var) {
            bf9 bf9Var2 = bf9Var;
            bf9Var2.getClass();
            return tf4.bind(bf9Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j extends wp5 implements mh4<androidx.fragment.app.f> {
        public j() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return bf9.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k extends wp5 implements mh4<whb> {
        public final /* synthetic */ j u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.u = jVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class l extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class m extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ss5 ss5Var) {
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

    public bf9() {
        ri5 ri5Var = new ri5(2, this);
        ss5 ss5VarC = hv5.c(j26.u, new k(new j()));
        this.C = new shb(ll8.a(qf9.class), new l(ss5VarC), ri5Var, new m(ss5VarC));
        this.D = new o7a(new mh4() { // from class: xe9
            @Override // defpackage.mh4
            public final Object invoke() {
                bf9.a aVar = bf9.Companion;
                return new wm6(new n62(1, this.t));
            }
        });
        this.E = new o7a(new zn6(1, this));
    }

    @Override // defpackage.hk0
    public final void i() {
        tf4 tf4VarP = p();
        tf4VarP.l.setNavigationOnClickListener(new View.OnClickListener() { // from class: ye9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bf9.a aVar = bf9.Companion;
                this.t.q().A.a();
            }
        });
        xgb.a(tf4VarP.h, new b(null));
        BenchmarksExpandableLayout benchmarksExpandableLayout = tf4VarP.b;
        benchmarksExpandableLayout.setOnHeaderBenchmarksClick(new c(0, q(), qf9.class, "onBenchmarksHeaderClick", "onBenchmarksHeaderClick()V", 0));
        benchmarksExpandableLayout.setOnEditBenchmarksClick(new d(0, q(), qf9.class, "onEditBenchmarksClick", "onEditBenchmarksClick()V", 0));
        benchmarksExpandableLayout.setOnOpenPersonalRecordsClick(new e(1, q(), qf9.class, "onOpenPersonalRecordsClick", "onOpenPersonalRecordsClick(Lcom/hwpo_training_app/core/presentation/entity/section_details/Benchmark;)V", 0));
        PerformanceExpandableLayout performanceExpandableLayout = tf4VarP.i;
        performanceExpandableLayout.setOnHeaderBenchmarksClick(new f(0, q(), qf9.class, "onPerformanceHeaderClick", "onPerformanceHeaderClick()V", 0));
        performanceExpandableLayout.setOnEditBenchmarksClick(new g(0, q(), qf9.class, "onEditPerformanceClick", "onEditPerformanceClick()V", 0));
        performanceExpandableLayout.setOnAttachmentClick(new e67(1, this));
        performanceExpandableLayout.setOnCompleteSessionClick(new h(0, q(), qf9.class, "onSessionCompletedClick", "onSessionCompletedClick()V", 0));
    }

    @Override // defpackage.hk0
    public final void j() {
        q().A.a();
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new gi4() { // from class: ze9
                @Override // defpackage.gi4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int iIntValue = ((Integer) obj2).intValue();
                    int iIntValue2 = ((Integer) obj3).intValue();
                    View view3 = (View) obj4;
                    bf9.a aVar = bf9.Companion;
                    view3.getClass();
                    view3.setPadding(view3.getPaddingLeft(), ((ec5) obj5).b + iIntValue2, view3.getPaddingRight(), view3.getPaddingBottom());
                    LinearLayoutCompat linearLayoutCompat = this.t.p().c;
                    linearLayoutCompat.setPadding(linearLayoutCompat.getPaddingLeft(), linearLayoutCompat.getPaddingTop(), linearLayoutCompat.getPaddingRight(), iIntValue);
                    return g2b.a;
                }
            }, view2);
        }
        int dimension = (int) getResources().getDimension(R.dimen.default_margin);
        f15 f15Var = new f15(dimension, dimension);
        RecyclerView recyclerView = p().g;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        recyclerView.setLayoutManager(new HorizontalRatioLayoutManager(contextRequireContext));
        cs2 cs2Var = new cs2();
        recyclerView.setOnFlingListener(null);
        cs2Var.a(recyclerView);
        recyclerView.h(f15Var);
        recyclerView.setAdapter((wm6) this.D.getValue());
        RecyclerView recyclerView2 = p().f;
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        recyclerView2.setLayoutManager(new HorizontalRatioLayoutManager(contextRequireContext2));
        cs2 cs2Var2 = new cs2();
        recyclerView2.setOnFlingListener(null);
        cs2Var2.a(recyclerView2);
        recyclerView2.h(f15Var);
        recyclerView2.setAdapter((jw3) this.E.getValue());
        p().c.getLayoutTransition().enableTransitionType(3);
        q().O.e(getViewLifecycleOwner(), new cf9(new ef9(this)));
        q().Q.e(getViewLifecycleOwner(), new cf9(new ff9(this)));
        q().R.e(getViewLifecycleOwner(), new cf9(new gf9(this)));
        q().S.e(getViewLifecycleOwner(), new cf9(new hf9(this)));
        q().T.e(getViewLifecycleOwner(), new cf9(new if9(this)));
        q().U.e(getViewLifecycleOwner(), new cf9(new jf9(this)));
        int i2 = 1;
        q().P.e(getViewLifecycleOwner(), new cf9(new qc4(this, i2)));
        q().V.e(getViewLifecycleOwner(), new cf9(new rc4(this, i2)));
        q().W.e(getViewLifecycleOwner(), new cf9(new fb8(this, i2)));
        q().X.e(getViewLifecycleOwner(), new cf9(new df9(new kf9(p().d, hhb.class, "isVisible", "isVisible(Landroid/view/View;)Z", 1))));
        qf9 qf9VarQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        qf9VarQ.c(viewLifecycleOwner, new oh4() { // from class: af9
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                Context context;
                gm3 gm3Var = (gm3) obj;
                bf9.a aVar = bf9.Companion;
                gm3Var.getClass();
                boolean z = gm3Var instanceof sf9;
                bf9 bf9Var = this.t;
                if (z) {
                    Context context2 = bf9Var.getContext();
                    if (context2 != null) {
                        yz1.a(context2, null);
                    }
                } else if (gm3Var instanceof atb) {
                    btb.a aVar2 = btb.Companion;
                    String str = ((atb) gm3Var).b;
                    aVar2.getClass();
                    hk0.l(bf9Var, btb.a.a(str));
                } else if (gm3Var instanceof tf9) {
                    bf9Var.m(((tf9) gm3Var).b);
                } else if (gm3Var instanceof uf9) {
                    final BenchmarksExpandableLayout benchmarksExpandableLayout = bf9Var.p().b;
                    oq5 oq5Var = benchmarksExpandableLayout.K;
                    ExpandableLayout expandableLayout = oq5Var.f;
                    if (expandableLayout.a()) {
                        expandableLayout.b(false, true);
                    } else {
                        expandableLayout.b(true, true);
                    }
                    boolean zA = oq5Var.f.a();
                    float f2 = zA ? 0.0f : 1.0f;
                    float f3 = zA ? 1.0f : 0.0f;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f3);
                    valueAnimatorOfFloat.getClass();
                    valueAnimatorOfFloat.addListener(new go0(benchmarksExpandableLayout, f3));
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eo0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i3 = BenchmarksExpandableLayout.M;
                            valueAnimator.getClass();
                            AppCompatImageView appCompatImageView = benchmarksExpandableLayout.K.c;
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            animatedValue.getClass();
                            appCompatImageView.setRotation(((Float) animatedValue).floatValue() * (-180.0f));
                        }
                    });
                    valueAnimatorOfFloat.start();
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(zA ? 0.0f : 1.0f, zA ? 1.0f : 0.0f);
                    valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fo0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i3 = BenchmarksExpandableLayout.M;
                            valueAnimator.getClass();
                            MaterialButton materialButton = benchmarksExpandableLayout.K.g;
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            animatedValue.getClass();
                            materialButton.setAlpha(((Float) animatedValue).floatValue());
                        }
                    });
                    valueAnimatorOfFloat2.start();
                } else if ((gm3Var instanceof rf9) && (context = bf9Var.getContext()) != null) {
                    rf9 rf9Var = (rf9) gm3Var;
                    File file = rf9Var.b;
                    String str2 = rf9Var.c;
                    String str3 = rf9Var.d;
                    file.getClass();
                    str2.getClass();
                    str3.getClass();
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setFlags(1);
                    intent.setDataAndType(FileProvider.getUriForFile(context, str3.concat(".fileprovider"), file), str2);
                    try {
                        context.startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                        bf9.a aVar3 = bf9.Companion;
                        Toast.makeText(bf9Var.requireContext(), bf9Var.getResources().getString(R.string.file_can_not_be_open), 0).show();
                        g2b g2bVar = g2b.a;
                    }
                }
                return g2b.a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final tf4 p() {
        return (tf4) this.B.a(this, F[0]);
    }

    public final qf9 q() {
        return (qf9) this.C.getValue();
    }
}
