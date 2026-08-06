package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.fragment.app.l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class am1 extends ex4 {
    public kx3.b A;
    public final vg4 B = new vg4(new l());
    public final shb C;
    public final o7a D;
    public final o7a E;
    public final xy7 F;
    public final i G;
    public static final /* synthetic */ ho5<Object>[] H = {new ne8(am1.class, "binding", "getBinding()Lcom/hwpo_training_app/chat/databinding/FragmentCommentsBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class b implements Parcelable {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a extends b {
            public static final Parcelable.Creator<a> CREATOR = new C0002a();
            public final int t;
            public final int u;
            public final String v;
            public final String w;
            public final int x;

            /* JADX INFO: renamed from: am1$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class C0002a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i) {
                    return new a[i];
                }
            }

            public a(int i, int i2, int i3, String str, String str2) {
                str.getClass();
                this.t = i;
                this.u = i2;
                this.v = str;
                this.w = str2;
                this.x = i3;
            }

            @Override // am1.b
            public final int a() {
                return this.t;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.t == aVar.t && this.u == aVar.u && xj5.a(this.v, aVar.v) && xj5.a(this.w, aVar.w) && this.x == aVar.x;
            }

            public final int hashCode() {
                int iC = ru3.c(os2.a(this.u, Integer.hashCode(this.t) * 31, 31), 31, this.v);
                String str = this.w;
                return Integer.hashCode(this.x) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sbB = u43.b("LeaderboardValue(leaderboardId=", ", valueId=", ", resultText=", this.t, this.u);
                ux1.b(sbB, this.v, ", description=", this.w, ", attachmentsCount=");
                return i34.b(this.x, ")", sbB);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(this.t);
                parcel.writeInt(this.u);
                parcel.writeString(this.v);
                parcel.writeString(this.w);
                parcel.writeInt(this.x);
            }
        }

        /* JADX INFO: renamed from: am1$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0003b extends b {
            public static final Parcelable.Creator<C0003b> CREATOR = new a();
            public final int t;

            /* JADX INFO: renamed from: am1$b$b$a */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class a implements Parcelable.Creator<C0003b> {
                @Override // android.os.Parcelable.Creator
                public final C0003b createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new C0003b(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final C0003b[] newArray(int i) {
                    return new C0003b[i];
                }
            }

            public C0003b(int i) {
                this.t = i;
            }

            @Override // am1.b
            public final int a() {
                return this.t;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0003b) && this.t == ((C0003b) obj).t;
            }

            public final int hashCode() {
                return Integer.hashCode(this.t);
            }

            public final String toString() {
                return pk.d(this.t, "Leaderboards(leaderboardId=", ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(this.t);
            }
        }

        public abstract int a();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            String str;
            qn1 qn1Var = (qn1) this.receiver;
            b bVar = qn1Var.R;
            if (bVar instanceof b.a) {
                b.a aVar = (b.a) bVar;
                if (aVar.x > 0 || ((str = aVar.w) != null && !z2a.w(str))) {
                    oy0.d(rhb.b(qn1Var), null, null, new do1(qn1Var, aVar, null), 3);
                }
            } else if (!(bVar instanceof b.C0003b)) {
                u.b();
                return null;
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class d extends pi4 implements oh4<sk1, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(sk1 sk1Var) {
            sk1 sk1Var2 = sk1Var;
            sk1Var2.getClass();
            qn1 qn1Var = (qn1) this.receiver;
            qn1Var.getClass();
            qn1Var.S = Long.valueOf(sk1Var2.a());
            qn1Var.f(new el1(sk1Var2.b(), !sk1Var2.b()));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class e extends pi4 implements oh4<w60.a, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(w60.a aVar) {
            w60.a aVar2 = aVar;
            aVar2.getClass();
            qn1 qn1Var = (qn1) this.receiver;
            qn1Var.getClass();
            int iOrdinal = aVar2.j.ordinal();
            if (iOrdinal == 0) {
                oy0.d(rhb.b(qn1Var), null, null, new jo1(aVar2, qn1Var, null), 3);
            } else if (iOrdinal == 1) {
                File file = new File(qn1Var.O.b(), aVar2.g);
                String str = aVar2.i;
                qn1Var.N.getClass();
                qn1Var.f(new bl1(file, str));
                g2b g2bVar = g2b.a;
            } else if (iOrdinal == 2) {
                oy0.d(rhb.b(qn1Var), null, null, new jo1(aVar2, qn1Var, null), 3);
            } else {
                if (iOrdinal != 3) {
                    u.b();
                    return null;
                }
                oy0.d(rhb.b(qn1Var), null, null, new rn1(aVar2, qn1Var, null), 3);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class f extends pi4 implements ci4<w60.b, List<? extends w60>, g2b> {
        @Override // defpackage.ci4
        public final g2b invoke(w60.b bVar, List<? extends w60> list) {
            w60.b bVar2 = bVar;
            List<? extends w60> list2 = list;
            bVar2.getClass();
            list2.getClass();
            qn1 qn1Var = (qn1) this.receiver;
            hy8 hy8Var = qn1Var.x;
            String str = bVar2.f;
            int iOrdinal = bVar2.c.ordinal();
            if (iOrdinal == 0) {
                String str2 = bVar2.h;
                if (str2 != null) {
                    qn1Var.f(new atb(str2));
                }
            } else if (iOrdinal == 1) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (obj instanceof w60.b) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((w60.b) obj2).c == u60.u) {
                        arrayList2.add(obj2);
                    }
                }
                int iIndexOf = arrayList2.indexOf(bVar2);
                if (iIndexOf != -1) {
                    ArrayList arrayList3 = new ArrayList(ph1.n(arrayList2, 10));
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj3 = arrayList2.get(i2);
                        i2++;
                        String str3 = ((w60.b) obj3).g;
                        if (str3 == null) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        arrayList3.add(str3);
                    }
                    hy8Var.c(new z38((String[]) arrayList3.toArray(new String[0]), iIndexOf));
                }
            } else if (iOrdinal != 2) {
                qn1Var.f(new cl1(str));
            } else {
                hy8Var.c(new p52(str, false));
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class g extends pi4 implements ci4<sk1, w60, g2b> {
        @Override // defpackage.ci4
        public final g2b invoke(sk1 sk1Var, w60 w60Var) {
            sk1 sk1Var2 = sk1Var;
            w60 w60Var2 = w60Var;
            sk1Var2.getClass();
            w60Var2.getClass();
            qn1 qn1Var = (qn1) this.receiver;
            qn1Var.getClass();
            oy0.d(rhb.b(qn1Var), null, null, new bo1(qn1Var, sk1Var2, w60Var2, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class h extends pi4 implements ci4<sk1, w60, g2b> {
        @Override // defpackage.ci4
        public final g2b invoke(sk1 sk1Var, w60 w60Var) {
            sk1 sk1Var2 = sk1Var;
            w60 w60Var2 = w60Var;
            sk1Var2.getClass();
            w60Var2.getClass();
            qn1 qn1Var = (qn1) this.receiver;
            qn1Var.getClass();
            oy0.d(rhb.b(qn1Var), null, null, new co1(qn1Var, sk1Var2, w60Var2, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i extends RecyclerView.h {
        public i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void d(int i, int i2) {
            a aVar = am1.Companion;
            am1 am1Var = am1.this;
            int iF = am1Var.q().f();
            RecyclerView.o layoutManager = am1Var.r().e.getLayoutManager();
            layoutManager.getClass();
            int i3 = iF - 1;
            if (((LinearLayoutManager) layoutManager).W0() < i3) {
                am1Var.r().e.j0(i3);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void e(int i, int i2) {
            a aVar = am1.Companion;
            am1 am1Var = am1.this;
            RecyclerView.o layoutManager = am1Var.r().e.getLayoutManager();
            layoutManager.getClass();
            if (((LinearLayoutManager) layoutManager).W0() < 0) {
                am1Var.r().e.j0(0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.comments.presentation.CommentsFragment$initListeners$1$2", f = "CommentsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class j extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public final /* synthetic */ je4 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(je4 je4Var, r02<? super j> r02Var) {
            super(3, r02Var);
            this.u = je4Var;
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return am1.this.new j(this.u, r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            String string;
            dv8.b(obj);
            a aVar = am1.Companion;
            qn1 qn1VarS = am1.this.s();
            Editable text = this.u.g.getText();
            if (text == null || (string = text.toString()) == null) {
                string = BuildConfig.FLAVOR;
            }
            if (!z2a.w(string)) {
                oy0.d(rhb.b(qn1VarS), null, null, new io1(qn1VarS, new db(string, null), null), 3);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.comments.presentation.CommentsFragment$initListeners$1$3", f = "CommentsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class k extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public k(r02<? super k> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return am1.this.new k(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i;
            dv8.b(obj);
            a aVar = am1.Companion;
            qn1 qn1VarS = am1.this.s();
            b bVar = qn1VarS.R;
            b.C0003b c0003b = bVar instanceof b.C0003b ? (b.C0003b) bVar : null;
            if (c0003b == null) {
                b.a aVar2 = bVar instanceof b.a ? (b.a) bVar : null;
                if (aVar2 != null) {
                    i = aVar2.t;
                }
                return g2b.a;
            }
            i = c0003b.t;
            oy0.d(rhb.b(qn1VarS), null, null, new fo1(qn1VarS, i, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class l implements oh4<am1, je4> {
        @Override // defpackage.oh4
        public final je4 invoke(am1 am1Var) {
            am1 am1Var2 = am1Var;
            am1Var2.getClass();
            return je4.bind(am1Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class m extends wp5 implements mh4<androidx.fragment.app.f> {
        public m() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return am1.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class n extends wp5 implements mh4<whb> {
        public final /* synthetic */ m u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(m mVar) {
            super(0);
            this.u = mVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class o extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class p extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ss5 ss5Var) {
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
    public static final class q extends wp5 implements mh4<thb.c> {
        public final /* synthetic */ ss5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ss5 ss5Var) {
            super(0);
            this.v = ss5Var;
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            thb.c defaultViewModelProviderFactory;
            whb whbVar = (whb) this.v.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? am1.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public am1() {
        ss5 ss5VarC = hv5.c(j26.u, new n(new m()));
        this.C = new shb(ll8.a(qn1.class), new o(ss5VarC), new q(ss5VarC), new p(ss5VarC));
        this.D = new o7a(new dr(1, this));
        this.E = new o7a(new ml1(0, this));
        this.F = new xy7();
        this.G = new i();
    }

    public static void p(am1 am1Var, String str, Bundle bundle) {
        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("arg_dialog_media_library_selected_ids", t60.class) : bundle.getParcelableArrayList("arg_dialog_media_library_selected_ids");
        if (parcelableArrayList == null) {
            z90.a("Required value was null.");
            return;
        }
        qn1 qn1VarS = am1Var.s();
        ArrayList arrayList = new ArrayList(ph1.n(parcelableArrayList, 10));
        int size = parcelableArrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = parcelableArrayList.get(i2);
            i2++;
            arrayList.add(Long.valueOf(((t60) obj).t));
        }
        oy0.d(rhb.b(qn1VarS), null, null, new eo1(qn1VarS, arrayList, null), 3);
    }

    @Override // defpackage.hk0
    public final void i() {
        androidx.fragment.app.l supportFragmentManager;
        je4 je4VarR = r();
        qn1 qn1VarS = s();
        r54 r54VarD = xgb.d(je4VarR.g);
        r54VarD.getClass();
        yk2.o(new k74(r54VarD, new vn1(qn1VarS, null)), rhb.b(qn1VarS));
        je4VarR.f.setOnRefreshListener(new ul1(this));
        xgb.a(je4VarR.k, new j(je4VarR, null));
        xgb.a(je4VarR.d, new k(null));
        je4VarR.l.setNavigationOnClickListener(new View.OnClickListener() { // from class: vl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                am1.a aVar = am1.Companion;
                this.t.s().i();
            }
        });
        getChildFragmentManager().f0("result_dialog_media_library", getViewLifecycleOwner(), new wl1(this));
        androidx.fragment.app.g activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.f0("com.hwpo_training_app.report.Report.RESULT", getViewLifecycleOwner(), new pf4() { // from class: xl1
            @Override // defpackage.pf4
            public final void d(Bundle bundle, String str) {
                am1.a aVar = am1.Companion;
                qn1 qn1VarS2 = this.t.s();
                oy0.d(rhb.b(qn1VarS2), null, null, new ao1(bundle.getLong("com.hwpo_training_app.report.Report.COMMENT_ID"), qn1VarS2, null), 3);
            }
        });
    }

    @Override // defpackage.hk0
    public final void j() {
        s().i();
    }

    @Override // androidx.fragment.app.f
    public final void onDestroyView() {
        q().t(this.G);
        super.onDestroyView();
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        mh4<g2b> mh4Var = new mh4() { // from class: yl1
            @Override // defpackage.mh4
            public final Object invoke() {
                am1.a aVar = am1.Companion;
                this.t.s().f(hl1.b);
                return g2b.a;
            }
        };
        xy7 xy7Var = this.F;
        xy7Var.getClass();
        xy7Var.K = mh4Var;
        xy7Var.L = new mh4() { // from class: zl1
            @Override // defpackage.mh4
            public final Object invoke() throws IOException {
                am1.a aVar = am1.Companion;
                ((kx3) this.t.E.getValue()).c();
                return g2b.a;
            }
        };
        int i2 = 1;
        xy7Var.M = new zq(i2, this);
        xy7Var.N = new br(i2, this);
        kx3 kx3Var = (kx3) this.E.getValue();
        oh4<? super kx3.c, g2b> oh4Var = new oh4() { // from class: ll1
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                kx3.c cVar = (kx3.c) obj;
                am1.a aVar = am1.Companion;
                cVar.getClass();
                boolean z = cVar instanceof kx3.c.b;
                am1 am1Var = this.t;
                if (z) {
                    qn1 qn1VarS = am1Var.s();
                    List<rc9> list = ((kx3.c.b) cVar).a;
                    list.getClass();
                    oy0.d(rhb.b(qn1VarS), null, null, new io1(qn1VarS, new db(null, list), null), 3);
                } else {
                    if (!(cVar instanceof kx3.c.a)) {
                        u.b();
                        return null;
                    }
                    am1Var.m(((kx3.c.a) cVar).a);
                }
                return g2b.a;
            }
        };
        kx3Var.getClass();
        kx3Var.B = oh4Var;
        je4 je4VarR = r();
        ee5.a(new rl1(), je4VarR.c);
        ee5.a(new sl1(), je4VarR.j);
        s().V.e(getViewLifecycleOwner(), new bm1(new cm1(this)));
        s().W.e(getViewLifecycleOwner(), new bm1(new dm1(this)));
        s().X.e(getViewLifecycleOwner(), new bm1(new em1(this)));
        s().Y.e(getViewLifecycleOwner(), new bm1(new fm1(this)));
        s().Z.e(getViewLifecycleOwner(), new bm1(new gm1(this)));
        qn1 qn1VarS = s();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        qn1VarS.c(viewLifecycleOwner, new oh4() { // from class: kl1
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                gm3 gm3Var = (gm3) obj;
                am1.a aVar = am1.Companion;
                gm3Var.getClass();
                boolean z = gm3Var instanceof gl1;
                final am1 am1Var = this.t;
                if (z) {
                    am1Var.m(((gl1) gm3Var).b);
                } else if (gm3Var instanceof il1) {
                    am1Var.r().f.setRefreshing(false);
                } else if (gm3Var instanceof yk1) {
                    Editable text = am1Var.r().g.getText();
                    if (text != null) {
                        text.clear();
                    }
                } else if (gm3Var instanceof hl1) {
                    vo6 vo6Var = new vo6();
                    l childFragmentManager = am1Var.getChildFragmentManager();
                    childFragmentManager.getClass();
                    vo6Var.s(childFragmentManager);
                } else if (gm3Var instanceof zk1) {
                    l55.b bVar = ((zk1) gm3Var).b;
                    am1Var.t(new ql1(0, am1Var));
                    m55.Companion.getClass();
                    m55 m55VarA = m55.a.a(bVar);
                    l childFragmentManager2 = am1Var.getChildFragmentManager();
                    childFragmentManager2.getClass();
                    m55VarA.r(childFragmentManager2);
                } else if (gm3Var instanceof dl1) {
                    xy7 xy7Var2 = am1Var.F;
                    l childFragmentManager3 = am1Var.getChildFragmentManager();
                    childFragmentManager3.getClass();
                    xy7Var2.s(childFragmentManager3);
                } else if (gm3Var instanceof fl1) {
                    l55.b bVar2 = ((fl1) gm3Var).b;
                    am1Var.t(new mh4() { // from class: pl1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            am1.a aVar2 = am1.Companion;
                            qn1 qn1VarS2 = am1Var.s();
                            qn1VarS2.N.getClass();
                            qn1VarS2.f(new al1());
                            return g2b.a;
                        }
                    });
                    m55.Companion.getClass();
                    m55 m55VarA2 = m55.a.a(bVar2);
                    l childFragmentManager4 = am1Var.getChildFragmentManager();
                    childFragmentManager4.getClass();
                    m55VarA2.r(childFragmentManager4);
                } else if (gm3Var instanceof cl1) {
                    Context context = am1Var.getContext();
                    if (context != null) {
                        yz1.a(context, ((cl1) gm3Var).b);
                    }
                } else if (gm3Var instanceof atb) {
                    btb.a aVar2 = btb.Companion;
                    String str = ((atb) gm3Var).b;
                    aVar2.getClass();
                    hk0.l(am1Var, btb.a.a(str));
                } else if (gm3Var instanceof al1) {
                    Context context2 = am1Var.getContext();
                    if (context2 != null) {
                        String str2 = ((al1) gm3Var).b;
                        ho5<Object>[] ho5VarArr = yz1.a;
                        str2.getClass();
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.parse("mailto:"));
                        intent.putExtra("android.intent.extra.EMAIL", new String[]{str2});
                        try {
                            context2.startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(context2, context2.getString(R.string.no_email_clients_error), 1).show();
                        }
                    }
                } else if (gm3Var instanceof bl1) {
                    Context context3 = am1Var.getContext();
                    if (context3 != null) {
                        bl1 bl1Var = (bl1) gm3Var;
                        File file = bl1Var.b;
                        String str3 = bl1Var.c;
                        String str4 = bl1Var.d;
                        file.getClass();
                        str3.getClass();
                        str4.getClass();
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setFlags(1);
                        intent2.setDataAndType(FileProvider.getUriForFile(context3, str4.concat(".fileprovider"), file), str3);
                        try {
                            context3.startActivity(intent2);
                        } catch (ActivityNotFoundException unused2) {
                            am1.a aVar3 = am1.Companion;
                            Toast.makeText(am1Var.requireContext(), am1Var.getResources().getString(R.string.file_can_not_be_open), 0).show();
                            g2b g2bVar = g2b.a;
                        }
                    }
                } else if (gm3Var instanceof jl1) {
                    am1Var.t(new mh4() { // from class: nl1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            am1.a aVar4 = am1.Companion;
                            am1Var.s().x.b();
                            return g2b.a;
                        }
                    });
                    yy3.Companion.getClass();
                    yy3 yy3Var = new yy3();
                    l childFragmentManager5 = am1Var.getChildFragmentManager();
                    childFragmentManager5.getClass();
                    yy3Var.r(childFragmentManager5);
                } else if (gm3Var instanceof el1) {
                    el1 el1Var = (el1) gm3Var;
                    boolean z2 = el1Var.b;
                    boolean z3 = el1Var.c;
                    qj1.Companion.getClass();
                    qj1 qj1Var = new qj1();
                    qj1Var.setArguments(uy0.c(new js7("com.hwpo_training_app.comments.presentation.dialog.CommentActionsDialogFragment.ARG_IS_DELETE_VISIBLE", Boolean.valueOf(z2)), new js7("com.hwpo_training_app.comments.presentation.dialog.CommentActionsDialogFragment.ARG_IS_REPORT_VISIBLE", Boolean.valueOf(z3))));
                    qj1Var.L = new km1(0, am1Var.s(), qn1.class, "onPickActionDeleteComment", "onPickActionDeleteComment()V", 0);
                    qj1Var.M = new lm1(0, am1Var.s(), qn1.class, "reportComment", "reportComment()V", 0);
                    l childFragmentManager6 = am1Var.getChildFragmentManager();
                    childFragmentManager6.getClass();
                    qj1Var.s(childFragmentManager6);
                }
                return g2b.a;
            }
        });
        q().r(this.G);
        je4 je4VarR2 = r();
        je4VarR2.f.setColorSchemeResources(R.color.colorPrimary);
        RecyclerView recyclerView = je4VarR2.e;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(q());
        recyclerView.setItemAnimator(null);
        Drawable drawable = requireContext().getDrawable(R.drawable.common_divider);
        if (drawable != null) {
            recyclerView.h(new feb(drawable, 0, 0));
        } else {
            z90.a("Required value was null.");
        }
    }

    public final vk1 q() {
        return (vk1) this.D.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final je4 r() {
        T tA = this.B.a(this, H[0]);
        tA.getClass();
        return (je4) tA;
    }

    public final qn1 s() {
        return (qn1) this.C.getValue();
    }

    public final void t(final mh4<g2b> mh4Var) {
        getChildFragmentManager().f0("result_dialog_confirm", getViewLifecycleOwner(), new pf4() { // from class: ol1
            @Override // defpackage.pf4
            public final void d(Bundle bundle, String str) {
                am1.a aVar = am1.Companion;
                this.t.getChildFragmentManager().e("result_dialog_confirm");
                if (bundle.getBoolean("arg_dialog_is_confirmed")) {
                    mh4Var.invoke();
                }
            }
        });
    }
}
