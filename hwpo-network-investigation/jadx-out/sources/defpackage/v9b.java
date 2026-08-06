package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel$observeFileDownloading$1", f = "ValueDetailsViewModel.kt", l = {197, 198}, m = "invokeSuspend", v = 2)
public final class v9b extends p6a implements ci4<xd3<? extends Exception, ? extends ww3>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ o9b v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends wa implements ci4<ww3, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(ww3 ww3Var, r02<? super g2b> r02Var) {
            Object next;
            ww3 ww3Var2 = ww3Var;
            o9b o9bVar = (o9b) this.receiver;
            int i = o9b.m0;
            List<l89> list = o9bVar.b().l.g;
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!xj5.a(((l89) next).w, ww3Var2.a()));
            l89 l89Var = (l89) next;
            if (l89Var != null) {
                l89 l89VarA = l89.a(l89Var, fk2.a(ww3Var2), null, 15359);
                Iterator<l89> it2 = list.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (it2.next().t == l89VarA.t) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    ArrayList arrayList = new ArrayList(list);
                    arrayList.set(i2, l89VarA);
                    t59 t59Var = o9bVar.b().l;
                    boolean z = t59Var.a;
                    boolean z2 = t59Var.b;
                    boolean z3 = t59Var.c;
                    String str = t59Var.d;
                    List<String> list2 = t59Var.e;
                    List<l89> list3 = t59Var.f;
                    long j = t59Var.h;
                    str.getClass();
                    list2.getClass();
                    list3.getClass();
                    o9bVar.e(new d8b.m(new t59(z, z2, z3, str, list2, list3, arrayList, j)));
                }
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends wa implements ci4<Throwable, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Throwable th, r02<? super g2b> r02Var) {
            ((rma.a) this.receiver).b(th);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9b(o9b o9bVar, r02<? super v9b> r02Var) {
        super(2, r02Var);
        this.v = o9bVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        v9b v9bVar = new v9b(this.v, r02Var);
        v9bVar.u = obj;
        return v9bVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends ww3> xd3Var, r02<? super g2b> r02Var) {
        return ((v9b) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r14, r6, r13) == r5) goto L15;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.Object r0 = r13.u
            xd3 r0 = (defpackage.xd3) r0
            int r1 = r13.t
            r2 = 0
            r3 = 2
            r4 = 1
            v72 r5 = defpackage.v72.t
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            defpackage.dv8.b(r14)
            goto L58
        L15:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r13)
            return r2
        L1b:
            defpackage.dv8.b(r14)
            goto L3c
        L1f:
            defpackage.dv8.b(r14)
            v9b$a r6 = new v9b$a
            java.lang.String r11 = "updateFileStatus(Lcom/hwpo_training_app/domain/entity/FileDownloadingStatus;)V"
            r12 = 4
            r7 = 2
            o9b r8 = r13.v
            java.lang.Class<o9b> r9 = defpackage.o9b.class
            java.lang.String r10 = "updateFileStatus"
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.u = r2
            r13.t = r4
            java.lang.Object r14 = defpackage.yd3.b(r0, r6, r13)
            if (r14 != r5) goto L3c
            goto L57
        L3c:
            xd3 r14 = (defpackage.xd3) r14
            v9b$b r6 = new v9b$b
            rma$a r8 = defpackage.rma.a
            java.lang.String r11 = "e(Ljava/lang/Throwable;)V"
            r12 = 4
            r7 = 2
            java.lang.Class<rma$a> r9 = rma.a.class
            java.lang.String r10 = "e"
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.u = r2
            r13.t = r3
            java.lang.Object r13 = defpackage.yd3.a(r14, r6, r13)
            if (r13 != r5) goto L58
        L57:
            return r5
        L58:
            g2b r13 = defpackage.g2b.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
