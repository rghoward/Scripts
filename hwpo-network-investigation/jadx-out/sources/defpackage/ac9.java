package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ac9 {
    public static final gc9<List<String>> a = new gc9<>("ContentDescription", true, b.u);
    public static final gc9<String> b = new gc9<>("StateDescription", 0);
    public static final gc9<ud8> c = new gc9<>("ProgressBarRangeInfo", 0);
    public static final gc9<String> d = new gc9<>("PaneTitle", true, j.u);
    public static final gc9<g2b> e = new gc9<>("SelectableGroup", 0);
    public static final gc9<ah1> f = new gc9<>("CollectionInfo", 0);
    public static final gc9<ch1> g = new gc9<>("CollectionItemInfo", 0);
    public static final gc9<g2b> h = new gc9<>("Heading", 0);
    public static final gc9<g2b> i = new gc9<>("TextEntryKey", 0);
    public static final gc9<g2b> j = new gc9<>("Disabled", 0);
    public static final gc9<nb6> k = new gc9<>("LiveRegion", 0);
    public static final gc9<Boolean> l = new gc9<>("Focused", 0);
    public static final gc9<Boolean> m = new gc9<>("IsContainer", 0);
    public static final gc9<Boolean> n = new gc9<>("IsTraversalGroup");
    public static final gc9<Boolean> o = new gc9<>("IsSensitiveData");
    public static final gc9<g2b> p = new gc9<>("InvisibleToUser", f.u);
    public static final gc9<g2b> q = new gc9<>("HideFromAccessibility", e.u);
    public static final gc9<pz1> r = new gc9<>("ContentType", c.u);
    public static final gc9<bz1> s = new gc9<>("ContentDataType", a.u);
    public static final gc9<dz3> t = new gc9<>("FillableData", d.u);
    public static final gc9<Float> u = new gc9<>("TraversalIndex", o.u);
    public static final gc9<c69> v = new gc9<>("HorizontalScrollAxisRange", 0);
    public static final gc9<c69> w = new gc9<>("VerticalScrollAxisRange", 0);
    public static final gc9<g2b> x = new gc9<>("IsPopup", true, h.u);
    public static final gc9<g2b> y = new gc9<>("IsDialog", true, g.u);
    public static final gc9<ex8> z = new gc9<>("Role", true, k.u);
    public static final gc9<String> A = new gc9<>("TestTag", false, m.u);
    public static final gc9<g2b> B = new gc9<>("LinkTestMarker", false, i.u);
    public static final gc9<List<iw>> C = new gc9<>("Text", true, n.u);
    public static final gc9<iw> D = new gc9<>("TextSubstitution");
    public static final gc9<Boolean> E = new gc9<>("IsShowingTextSubstitution");
    public static final gc9<iw> F = new gc9<>("InputText", 0);
    public static final gc9<iw> G = new gc9<>("EditableText", 0);
    public static final gc9<lja> H = new gc9<>("TextSelectionRange", 0);
    public static final gc9<r85> I = new gc9<>("ImeAction", 0);
    public static final gc9<Boolean> J = new gc9<>("Selected", 0);
    public static final gc9<fqa> K = new gc9<>("ToggleableState", 0);
    public static final gc9<g2b> L = new gc9<>("Password", 0);
    public static final gc9<String> M = new gc9<>("Error", 0);
    public static final gc9<oh4<Object, Integer>> N = new gc9<>("IndexForKey");
    public static final gc9<Boolean> O = new gc9<>("IsEditable");
    public static final gc9<Integer> P = new gc9<>("MaxTextLength");
    public static final gc9<jl9> Q = new gc9<>("Shape", false, l.u);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements ci4<bz1, bz1, bz1> {
        public static final a u = new a(2);

        @Override // defpackage.ci4
        public final bz1 invoke(bz1 bz1Var, bz1 bz1Var2) {
            return bz1Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements ci4<List<? extends String>, List<? extends String>, List<? extends String>> {
        public static final b u = new b(2);

        @Override // defpackage.ci4
        public final List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
            List<? extends String> list3 = list;
            List<? extends String> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList arrayList = new ArrayList(list3);
            arrayList.addAll(list4);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements ci4<pz1, pz1, pz1> {
        public static final c u = new c(2);

        @Override // defpackage.ci4
        public final pz1 invoke(pz1 pz1Var, pz1 pz1Var2) {
            return pz1Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends wp5 implements ci4<dz3, dz3, dz3> {
        public static final d u = new d(2);

        @Override // defpackage.ci4
        public final dz3 invoke(dz3 dz3Var, dz3 dz3Var2) {
            return dz3Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends wp5 implements ci4<g2b, g2b, g2b> {
        public static final e u = new e(2);

        @Override // defpackage.ci4
        public final g2b invoke(g2b g2bVar, g2b g2bVar2) {
            return g2bVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends wp5 implements ci4<g2b, g2b, g2b> {
        public static final f u = new f(2);

        @Override // defpackage.ci4
        public final g2b invoke(g2b g2bVar, g2b g2bVar2) {
            return g2bVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g extends wp5 implements ci4<g2b, g2b, g2b> {
        public static final g u = new g(2);

        @Override // defpackage.ci4
        public final g2b invoke(g2b g2bVar, g2b g2bVar2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h extends wp5 implements ci4<g2b, g2b, g2b> {
        public static final h u = new h(2);

        @Override // defpackage.ci4
        public final g2b invoke(g2b g2bVar, g2b g2bVar2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i extends wp5 implements ci4<g2b, g2b, g2b> {
        public static final i u = new i(2);

        @Override // defpackage.ci4
        public final g2b invoke(g2b g2bVar, g2b g2bVar2) {
            return g2bVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j extends wp5 implements ci4<String, String, String> {
        public static final j u = new j(2);

        @Override // defpackage.ci4
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k extends wp5 implements ci4<ex8, ex8, ex8> {
        public static final k u = new k(2);

        @Override // defpackage.ci4
        public final ex8 invoke(ex8 ex8Var, ex8 ex8Var2) {
            ex8 ex8Var3 = ex8Var;
            int i = ex8Var2.a;
            return ex8Var3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class l extends wp5 implements ci4<jl9, jl9, jl9> {
        public static final l u = new l(2);

        @Override // defpackage.ci4
        public final jl9 invoke(jl9 jl9Var, jl9 jl9Var2) {
            return jl9Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class m extends wp5 implements ci4<String, String, String> {
        public static final m u = new m(2);

        @Override // defpackage.ci4
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class n extends wp5 implements ci4<List<? extends iw>, List<? extends iw>, List<? extends iw>> {
        public static final n u = new n(2);

        @Override // defpackage.ci4
        public final List<? extends iw> invoke(List<? extends iw> list, List<? extends iw> list2) {
            List<? extends iw> list3 = list;
            List<? extends iw> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList arrayList = new ArrayList(list3);
            arrayList.addAll(list4);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class o extends wp5 implements ci4<Float, Float, Float> {
        public static final o u = new o(2);

        @Override // defpackage.ci4
        public final Float invoke(Float f, Float f2) {
            Float f3 = f;
            f2.floatValue();
            return f3;
        }
    }
}
