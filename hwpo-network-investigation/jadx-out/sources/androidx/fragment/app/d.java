package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.fragment.app.l;
import androidx.fragment.app.u;
import defpackage.g2b;
import defpackage.j41;
import defpackage.mh4;
import defpackage.og4;
import defpackage.wp5;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends wp5 implements mh4<g2b> {
    public final /* synthetic */ c.g u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ ViewGroup w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ViewGroup viewGroup, c.g gVar, Object obj) {
        super(0);
        this.u = gVar;
        this.v = obj;
        this.w = viewGroup;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [xt2] */
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
    @Override // defpackage.mh4
    public final g2b invoke() {
        final c.g gVar = this.u;
        ArrayList arrayList = gVar.c;
        og4 og4Var = gVar.f;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (!((c.h) obj).a.g) {
                    if (l.M(2)) {
                        Log.v("FragmentManager", "Completing animating immediately");
                    }
                    j41 j41Var = new j41();
                    og4Var.u(((c.h) arrayList.get(0)).a.c, this.v, j41Var, new Runnable() { // from class: yt2
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (l.M(2)) {
                                Log.v("FragmentManager", "Transition for all operations has completed");
                            }
                            c.g gVar2 = gVar;
                            ArrayList arrayList2 = gVar2.c;
                            int size2 = arrayList2.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object obj2 = arrayList2.get(i2);
                                i2++;
                                ((c.h) obj2).a.c(gVar2);
                            }
                        }
                    });
                    j41Var.a();
                }
            }
            if (l.M(2)) {
                Log.v("FragmentManager", "Animating to start");
            }
            Object obj2 = gVar.q;
            obj2.getClass();
            final ViewGroup viewGroup = this.w;
            og4Var.d(obj2, new Runnable() { // from class: xt2
                @Override // java.lang.Runnable
                public final void run() {
                    ViewGroup viewGroup2 = viewGroup;
                    viewGroup2.getClass();
                    ArrayList arrayList2 = gVar.c;
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj3 = arrayList2.get(i2);
                        i2++;
                        u.c cVar = ((c.h) obj3).a;
                        View view = cVar.c.getView();
                        if (view != null) {
                            cVar.a.a(view, viewGroup2);
                        }
                    }
                }
            });
        } else {
            if (l.M(2)) {
                Log.v("FragmentManager", "Animating to start");
            }
            Object obj3 = gVar.q;
            obj3.getClass();
            final ViewGroup viewGroup2 = this.w;
            og4Var.d(obj3, new Runnable() { // from class: xt2
                @Override // java.lang.Runnable
                public final void run() {
                    ViewGroup viewGroup3 = viewGroup2;
                    viewGroup3.getClass();
                    ArrayList arrayList2 = gVar.c;
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj4 = arrayList2.get(i2);
                        i2++;
                        u.c cVar = ((c.h) obj4).a;
                        View view = cVar.c.getView();
                        if (view != null) {
                            cVar.a.a(view, viewGroup3);
                        }
                    }
                }
            });
        }
        return g2b.a;
    }
}
