package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class t61 extends bx4 {
    public static final /* synthetic */ ho5<Object>[] C = {new ne8(t61.class, "binding", "getBinding()Lcom/hwpo_training_app/tracking/databinding/FragmentChallengeEntryDetailsBinding;", 0)};
    public static final a Companion = new a();
    public final shb A;
    public final vg4 B;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements oh4<l89, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(l89 l89Var) {
            l89 l89Var2 = l89Var;
            l89Var2.getClass();
            w71 w71Var = (w71) this.receiver;
            pta ptaVar = w71Var.x;
            r60 r60Var = w71Var.E;
            d71 d71Var = w71Var.b().d;
            if (d71Var != null) {
                List<l89> list = d71Var.n;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((l89) obj).v == u60.u) {
                        arrayList.add(obj);
                    }
                }
                q71 q71Var = new q71(1, ptaVar, pta.class, "goToPhotoPreview", "goToPhotoPreview(Ljava/lang/String;)V", 0);
                r71 r71Var = new r71(2, ptaVar, pta.class, "goToVideoPlayer", "goToVideoPlayer(I[Ljava/lang/String;)V", 0);
                r60Var.a(l89Var2, arrayList, q71Var, new sl0(1, w71Var), new s71(2, w71Var, w71.class, "downloadFile", "downloadFile(JLjava/lang/String;)V", 0), new t71(1, w71Var, w71.class, "cancelFileDownload", "cancelFileDownload(Ljava/lang/String;)V", 0), r71Var, new u71(2, w71Var, w71.class, "openFile", "openFile(Ljava/io/File;Ljava/lang/String;)V", 0));
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.entry_details.challenge.ChallengeEntryDetailsFragment$initListeners$1$2", f = "ChallengeEntryDetailsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public c(r02<? super c> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return t61.this.new c(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = t61.Companion;
            w71 w71VarQ = t61.this.q();
            d71 d71Var = w71VarQ.b().d;
            if (d71Var != null) {
                pta ptaVar = w71VarQ.x;
                int i = d71Var.a;
                ptaVar.c(d71Var.b, i, d71Var.m, d71Var.l, d71Var.c);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements oh4<t61, ie4> {
        @Override // defpackage.oh4
        public final ie4 invoke(t61 t61Var) {
            t61 t61Var2 = t61Var;
            t61Var2.getClass();
            return ie4.bind(t61Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends wp5 implements mh4<androidx.fragment.app.f> {
        public e() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return t61.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends wp5 implements mh4<whb> {
        public final /* synthetic */ e u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.u = eVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ss5 ss5Var) {
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
    public static final class i extends wp5 implements mh4<thb.c> {
        public final /* synthetic */ ss5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ss5 ss5Var) {
            super(0);
            this.v = ss5Var;
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            thb.c defaultViewModelProviderFactory;
            whb whbVar = (whb) this.v.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? t61.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public t61() {
        ss5 ss5VarC = hv5.c(j26.u, new f(new e()));
        this.A = new shb(ll8.a(w71.class), new g(ss5VarC), new i(ss5VarC), new h(ss5VarC));
        this.B = new vg4(new d());
    }

    @Override // defpackage.hk0
    public final void i() {
        ie4 ie4VarP = p();
        ie4VarP.c.setOnAttachmentClick(new b(1, q(), w71.class, "onAttachmentClick", "onAttachmentClick(Lcom/hwpo_training_app/core/presentation/entity/section_details/SectionAttachment;)V", 0));
        xgb.a(ie4VarP.b, new c(null));
        ie4VarP.f.setNavigationOnClickListener(new View.OnClickListener() { // from class: s61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t61.a aVar = t61.Companion;
                this.t.j();
            }
        });
    }

    @Override // defpackage.hk0
    public final void j() {
        q().x.a();
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ie4 ie4VarP = p();
        MaterialToolbar materialToolbar = ie4VarP.f;
        ConstraintLayout constraintLayout = ie4VarP.a;
        constraintLayout.getClass();
        xgb.g(materialToolbar, R.drawable.ic_back_btn, constraintLayout.getContext().getColor(R.color.colorPrimary));
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new r61(), view2);
            g2b g2bVar = g2b.a;
        }
        q().L.e(getViewLifecycleOwner(), new u61(new v61(new a71(p().e, SimpleProgressBar.class, "isVisible", "isVisible()Z", 0))));
        q().J.e(getViewLifecycleOwner(), new u61(new w61(p().f)));
        q().K.e(getViewLifecycleOwner(), new u61(new x61(p().f)));
        int i2 = 0;
        q().M.e(getViewLifecycleOwner(), new u61(new y61(i2, this)));
        q().N.e(getViewLifecycleOwner(), new u61(new z61(i2, this)));
        w71 w71VarQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        w71VarQ.c(viewLifecycleOwner, new cl0(1, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ie4 p() {
        return (ie4) this.B.a(this, C[0]);
    }

    public final w71 q() {
        return (w71) this.A.getValue();
    }
}
