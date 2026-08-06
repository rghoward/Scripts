package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oy9 {
    public final pa1 a;
    public final boolean b;
    public final c c;
    public final int d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements c {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // oy9.c
        public final Iterator a(oy9 oy9Var, CharSequence charSequence) {
            return new ny9(this, oy9Var, charSequence);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class b extends i1<String> {
        public final CharSequence v;
        public final pa1 w;
        public final boolean x;
        public int y;
        public int z;

        public b(oy9 oy9Var, CharSequence charSequence) {
            this.t = i1.a.u;
            this.y = 0;
            this.w = oy9Var.a;
            this.x = oy9Var.b;
            this.z = oy9Var.d;
            this.v = charSequence;
        }

        public abstract int a(int i);

        public abstract int b(int i);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
        Iterator<String> a(oy9 oy9Var, CharSequence charSequence);
    }

    public oy9(c cVar, boolean z, pa1 pa1Var, int i) {
        this.c = cVar;
        this.b = z;
        this.a = pa1Var;
        this.d = i;
    }

    public static oy9 a(String str) {
        xl7.f("The separator may not be the empty string.", str.length() != 0);
        return str.length() == 1 ? new oy9(new my9(new pa1.b(str.charAt(0)))) : new oy9(new a(str));
    }

    public final List<String> b(CharSequence charSequence) {
        charSequence.getClass();
        Iterator<String> itA = this.c.a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            i1 i1Var = (i1) itA;
            if (!i1Var.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) i1Var.next());
        }
    }

    public oy9(c cVar) {
        this(cVar, false, pa1.d.u, Integer.MAX_VALUE);
    }
}
