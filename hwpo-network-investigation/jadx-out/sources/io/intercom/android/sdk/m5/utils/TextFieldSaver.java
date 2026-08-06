package io.intercom.android.sdk.m5.utils;

import defpackage.aga;
import defpackage.ay;
import defpackage.e52;
import defpackage.i19;
import defpackage.k19;
import defpackage.kha;
import defpackage.lja;
import defpackage.ws0;
import defpackage.xa6;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TextFieldSaver {
    public static final TextFieldSaver INSTANCE = new TextFieldSaver();
    private static final i19<kha, ?> textFieldValueSaver = xa6.b(new aga(), new e52(1));
    public static final int $stable = 8;

    private TextFieldSaver() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List textFieldValueSaver$lambda$0(k19 k19Var, kha khaVar) {
        k19Var.getClass();
        khaVar.getClass();
        String str = khaVar.a.u;
        long j = khaVar.b;
        int i = lja.c;
        Integer numValueOf = Integer.valueOf((int) (j >> 32));
        Integer numValueOf2 = Integer.valueOf((int) (j & 4294967295L));
        lja ljaVar = khaVar.c;
        return ws0.i(str, numValueOf, numValueOf2, Integer.valueOf(ljaVar != null ? (int) (ljaVar.a >> 32) : -1), Integer.valueOf(ljaVar != null ? (int) (4294967295L & ljaVar.a) : -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kha textFieldValueSaver$lambda$1(List list) {
        lja ljaVar;
        list.getClass();
        Object obj = list.get(0);
        obj.getClass();
        String str = (String) obj;
        Object obj2 = list.get(1);
        obj2.getClass();
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(2);
        obj3.getClass();
        long jC = ay.c(iIntValue, ((Integer) obj3).intValue());
        Object obj4 = list.get(3);
        obj4.getClass();
        if (((Integer) obj4).intValue() >= 0) {
            Object obj5 = list.get(3);
            obj5.getClass();
            int iIntValue2 = ((Integer) obj5).intValue();
            Object obj6 = list.get(4);
            obj6.getClass();
            ljaVar = new lja(ay.c(iIntValue2, ((Integer) obj6).intValue()));
        } else {
            ljaVar = null;
        }
        return new kha(str, jC, ljaVar);
    }

    public final i19<kha, ?> getTextFieldValueSaver() {
        return textFieldValueSaver;
    }
}
