package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.hwpo_training_app.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ey7 extends zx4 {
    public final vg4 P = new vg4(new f());
    public final shb Q;
    public final boolean R;
    public final o7a S;
    public static final /* synthetic */ ho5<Object>[] T = {new ne8(ey7.class, "binding", "getBinding()Lcom/hwpo_training_app/profile/databinding/DialogPickCountryBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements oh4<m82, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(m82 m82Var) {
            boolean z;
            m82 m82Var2 = m82Var;
            m82Var2.getClass();
            ny7 ny7Var = (ny7) this.receiver;
            ny7Var.getClass();
            List<m82> list = ny7Var.b().d;
            ArrayList arrayList = new ArrayList(ph1.n(list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                arrayList.add(m82.a((m82) it.next(), false));
            }
            ArrayList arrayListG = ny7.g(m82Var2.a, arrayList);
            ny7Var.e(new cy7.a(arrayListG));
            ny7Var.e(new cy7.c(m82Var2));
            if (!arrayListG.isEmpty()) {
                int size = arrayListG.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListG.get(i);
                    i++;
                    if (((m82) obj).c) {
                        z = true;
                        break;
                    }
                }
            }
            ny7Var.e(new cy7.e(z));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements oh4<List<? extends m82>, g2b> {
        public c() {
        }

        @Override // defpackage.oh4
        public final g2b invoke(List<? extends m82> list) {
            a aVar = ey7.Companion;
            ((c82) ey7.this.S.getValue()).u(list);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements oh4<Boolean, g2b> {
        public d() {
        }

        @Override // defpackage.oh4
        public final g2b invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = ey7.Companion;
            ey7.this.v().d.setVisible(zBooleanValue);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e implements oh4<Boolean, g2b> {
        public final /* synthetic */ MaterialButton t;

        public e(MaterialButton materialButton) {
            this.t = materialButton;
        }

        @Override // defpackage.oh4
        public final g2b invoke(Boolean bool) {
            this.t.setEnabled(bool.booleanValue());
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f implements oh4<ey7, d03> {
        @Override // defpackage.oh4
        public final d03 invoke(ey7 ey7Var) {
            ey7 ey7Var2 = ey7Var;
            ey7Var2.getClass();
            return d03.bind(ey7Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g extends wp5 implements mh4<androidx.fragment.app.f> {
        public g() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return ey7.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h extends wp5 implements mh4<whb> {
        public final /* synthetic */ g u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.u = gVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ss5 ss5Var) {
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
    public static final class k extends wp5 implements mh4<thb.c> {
        public final /* synthetic */ ss5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ss5 ss5Var) {
            super(0);
            this.v = ss5Var;
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            thb.c defaultViewModelProviderFactory;
            whb whbVar = (whb) this.v.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? ey7.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ey7() {
        ss5 ss5VarC = hv5.c(j26.u, new h(new g()));
        this.Q = new shb(ll8.a(ny7.class), new i(ss5VarC), new k(ss5VarC), new j(ss5VarC));
        this.R = true;
        this.S = new o7a(new b10(3, this));
    }

    @Override // androidx.fragment.app.f
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.dialog_pick_country, viewGroup);
    }

    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        w().B.e(getViewLifecycleOwner(), new gy7(new c()));
        w().z.e(getViewLifecycleOwner(), new gy7(new d()));
        w().A.e(getViewLifecycleOwner(), new gy7(new e(v().b)));
        ny7 ny7VarW = w();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        int i2 = 1;
        ny7VarW.c(viewLifecycleOwner, new fb2(i2, this));
        d03 d03VarV = v();
        RecyclerView recyclerView = d03VarV.c;
        d03VarV.a.post(new pt2(i2, d03VarV, this));
        Drawable drawable = requireContext().getDrawable(R.drawable.common_divider);
        if (drawable == null) {
            z90.a("Required value was null.");
            return;
        }
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter((c82) this.S.getValue());
        recyclerView.h(new feb(drawable, 0, 0));
        d03 d03VarV2 = v();
        xgb.a(d03VarV2.b, new fy7(this, null));
        d03VarV2.e.setNavigationOnClickListener(new View.OnClickListener() { // from class: dy7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ey7.a aVar = ey7.Companion;
                this.t.i();
            }
        });
    }

    @Override // defpackage.zj0
    public final boolean r() {
        return this.R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d03 v() {
        T tA = this.P.a(this, T[0]);
        tA.getClass();
        return (d03) tA;
    }

    public final ny7 w() {
        return (ny7) this.Q.getValue();
    }
}
