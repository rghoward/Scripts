package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u7a {
    public final a a;
    public final ArrayList<c> b = new ArrayList<>();
    public xd5 c;
    public xd5 d;
    public int e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends View {
        public final /* synthetic */ ViewGroup t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ViewGroup viewGroup) {
            super(context);
            this.t = viewGroup;
        }

        @Override // android.view.View
        public final void onConfigurationChanged(Configuration configuration) {
            u7a u7aVar = u7a.this;
            ArrayList<c> arrayList = u7aVar.b;
            Drawable background = this.t.getBackground();
            int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
            if (u7aVar.e != color) {
                u7aVar.e = color;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).e(color);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b extends pmb.b {
        public final HashMap<pmb, Integer> v;

        public b() {
            super(0);
            this.v = new HashMap<>();
        }

        @Override // pmb.b
        public final void a(pmb pmbVar) {
            ArrayList<c> arrayList = u7a.this.b;
            if ((pmbVar.a.d() & 519) != 0) {
                this.v.remove(pmbVar);
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).b();
                }
            }
        }

        @Override // pmb.b
        public final void c(pmb pmbVar) {
            ArrayList<c> arrayList = u7a.this.b;
            if ((pmbVar.a.d() & 519) != 0) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).a();
                }
            }
        }

        @Override // pmb.b
        public final umb d(umb umbVar, List<pmb> list) {
            ArrayList<c> arrayList = u7a.this.b;
            RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
            int i = 0;
            for (int size = list.size() - 1; size >= 0; size--) {
                pmb pmbVar = list.get(size);
                Integer num = this.v.get(pmbVar);
                if (num != null) {
                    int iIntValue = num.intValue();
                    float fA = pmbVar.a.a();
                    if ((iIntValue & 1) != 0) {
                        rectF.left = fA;
                    }
                    if ((iIntValue & 2) != 0) {
                        rectF.top = fA;
                    }
                    if ((iIntValue & 4) != 0) {
                        rectF.right = fA;
                    }
                    if ((iIntValue & 8) != 0) {
                        rectF.bottom = fA;
                    }
                    i |= iIntValue;
                }
            }
            xd5 xd5VarB = xd5.b(umbVar.a.i(519), umbVar.a.i(64));
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).c(i, xd5VarB, rectF);
            }
            return umbVar;
        }

        @Override // pmb.b
        public final pmb.a e(pmb pmbVar, pmb.a aVar) {
            if ((pmbVar.a.d() & 519) != 0) {
                xd5 xd5Var = aVar.b;
                xd5 xd5Var2 = aVar.a;
                int i = xd5Var.a != xd5Var2.a ? 1 : 0;
                if (xd5Var.b != xd5Var2.b) {
                    i |= 2;
                }
                if (xd5Var.c != xd5Var2.c) {
                    i |= 4;
                }
                if (xd5Var.d != xd5Var2.d) {
                    i |= 8;
                }
                this.v.put(pmbVar, Integer.valueOf(i));
            }
            return aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
        void a();

        void b();

        void c(int i, xd5 xd5Var, RectF rectF);

        void d(xd5 xd5Var, xd5 xd5Var2);

        void e(int i);
    }

    public u7a(ViewGroup viewGroup) {
        View childAt;
        xd5 xd5Var = xd5.e;
        this.c = xd5Var;
        this.d = xd5Var;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        a aVar = new a(viewGroup.getContext(), viewGroup);
        this.a = aVar;
        aVar.setVisibility(8);
        aVar.setWillNotDraw(true);
        pg7 pg7Var = new pg7() { // from class: s7a
            @Override // defpackage.pg7
            public final umb b(View view, umb umbVar) {
                u7a u7aVar = this.t;
                ArrayList<u7a.c> arrayList = u7aVar.b;
                umb.q qVar = umbVar.a;
                xd5 xd5VarB = xd5.b(qVar.i(519), qVar.i(64));
                xd5 xd5VarB2 = xd5.b(qVar.j(519), qVar.j(64));
                if (!xd5VarB.equals(u7aVar.c) || !xd5VarB2.equals(u7aVar.d)) {
                    u7aVar.c = xd5VarB;
                    u7aVar.d = xd5VarB2;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        arrayList.get(size).d(xd5VarB, xd5VarB2);
                    }
                }
                return umbVar;
            }
        };
        WeakHashMap<View, fib> weakHashMap = egb.a;
        egb.d.c(aVar, pg7Var);
        egb.q(aVar, new b());
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            if (childAt.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (childAt == null) {
            viewGroup.addView(aVar, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new v7a(viewGroup, aVar));
        }
    }
}
