package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kb9 {
    public static final gc9<k3<mh4<Boolean>>> A;
    public static final gc9<k3<mh4<Boolean>>> B;
    public static final gc9<k3<oh4<List<Float>, Boolean>>> C;
    public static final gc9<k3<oh4<List<ria>, Boolean>>> a;
    public static final gc9<k3<mh4<Boolean>>> b;
    public static final gc9<k3<mh4<Boolean>>> c;
    public static final gc9<k3<ci4<Float, Float, Boolean>>> d;
    public static final gc9<ci4<vf7, r02<? super vf7>, Object>> e;
    public static final gc9<k3<oh4<Integer, Boolean>>> f;
    public static final gc9<k3<oh4<iw, Boolean>>> g;
    public static final gc9<k3<oh4<dz3, Boolean>>> h;
    public static final gc9<k3<oh4<Float, Boolean>>> i;
    public static final gc9<k3<ei4<Integer, Integer, Boolean, Boolean>>> j;
    public static final gc9<k3<oh4<iw, Boolean>>> k;
    public static final gc9<k3<oh4<iw, Boolean>>> l;
    public static final gc9<k3<oh4<Boolean, Boolean>>> m;
    public static final gc9<k3<mh4<Boolean>>> n;
    public static final gc9<k3<oh4<iw, Boolean>>> o;
    public static final gc9<k3<mh4<Boolean>>> p;
    public static final gc9<k3<mh4<Boolean>>> q;
    public static final gc9<k3<mh4<Boolean>>> r;
    public static final gc9<k3<mh4<Boolean>>> s;
    public static final gc9<k3<mh4<Boolean>>> t;
    public static final gc9<k3<mh4<Boolean>>> u;
    public static final gc9<k3<mh4<Boolean>>> v;
    public static final gc9<k3<mh4<Boolean>>> w;
    public static final gc9<List<dd2>> x;
    public static final gc9<k3<mh4<Boolean>>> y;
    public static final gc9<k3<mh4<Boolean>>> z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements ci4<List<? extends dd2>, List<? extends dd2>, List<? extends dd2>> {
        public static final a u = new a(2);

        @Override // defpackage.ci4
        public final List<? extends dd2> invoke(List<? extends dd2> list, List<? extends dd2> list2) {
            List<? extends dd2> list3 = list;
            List<? extends dd2> list4 = list2;
            if (list3 == null) {
                list3 = hf3.t;
            }
            return th1.K(list3, list4);
        }
    }

    static {
        cc9 cc9Var = cc9.u;
        a = new gc9<>("GetTextLayoutResult", true, cc9Var);
        b = new gc9<>("OnClick", true, cc9Var);
        c = new gc9<>("OnLongClick", true, cc9Var);
        d = new gc9<>("ScrollBy", true, cc9Var);
        e = new gc9<>("ScrollByOffset");
        f = new gc9<>("ScrollToIndex", true, cc9Var);
        g = new gc9<>("OnAutofillText", true, cc9Var);
        h = new gc9<>("OnFillData", true, cc9Var);
        i = new gc9<>("SetProgress", true, cc9Var);
        j = new gc9<>("SetSelection", true, cc9Var);
        k = new gc9<>("SetText", true, cc9Var);
        l = new gc9<>("SetTextSubstitution", true, cc9Var);
        m = new gc9<>("ShowTextSubstitution", true, cc9Var);
        n = new gc9<>("ClearTextSubstitution", true, cc9Var);
        o = new gc9<>("InsertTextAtCursor", true, cc9Var);
        p = new gc9<>("PerformImeAction", true, cc9Var);
        q = new gc9<>("CopyText", true, cc9Var);
        r = new gc9<>("CutText", true, cc9Var);
        s = new gc9<>("PasteText", true, cc9Var);
        t = new gc9<>("Expand", true, cc9Var);
        u = new gc9<>("Collapse", true, cc9Var);
        v = new gc9<>("Dismiss", true, cc9Var);
        w = new gc9<>("RequestFocus", true, cc9Var);
        x = new gc9<>("CustomActions", true, a.u);
        y = new gc9<>("PageUp", true, cc9Var);
        z = new gc9<>("PageLeft", true, cc9Var);
        A = new gc9<>("PageDown", true, cc9Var);
        B = new gc9<>("PageRight", true, cc9Var);
        C = new gc9<>("GetScrollViewportLength", true, cc9Var);
    }
}
