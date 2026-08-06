package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class or1 implements ji4 {
    @Override // defpackage.ji4
    public final Object a(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, jt1 jt1Var, Integer num) {
        int i;
        String str = (String) obj;
        boolean zBooleanValue = bool.booleanValue();
        b02 b02Var = (b02) obj2;
        ei4 ei4Var = (ei4) obj3;
        mh4 mh4Var = (mh4) obj4;
        int iIntValue = num.intValue();
        int i2 = iIntValue & 6;
        ox6.a aVar = ox6.a.t;
        if (i2 == 0) {
            i = (jt1Var.J(aVar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= jt1Var.J(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= jt1Var.c(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= jt1Var.J(b02Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= jt1Var.j(ei4Var) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= jt1Var.j(mh4Var) ? 131072 : 65536;
        }
        if (jt1Var.A(i & 1, (599187 & i) != 599186)) {
            m02.c(str, zBooleanValue, b02Var, aVar, ei4Var, mh4Var, jt1Var, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            jt1Var.u();
        }
        return g2b.a;
    }
}
