package io.intercom.android.sdk.m5.preview.ui;

import defpackage.aa0;
import defpackage.bl7;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.h37;
import defpackage.hy5;
import defpackage.mh4;
import defpackage.nz5;
import defpackage.oz8;
import defpackage.p6a;
import defpackage.ph1;
import defpackage.r02;
import defpackage.s54;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.preview.ui.PreviewBottomBarKt$ThumbnailList$1$1", f = "PreviewBottomBar.kt", l = {97}, m = "invokeSuspend")
public final class PreviewBottomBarKt$ThumbnailList$1$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ nz5 $listState;
    final /* synthetic */ h37<List<Integer>> $visibleItems;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewBottomBarKt$ThumbnailList$1$1(nz5 nz5Var, h37<List<Integer>> h37Var, r02<? super PreviewBottomBarKt$ThumbnailList$1$1> r02Var) {
        super(2, r02Var);
        this.$listState = nz5Var;
        this.$visibleItems = h37Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$1(nz5 nz5Var) {
        List<hy5> listG = nz5Var.j().g();
        ArrayList arrayList = new ArrayList(ph1.n(listG, 10));
        Iterator<T> it = listG.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((hy5) it.next()).getIndex()));
        }
        return arrayList;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new PreviewBottomBarKt$ThumbnailList$1$1(this.$listState, this.$visibleItems, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((PreviewBottomBarKt$ThumbnailList$1$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            final nz5 nz5Var = this.$listState;
            oz8 oz8VarK = bl7.k(new mh4() { // from class: io.intercom.android.sdk.m5.preview.ui.h
                @Override // defpackage.mh4
                public final Object invoke() {
                    return PreviewBottomBarKt$ThumbnailList$1$1.invokeSuspend$lambda$1(nz5Var);
                }
            });
            final h37<List<Integer>> h37Var = this.$visibleItems;
            s54 s54Var = new s54() { // from class: io.intercom.android.sdk.m5.preview.ui.PreviewBottomBarKt$ThumbnailList$1$1.2
                public final Object emit(List<Integer> list, r02<? super g2b> r02Var) {
                    h37Var.setValue(list);
                    return g2b.a;
                }

                @Override // defpackage.s54
                public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                    return emit((List<Integer>) obj2, (r02<? super g2b>) r02Var);
                }
            };
            this.label = 1;
            Object objCollect = oz8VarK.collect(s54Var, this);
            v72 v72Var = v72.t;
            if (objCollect == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
