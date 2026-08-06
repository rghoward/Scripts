package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vo6 extends rx4 {
    public final vg4 P = new vg4(new k());
    public final shb Q;
    public final o7a R;
    public final o7a S;
    public final boolean T;
    public static final /* synthetic */ ho5<Object>[] U = {new ne8(vo6.class, "binding", "getBinding()Lcom/hwpo_training_app/hwpo_library/databinding/DialogMediaLibraryBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[sn6.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c extends pi4 implements oh4<x60, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(x60 x60Var) {
            x60 x60Var2 = x60Var;
            x60Var2.getClass();
            ip6 ip6Var = (ip6) this.receiver;
            ip6Var.getClass();
            ArrayList arrayList = new ArrayList(ip6Var.b().e);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i = -1;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                if (((x60) obj).b() == x60Var2.b()) {
                    break;
                }
                i++;
            }
            int i3 = ip6Var.b().f;
            int i4 = x60Var2.d() ? -1 : 1;
            arrayList.set(i, x60Var2.a(!x60Var2.d()));
            ip6Var.e(new ip6.a.b(i3 + i4, arrayList));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class d extends pi4 implements oh4<Integer, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(Integer num) {
            int iIntValue = num.intValue();
            ip6 ip6Var = (ip6) this.receiver;
            if (!ip6Var.b().b && !ip6Var.b().c && iIntValue + 6 >= ip6Var.b().e.size()) {
                ip6Var.e(ip6.a.j.a);
                oy0.d(rhb.b(ip6Var), null, null, new kp6(ip6Var, null), 3);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e implements oh4<List<? extends x60>, g2b> {
        public e() {
        }

        @Override // defpackage.oh4
        public final g2b invoke(List<? extends x60> list) {
            a aVar = vo6.Companion;
            ((b70) vo6.this.R.getValue()).u(list);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f implements oh4<vz7, g2b> {
        public f() {
        }

        @Override // defpackage.oh4
        public final g2b invoke(vz7 vz7Var) {
            vz7 vz7Var2 = vz7Var;
            a aVar = vo6.Companion;
            vo6 vo6Var = vo6.this;
            zz2 zz2VarV = vo6Var.v();
            boolean z = vz7Var2.b;
            PlaceHolder placeHolder = zz2VarV.i;
            if (z) {
                placeHolder.setPlaceholderId(vz7Var2.a);
                placeHolder.setTitle(vz7Var2.d);
                placeHolder.q(vz7Var2.e);
                placeHolder.p(vz7Var2.f, vz7Var2.c);
                placeHolder.i(new to6(0, vo6Var));
                PlaceHolder.r(placeHolder);
            } else {
                PlaceHolder.h(placeHolder);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g implements oh4<Boolean, g2b> {
        public g() {
        }

        @Override // defpackage.oh4
        public final g2b invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = vo6.Companion;
            vo6.this.v().j.setVisible(zBooleanValue);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h implements oh4<Boolean, g2b> {
        public h() {
        }

        @Override // defpackage.oh4
        public final g2b invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = vo6.Companion;
            vo6.this.v().e.setVisibility(zBooleanValue ? 0 : 8);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i implements oh4<String, g2b> {
        public i() {
        }

        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            String str2 = str;
            a aVar = vo6.Companion;
            zz2 zz2VarV = vo6.this.v();
            zz2VarV.d.setVisibility(str2 != null ? 0 : 8);
            zz2VarV.g.setText(str2);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j implements oh4<String, g2b> {
        public j() {
        }

        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            a aVar = vo6.Companion;
            vo6.this.v().h.setText(str);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k implements oh4<vo6, zz2> {
        @Override // defpackage.oh4
        public final zz2 invoke(vo6 vo6Var) {
            vo6 vo6Var2 = vo6Var;
            vo6Var2.getClass();
            return zz2.bind(vo6Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class l extends wp5 implements mh4<androidx.fragment.app.f> {
        public l() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return vo6.this;
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

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class p extends wp5 implements mh4<thb.c> {
        public final /* synthetic */ ss5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ss5 ss5Var) {
            super(0);
            this.v = ss5Var;
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            thb.c defaultViewModelProviderFactory;
            whb whbVar = (whb) this.v.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? vo6.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public vo6() {
        ss5 ss5VarC = hv5.c(j26.u, new m(new l()));
        this.Q = new shb(ll8.a(ip6.class), new n(ss5VarC), new p(ss5VarC), new o(ss5VarC));
        int i2 = 2;
        this.R = new o7a(new pb3(i2, this));
        this.S = new o7a(new qb3(i2, this));
        this.T = true;
    }

    @Override // androidx.fragment.app.f
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.dialog_media_library, viewGroup);
    }

    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        zz2 zz2VarV = v();
        MaterialToolbar materialToolbar = zz2VarV.k;
        ConstraintLayout constraintLayout = zz2VarV.a;
        constraintLayout.getClass();
        xgb.g(materialToolbar, R.drawable.ic_close_results_dialog, constraintLayout.getContext().getColor(R.color.colorPrimary));
        int i2 = 1;
        materialToolbar.setNavigationOnClickListener(new m36(this, i2));
        zz2 zz2VarV2 = v();
        ConstraintLayout constraintLayout2 = zz2VarV2.a;
        constraintLayout2.getClass();
        tm6 tm6Var = new tm6(wk6.b(constraintLayout2.getResources().getDimension(R.dimen.attachments_files_horizontal_margin)), wk6.b(constraintLayout2.getResources().getDimension(R.dimen.attachments_files_vertical_margin)));
        constraintLayout2.post(new li0(i2, zz2VarV2, this));
        RecyclerView recyclerView = zz2VarV2.b;
        recyclerView.setAdapter((b70) this.R.getValue());
        recyclerView.h(tm6Var);
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 3));
        zz2 zz2VarV3 = v();
        xgb.a(zz2VarV3.e, new wo6(this, null));
        xgb.a(zz2VarV3.f, new xo6(this, null));
        xgb.a(zz2VarV3.g, new yo6(this, null));
        ip6 ip6VarW = w();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ip6VarW.c(viewLifecycleOwner, new oh4() { // from class: so6
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                MenuItem menuItemFindItem;
                vo6 vo6Var = this.t;
                o7a o7aVar = vo6Var.S;
                gm3 gm3Var = (gm3) obj;
                vo6.a aVar = vo6.Companion;
                gm3Var.getClass();
                if (gm3Var instanceof bp6.a) {
                    vo6Var.i();
                } else if (gm3Var instanceof bp6.d) {
                    sn6 sn6Var = ((bp6.d) gm3Var).b;
                    Menu menu = ((PopupMenu) o7aVar.getValue()).getMenu();
                    menu.getClass();
                    int size = menu.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        menu.getItem(i3).setChecked(false);
                    }
                    int i4 = sn6Var == null ? -1 : vo6.b.a[sn6Var.ordinal()];
                    if (i4 == 1) {
                        menuItemFindItem = menu.findItem(R.id.filterPhotos);
                    } else if (i4 == 2) {
                        menuItemFindItem = menu.findItem(R.id.filterVideos);
                    } else if (i4 != 3) {
                        menuItemFindItem = i4 != 4 ? null : menu.findItem(R.id.filterFiles);
                    } else {
                        menuItemFindItem = menu.findItem(R.id.filterYoutube);
                    }
                    if (menuItemFindItem != null) {
                        menuItemFindItem.setChecked(true);
                    }
                    ((PopupMenu) o7aVar.getValue()).show();
                } else if (gm3Var instanceof bp6.b) {
                    vo6Var.getParentFragmentManager().e0(uy0.c(new js7("arg_dialog_media_library_selected_ids", ((bp6.b) gm3Var).b)), "result_dialog_media_library");
                    vo6Var.i();
                }
                return g2b.a;
            }
        });
        w().B.e(getViewLifecycleOwner(), new zo6(new e()));
        w().C.e(getViewLifecycleOwner(), new zo6(new f()));
        w().D.e(getViewLifecycleOwner(), new zo6(new g()));
        w().E.e(getViewLifecycleOwner(), new zo6(new h()));
        w().F.e(getViewLifecycleOwner(), new zo6(new i()));
        w().G.e(getViewLifecycleOwner(), new zo6(new j()));
    }

    @Override // defpackage.zj0
    public final boolean r() {
        return this.T;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zz2 v() {
        T tA = this.P.a(this, U[0]);
        tA.getClass();
        return (zz2) tA;
    }

    public final ip6 w() {
        return (ip6) this.Q.getValue();
    }
}
