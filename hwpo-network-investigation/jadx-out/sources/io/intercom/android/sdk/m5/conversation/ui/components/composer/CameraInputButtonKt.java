package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.FileProvider;
import com.intercom.twig.BuildConfig;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.eh6;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.h31;
import defpackage.h37;
import defpackage.i31;
import defpackage.ia;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kh0;
import defpackage.kw7;
import defpackage.m9;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.t9;
import defpackage.u30;
import defpackage.u9;
import defpackage.vz1;
import defpackage.we1;
import defpackage.xj8;
import io.intercom.android.sdk.IntercomFileProviderKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.io.File;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CameraInputButtonKt {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraInputType.values().length];
            try {
                iArr[CameraInputType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraInputType.PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0161  */
    /* JADX WARN: Code duplicated, block: B:103:0x0172 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x0174  */
    /* JADX WARN: Code duplicated, block: B:107:0x0191  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:120:0x021a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x021c  */
    /* JADX WARN: Code duplicated, block: B:123:0x024b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0269  */
    /* JADX WARN: Code duplicated, block: B:128:0x026d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0286 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0288  */
    /* JADX WARN: Code duplicated, block: B:135:0x02af  */
    /* JADX WARN: Code duplicated, block: B:136:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:140:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:143:0x02d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:149:0x031b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0322  */
    /* JADX WARN: Code duplicated, block: B:152:0x0326  */
    /* JADX WARN: Code duplicated, block: B:156:0x035e  */
    /* JADX WARN: Code duplicated, block: B:158:0x036c  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x010b  */
    /* JADX WARN: Code duplicated, block: B:89:0x012c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0147  */
    /* JADX WARN: Code duplicated, block: B:94:0x014a  */
    /* JADX WARN: Code duplicated, block: B:96:0x014e  */
    /* JADX WARN: Code duplicated, block: B:99:0x015f  */
    public static final void CameraInputButton(ox6 ox6Var, final CameraInputType cameraInputType, final oh4<? super Uri, g2b> oh4Var, mh4<g2b> mh4Var, mh4<g2b> mh4Var2, final ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        CameraInputType cameraInputType2;
        int i4;
        int i5;
        mh4<g2b> mh4Var3;
        int i6;
        int i7;
        mh4<g2b> mh4Var4;
        int i8;
        int i9;
        ox6 ox6Var3;
        jt1.a.C0187a c0187a;
        int i10;
        mh4<g2b> mh4Var5;
        final Context context;
        Object objF;
        final h37 h37Var;
        int i11;
        final String str;
        boolean z;
        boolean zJ;
        Object objF2;
        final eh6 eh6VarF;
        Object objF3;
        final h37 h37Var2;
        final mh4<g2b> mh4Var6;
        boolean z2;
        int i12;
        boolean z3;
        boolean zJ2;
        Object objF4;
        final eh6 eh6VarF2;
        boolean z4;
        boolean z5;
        boolean zJ3;
        Object objF5;
        final mh4<g2b> mh4Var7;
        fl6 fl6VarD;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar;
        final ox6 ox6Var4;
        final mh4<g2b> mh4Var8;
        boolean z6;
        Object objF6;
        boolean zJ4;
        Object objF7;
        Object objF8;
        Object objF9;
        xj8 xj8VarW;
        cameraInputType.getClass();
        oh4Var.getClass();
        ci4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-2022676727);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                cameraInputType2 = cameraInputType;
                i3 |= bj4VarO.J(cameraInputType2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (bj4VarO.j(oh4Var)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    mh4Var3 = mh4Var;
                    if (bj4VarO.j(mh4Var3)) {
                        i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 16;
                if (i7 != 0) {
                    if ((i & 24576) == 0) {
                        mh4Var4 = mh4Var2;
                        if (bj4VarO.j(mh4Var4)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        if (bj4VarO.j(ci4Var)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 74899) == 74898 || !bj4VarO.r()) {
                        if (i13 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        c0187a = jt1.a.a;
                        i10 = 0;
                        if (i5 != 0) {
                            bj4VarO.K(-845519198);
                            objF9 = bj4VarO.f();
                            if (objF9 == c0187a) {
                                objF9 = new h31();
                                bj4VarO.C(objF9);
                            }
                            bj4VarO.U(false);
                            mh4Var5 = (mh4) objF9;
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        if (i7 != 0) {
                            bj4VarO.K(-845517886);
                            objF8 = bj4VarO.f();
                            if (objF8 == c0187a) {
                                objF8 = new i31(i10);
                                bj4VarO.C(objF8);
                            }
                            mh4Var4 = (mh4) objF8;
                            bj4VarO.U(false);
                        }
                        context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        bj4VarO.K(-845514337);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = bl7.i(BuildConfig.FLAVOR);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        bj4VarO.U(false);
                        i11 = WhenMappings.$EnumSwitchMapping$0[cameraInputType2.ordinal()];
                        if (i11 == 1) {
                            str = "videos";
                        } else {
                            if (i11 != 2) {
                                defpackage.u.b();
                                return;
                            }
                            str = "images";
                        }
                        u9 u9Var = new u9();
                        bj4VarO.K(-845504028);
                        if ((i3 & 896) == 256) {
                            z = true;
                        } else {
                            z = false;
                        }
                        zJ = z | bj4VarO.j(context) | bj4VarO.J(str);
                        objF2 = bj4VarO.f();
                        if (zJ || objF2 == c0187a) {
                            objF2 = new oh4() { // from class: j31
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        eh6VarF = ia.f(u9Var, (oh4) objF2, bj4VarO);
                        bj4VarO.K(-845473406);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF3);
                        }
                        h37Var2 = (h37) objF3;
                        bj4VarO.U(false);
                        bj4VarO.K(-845471236);
                        if (CameraInputButton$lambda$10(h37Var2)) {
                            String string = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                            String strF = nr1.f(bj4VarO, R.string.intercom_settings);
                            String strF2 = nr1.f(bj4VarO, R.string.intercom_not_now);
                            Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_camera);
                            bj4VarO.K(-845454121);
                            if ((57344 & i3) == 16384) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objF6 = bj4VarO.f();
                            if (z6 || objF6 == c0187a) {
                                objF6 = new kh0(mh4Var4, h37Var2);
                                bj4VarO.C(objF6);
                            }
                            mh4 mh4Var9 = (mh4) objF6;
                            bj4VarO.U(false);
                            bj4VarO.K(-845450328);
                            zJ4 = bj4VarO.j(context);
                            objF7 = bj4VarO.f();
                            if (zJ4 || objF7 == c0187a) {
                                objF7 = new mh4() { // from class: k31
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                                    }
                                };
                                bj4VarO.C(objF7);
                            }
                            mh4 mh4Var10 = (mh4) objF7;
                            z2 = false;
                            bj4VarO.U(false);
                            mh4Var6 = mh4Var4;
                            PermissionDeniedDialogKt.PermissionDeniedDialog(null, string, strF, strF2, numValueOf, mh4Var9, mh4Var10, bj4VarO, 0, 1);
                        } else {
                            mh4Var6 = mh4Var4;
                            z2 = false;
                        }
                        bj4VarO.U(z2);
                        t9 t9Var = new t9();
                        bj4VarO.K(-845437412);
                        i12 = i3 & 112;
                        if (i12 == 32) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        zJ2 = z3 | bj4VarO.j(context) | bj4VarO.J(str) | bj4VarO.j(eh6VarF);
                        objF4 = bj4VarO.f();
                        if (zJ2 || objF4 == c0187a) {
                            final String str2 = str;
                            objF4 = new oh4() { // from class: l31
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str2, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                                }
                            };
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(z2);
                        eh6VarF2 = ia.f(t9Var, (oh4) objF4, bj4VarO);
                        bj4VarO.K(-845427931);
                        if ((i3 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        boolean zJ5 = z4 | bj4VarO.j(context);
                        if (i12 == 32) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        zJ3 = z5 | zJ5 | bj4VarO.J(str) | bj4VarO.j(eh6VarF) | bj4VarO.j(eh6VarF2);
                        objF5 = bj4VarO.f();
                        if (!zJ3 || objF5 == c0187a) {
                            mh4Var7 = mh4Var5;
                            final String str3 = str;
                            objF5 = new mh4() { // from class: m31
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str3, eh6VarF, h37Var);
                                }
                            };
                            bj4VarO.C(objF5);
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        bj4VarO.U(z2);
                        ox6 ox6VarC2 = we1.c(ox6Var3, z2, null, (mh4) objF5, 15);
                        fl6VarD = dv0.d(di.a.a, z2);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarC2);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        ci4Var.invoke(bj4VarO, Integer.valueOf((i3 >> 15) & 14));
                        bj4VarO.U(true);
                        ox6Var4 = ox6Var3;
                        mh4Var8 = mh4Var7;
                    } else {
                        bj4VarO.u();
                        ox6Var4 = ox6Var2;
                        mh4Var6 = mh4Var4;
                        mh4Var8 = mh4Var3;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: n31
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return CameraInputButtonKt.CameraInputButton$lambda$21(ox6Var4, cameraInputType, oh4Var, mh4Var8, mh4Var6, ci4Var, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                mh4Var4 = mh4Var2;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bj4VarO.j(ci4Var)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i3 & 74899) == 74898) {
                    if (i13 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    c0187a = jt1.a.a;
                    i10 = 0;
                    if (i5 != 0) {
                        bj4VarO.K(-845519198);
                        objF9 = bj4VarO.f();
                        if (objF9 == c0187a) {
                            objF9 = new h31();
                            bj4VarO.C(objF9);
                        }
                        bj4VarO.U(false);
                        mh4Var5 = (mh4) objF9;
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    if (i7 != 0) {
                        bj4VarO.K(-845517886);
                        objF8 = bj4VarO.f();
                        if (objF8 == c0187a) {
                            objF8 = new i31(i10);
                            bj4VarO.C(objF8);
                        }
                        mh4Var4 = (mh4) objF8;
                        bj4VarO.U(false);
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    bj4VarO.K(-845514337);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(BuildConfig.FLAVOR);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    bj4VarO.U(false);
                    i11 = WhenMappings.$EnumSwitchMapping$0[cameraInputType2.ordinal()];
                    if (i11 == 1) {
                        str = "videos";
                    } else {
                        if (i11 != 2) {
                            defpackage.u.b();
                            return;
                        }
                        str = "images";
                    }
                    u9 u9Var2 = new u9();
                    bj4VarO.K(-845504028);
                    if ((i3 & 896) == 256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zJ = z | bj4VarO.j(context) | bj4VarO.J(str);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new oh4() { // from class: j31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: j31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    eh6VarF = ia.f(u9Var2, (oh4) objF2, bj4VarO);
                    bj4VarO.K(-845473406);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF3);
                    }
                    h37Var2 = (h37) objF3;
                    bj4VarO.U(false);
                    bj4VarO.K(-845471236);
                    if (CameraInputButton$lambda$10(h37Var2)) {
                        String string2 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                        String strF3 = nr1.f(bj4VarO, R.string.intercom_settings);
                        String strF4 = nr1.f(bj4VarO, R.string.intercom_not_now);
                        Integer numValueOf2 = Integer.valueOf(R.drawable.intercom_ic_camera);
                        bj4VarO.K(-845454121);
                        if ((57344 & i3) == 16384) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objF6 = bj4VarO.f();
                        if (z6) {
                            objF6 = new kh0(mh4Var4, h37Var2);
                            bj4VarO.C(objF6);
                        } else {
                            objF6 = new kh0(mh4Var4, h37Var2);
                            bj4VarO.C(objF6);
                        }
                        mh4 mh4Var11 = (mh4) objF6;
                        bj4VarO.U(false);
                        bj4VarO.K(-845450328);
                        zJ4 = bj4VarO.j(context);
                        objF7 = bj4VarO.f();
                        if (zJ4) {
                            objF7 = new mh4() { // from class: k31
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                                }
                            };
                            bj4VarO.C(objF7);
                        } else {
                            objF7 = new mh4() { // from class: k31
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                                }
                            };
                            bj4VarO.C(objF7);
                        }
                        mh4 mh4Var12 = (mh4) objF7;
                        z2 = false;
                        bj4VarO.U(false);
                        mh4Var6 = mh4Var4;
                        PermissionDeniedDialogKt.PermissionDeniedDialog(null, string2, strF3, strF4, numValueOf2, mh4Var11, mh4Var12, bj4VarO, 0, 1);
                    } else {
                        mh4Var6 = mh4Var4;
                        z2 = false;
                    }
                    bj4VarO.U(z2);
                    t9 t9Var2 = new t9();
                    bj4VarO.K(-845437412);
                    i12 = i3 & 112;
                    if (i12 == 32) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    zJ2 = z3 | bj4VarO.j(context) | bj4VarO.J(str) | bj4VarO.j(eh6VarF);
                    objF4 = bj4VarO.f();
                    if (zJ2) {
                        final String str4 = str;
                        objF4 = new oh4() { // from class: l31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str4, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        final String str5 = str;
                        objF4 = new oh4() { // from class: l31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str5, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(z2);
                    eh6VarF2 = ia.f(t9Var2, (oh4) objF4, bj4VarO);
                    bj4VarO.K(-845427931);
                    if ((i3 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    boolean zJ6 = z4 | bj4VarO.j(context);
                    if (i12 == 32) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    zJ3 = z5 | zJ6 | bj4VarO.J(str) | bj4VarO.j(eh6VarF) | bj4VarO.j(eh6VarF2);
                    objF5 = bj4VarO.f();
                    if (zJ3) {
                        mh4Var7 = mh4Var5;
                        final String str6 = str;
                        objF5 = new mh4() { // from class: m31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str6, eh6VarF, h37Var);
                            }
                        };
                        bj4VarO.C(objF5);
                    } else {
                        mh4Var7 = mh4Var5;
                        final String str7 = str;
                        objF5 = new mh4() { // from class: m31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str7, eh6VarF, h37Var);
                            }
                        };
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(z2);
                    ox6 ox6VarC3 = we1.c(ox6Var3, z2, null, (mh4) objF5, 15);
                    fl6VarD = dv0.d(di.a.a, z2);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarC3);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    ci4Var.invoke(bj4VarO, Integer.valueOf((i3 >> 15) & 14));
                    bj4VarO.U(true);
                    ox6Var4 = ox6Var3;
                    mh4Var8 = mh4Var7;
                } else {
                    if (i13 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    c0187a = jt1.a.a;
                    i10 = 0;
                    if (i5 != 0) {
                        bj4VarO.K(-845519198);
                        objF9 = bj4VarO.f();
                        if (objF9 == c0187a) {
                            objF9 = new h31();
                            bj4VarO.C(objF9);
                        }
                        bj4VarO.U(false);
                        mh4Var5 = (mh4) objF9;
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    if (i7 != 0) {
                        bj4VarO.K(-845517886);
                        objF8 = bj4VarO.f();
                        if (objF8 == c0187a) {
                            objF8 = new i31(i10);
                            bj4VarO.C(objF8);
                        }
                        mh4Var4 = (mh4) objF8;
                        bj4VarO.U(false);
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    bj4VarO.K(-845514337);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(BuildConfig.FLAVOR);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    bj4VarO.U(false);
                    i11 = WhenMappings.$EnumSwitchMapping$0[cameraInputType2.ordinal()];
                    if (i11 == 1) {
                        str = "videos";
                    } else {
                        if (i11 != 2) {
                            defpackage.u.b();
                            return;
                        }
                        str = "images";
                    }
                    u9 u9Var3 = new u9();
                    bj4VarO.K(-845504028);
                    if ((i3 & 896) == 256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zJ = z | bj4VarO.j(context) | bj4VarO.J(str);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new oh4() { // from class: j31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: j31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    eh6VarF = ia.f(u9Var3, (oh4) objF2, bj4VarO);
                    bj4VarO.K(-845473406);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF3);
                    }
                    h37Var2 = (h37) objF3;
                    bj4VarO.U(false);
                    bj4VarO.K(-845471236);
                    if (CameraInputButton$lambda$10(h37Var2)) {
                        String string3 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                        String strF5 = nr1.f(bj4VarO, R.string.intercom_settings);
                        String strF6 = nr1.f(bj4VarO, R.string.intercom_not_now);
                        Integer numValueOf3 = Integer.valueOf(R.drawable.intercom_ic_camera);
                        bj4VarO.K(-845454121);
                        if ((57344 & i3) == 16384) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objF6 = bj4VarO.f();
                        if (z6) {
                            objF6 = new kh0(mh4Var4, h37Var2);
                            bj4VarO.C(objF6);
                        } else {
                            objF6 = new kh0(mh4Var4, h37Var2);
                            bj4VarO.C(objF6);
                        }
                        mh4 mh4Var13 = (mh4) objF6;
                        bj4VarO.U(false);
                        bj4VarO.K(-845450328);
                        zJ4 = bj4VarO.j(context);
                        objF7 = bj4VarO.f();
                        if (zJ4) {
                            objF7 = new mh4() { // from class: k31
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                                }
                            };
                            bj4VarO.C(objF7);
                        } else {
                            objF7 = new mh4() { // from class: k31
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                                }
                            };
                            bj4VarO.C(objF7);
                        }
                        mh4 mh4Var14 = (mh4) objF7;
                        z2 = false;
                        bj4VarO.U(false);
                        mh4Var6 = mh4Var4;
                        PermissionDeniedDialogKt.PermissionDeniedDialog(null, string3, strF5, strF6, numValueOf3, mh4Var13, mh4Var14, bj4VarO, 0, 1);
                    } else {
                        mh4Var6 = mh4Var4;
                        z2 = false;
                    }
                    bj4VarO.U(z2);
                    t9 t9Var3 = new t9();
                    bj4VarO.K(-845437412);
                    i12 = i3 & 112;
                    if (i12 == 32) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    zJ2 = z3 | bj4VarO.j(context) | bj4VarO.J(str) | bj4VarO.j(eh6VarF);
                    objF4 = bj4VarO.f();
                    if (zJ2) {
                        final String str8 = str;
                        objF4 = new oh4() { // from class: l31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str8, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        final String str9 = str;
                        objF4 = new oh4() { // from class: l31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str9, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(z2);
                    eh6VarF2 = ia.f(t9Var3, (oh4) objF4, bj4VarO);
                    bj4VarO.K(-845427931);
                    if ((i3 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    boolean zJ7 = z4 | bj4VarO.j(context);
                    if (i12 == 32) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    zJ3 = z5 | zJ7 | bj4VarO.J(str) | bj4VarO.j(eh6VarF) | bj4VarO.j(eh6VarF2);
                    objF5 = bj4VarO.f();
                    if (zJ3) {
                        mh4Var7 = mh4Var5;
                        final String str10 = str;
                        objF5 = new mh4() { // from class: m31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str10, eh6VarF, h37Var);
                            }
                        };
                        bj4VarO.C(objF5);
                    } else {
                        mh4Var7 = mh4Var5;
                        final String str11 = str;
                        objF5 = new mh4() { // from class: m31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str11, eh6VarF, h37Var);
                            }
                        };
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(z2);
                    ox6 ox6VarC4 = we1.c(ox6Var3, z2, null, (mh4) objF5, 15);
                    fl6VarD = dv0.d(di.a.a, z2);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarC4);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    ci4Var.invoke(bj4VarO, Integer.valueOf((i3 >> 15) & 14));
                    bj4VarO.U(true);
                    ox6Var4 = ox6Var3;
                    mh4Var8 = mh4Var7;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: n31
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return CameraInputButtonKt.CameraInputButton$lambda$21(ox6Var4, cameraInputType, oh4Var, mh4Var8, mh4Var6, ci4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            mh4Var3 = mh4Var;
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    mh4Var4 = mh4Var2;
                    if (bj4VarO.j(mh4Var4)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bj4VarO.j(ci4Var)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i3 & 74899) == 74898) {
                    if (i13 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    c0187a = jt1.a.a;
                    i10 = 0;
                    if (i5 != 0) {
                        bj4VarO.K(-845519198);
                        objF9 = bj4VarO.f();
                        if (objF9 == c0187a) {
                            objF9 = new h31();
                            bj4VarO.C(objF9);
                        }
                        bj4VarO.U(false);
                        mh4Var5 = (mh4) objF9;
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    if (i7 != 0) {
                        bj4VarO.K(-845517886);
                        objF8 = bj4VarO.f();
                        if (objF8 == c0187a) {
                            objF8 = new i31(i10);
                            bj4VarO.C(objF8);
                        }
                        mh4Var4 = (mh4) objF8;
                        bj4VarO.U(false);
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    bj4VarO.K(-845514337);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(BuildConfig.FLAVOR);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    bj4VarO.U(false);
                    i11 = WhenMappings.$EnumSwitchMapping$0[cameraInputType2.ordinal()];
                    if (i11 == 1) {
                        str = "videos";
                    } else {
                        if (i11 != 2) {
                            defpackage.u.b();
                            return;
                        }
                        str = "images";
                    }
                    u9 u9Var4 = new u9();
                    bj4VarO.K(-845504028);
                    if ((i3 & 896) == 256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zJ = z | bj4VarO.j(context) | bj4VarO.J(str);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new oh4() { // from class: j31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: j31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    eh6VarF = ia.f(u9Var4, (oh4) objF2, bj4VarO);
                    bj4VarO.K(-845473406);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF3);
                    }
                    h37Var2 = (h37) objF3;
                    bj4VarO.U(false);
                    bj4VarO.K(-845471236);
                    if (CameraInputButton$lambda$10(h37Var2)) {
                        String string4 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                        String strF7 = nr1.f(bj4VarO, R.string.intercom_settings);
                        String strF8 = nr1.f(bj4VarO, R.string.intercom_not_now);
                        Integer numValueOf4 = Integer.valueOf(R.drawable.intercom_ic_camera);
                        bj4VarO.K(-845454121);
                        if ((57344 & i3) == 16384) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objF6 = bj4VarO.f();
                        if (z6) {
                            objF6 = new kh0(mh4Var4, h37Var2);
                            bj4VarO.C(objF6);
                        } else {
                            objF6 = new kh0(mh4Var4, h37Var2);
                            bj4VarO.C(objF6);
                        }
                        mh4 mh4Var15 = (mh4) objF6;
                        bj4VarO.U(false);
                        bj4VarO.K(-845450328);
                        zJ4 = bj4VarO.j(context);
                        objF7 = bj4VarO.f();
                        if (zJ4) {
                            objF7 = new mh4() { // from class: k31
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                                }
                            };
                            bj4VarO.C(objF7);
                        } else {
                            objF7 = new mh4() { // from class: k31
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                                }
                            };
                            bj4VarO.C(objF7);
                        }
                        mh4 mh4Var16 = (mh4) objF7;
                        z2 = false;
                        bj4VarO.U(false);
                        mh4Var6 = mh4Var4;
                        PermissionDeniedDialogKt.PermissionDeniedDialog(null, string4, strF7, strF8, numValueOf4, mh4Var15, mh4Var16, bj4VarO, 0, 1);
                    } else {
                        mh4Var6 = mh4Var4;
                        z2 = false;
                    }
                    bj4VarO.U(z2);
                    t9 t9Var4 = new t9();
                    bj4VarO.K(-845437412);
                    i12 = i3 & 112;
                    if (i12 == 32) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    zJ2 = z3 | bj4VarO.j(context) | bj4VarO.J(str) | bj4VarO.j(eh6VarF);
                    objF4 = bj4VarO.f();
                    if (zJ2) {
                        final String str12 = str;
                        objF4 = new oh4() { // from class: l31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str12, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        final String str13 = str;
                        objF4 = new oh4() { // from class: l31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str13, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(z2);
                    eh6VarF2 = ia.f(t9Var4, (oh4) objF4, bj4VarO);
                    bj4VarO.K(-845427931);
                    if ((i3 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    boolean zJ8 = z4 | bj4VarO.j(context);
                    if (i12 == 32) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    zJ3 = z5 | zJ8 | bj4VarO.J(str) | bj4VarO.j(eh6VarF) | bj4VarO.j(eh6VarF2);
                    objF5 = bj4VarO.f();
                    if (zJ3) {
                        mh4Var7 = mh4Var5;
                        final String str14 = str;
                        objF5 = new mh4() { // from class: m31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str14, eh6VarF, h37Var);
                            }
                        };
                        bj4VarO.C(objF5);
                    } else {
                        mh4Var7 = mh4Var5;
                        final String str15 = str;
                        objF5 = new mh4() { // from class: m31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str15, eh6VarF, h37Var);
                            }
                        };
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(z2);
                    ox6 ox6VarC5 = we1.c(ox6Var3, z2, null, (mh4) objF5, 15);
                    fl6VarD = dv0.d(di.a.a, z2);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarC5);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    ci4Var.invoke(bj4VarO, Integer.valueOf((i3 >> 15) & 14));
                    bj4VarO.U(true);
                    ox6Var4 = ox6Var3;
                    mh4Var8 = mh4Var7;
                } else {
                    if (i13 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    c0187a = jt1.a.a;
                    i10 = 0;
                    if (i5 != 0) {
                        bj4VarO.K(-845519198);
                        objF9 = bj4VarO.f();
                        if (objF9 == c0187a) {
                            objF9 = new h31();
                            bj4VarO.C(objF9);
                        }
                        bj4VarO.U(false);
                        mh4Var5 = (mh4) objF9;
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    if (i7 != 0) {
                        bj4VarO.K(-845517886);
                        objF8 = bj4VarO.f();
                        if (objF8 == c0187a) {
                            objF8 = new i31(i10);
                            bj4VarO.C(objF8);
                        }
                        mh4Var4 = (mh4) objF8;
                        bj4VarO.U(false);
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    bj4VarO.K(-845514337);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(BuildConfig.FLAVOR);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    bj4VarO.U(false);
                    i11 = WhenMappings.$EnumSwitchMapping$0[cameraInputType2.ordinal()];
                    if (i11 == 1) {
                        str = "videos";
                    } else {
                        if (i11 != 2) {
                            defpackage.u.b();
                            return;
                        }
                        str = "images";
                    }
                    u9 u9Var5 = new u9();
                    bj4VarO.K(-845504028);
                    if ((i3 & 896) == 256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zJ = z | bj4VarO.j(context) | bj4VarO.J(str);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new oh4() { // from class: j31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: j31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    eh6VarF = ia.f(u9Var5, (oh4) objF2, bj4VarO);
                    bj4VarO.K(-845473406);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF3);
                    }
                    h37Var2 = (h37) objF3;
                    bj4VarO.U(false);
                    bj4VarO.K(-845471236);
                    if (CameraInputButton$lambda$10(h37Var2)) {
                        String string5 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                        String strF9 = nr1.f(bj4VarO, R.string.intercom_settings);
                        String strF10 = nr1.f(bj4VarO, R.string.intercom_not_now);
                        Integer numValueOf5 = Integer.valueOf(R.drawable.intercom_ic_camera);
                        bj4VarO.K(-845454121);
                        if ((57344 & i3) == 16384) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objF6 = bj4VarO.f();
                        if (z6) {
                            objF6 = new kh0(mh4Var4, h37Var2);
                            bj4VarO.C(objF6);
                        } else {
                            objF6 = new kh0(mh4Var4, h37Var2);
                            bj4VarO.C(objF6);
                        }
                        mh4 mh4Var17 = (mh4) objF6;
                        bj4VarO.U(false);
                        bj4VarO.K(-845450328);
                        zJ4 = bj4VarO.j(context);
                        objF7 = bj4VarO.f();
                        if (zJ4) {
                            objF7 = new mh4() { // from class: k31
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                                }
                            };
                            bj4VarO.C(objF7);
                        } else {
                            objF7 = new mh4() { // from class: k31
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                                }
                            };
                            bj4VarO.C(objF7);
                        }
                        mh4 mh4Var18 = (mh4) objF7;
                        z2 = false;
                        bj4VarO.U(false);
                        mh4Var6 = mh4Var4;
                        PermissionDeniedDialogKt.PermissionDeniedDialog(null, string5, strF9, strF10, numValueOf5, mh4Var17, mh4Var18, bj4VarO, 0, 1);
                    } else {
                        mh4Var6 = mh4Var4;
                        z2 = false;
                    }
                    bj4VarO.U(z2);
                    t9 t9Var5 = new t9();
                    bj4VarO.K(-845437412);
                    i12 = i3 & 112;
                    if (i12 == 32) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    zJ2 = z3 | bj4VarO.j(context) | bj4VarO.J(str) | bj4VarO.j(eh6VarF);
                    objF4 = bj4VarO.f();
                    if (zJ2) {
                        final String str16 = str;
                        objF4 = new oh4() { // from class: l31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str16, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        final String str17 = str;
                        objF4 = new oh4() { // from class: l31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str17, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(z2);
                    eh6VarF2 = ia.f(t9Var5, (oh4) objF4, bj4VarO);
                    bj4VarO.K(-845427931);
                    if ((i3 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    boolean zJ9 = z4 | bj4VarO.j(context);
                    if (i12 == 32) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    zJ3 = z5 | zJ9 | bj4VarO.J(str) | bj4VarO.j(eh6VarF) | bj4VarO.j(eh6VarF2);
                    objF5 = bj4VarO.f();
                    if (zJ3) {
                        mh4Var7 = mh4Var5;
                        final String str18 = str;
                        objF5 = new mh4() { // from class: m31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str18, eh6VarF, h37Var);
                            }
                        };
                        bj4VarO.C(objF5);
                    } else {
                        mh4Var7 = mh4Var5;
                        final String str19 = str;
                        objF5 = new mh4() { // from class: m31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str19, eh6VarF, h37Var);
                            }
                        };
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(z2);
                    ox6 ox6VarC6 = we1.c(ox6Var3, z2, null, (mh4) objF5, 15);
                    fl6VarD = dv0.d(di.a.a, z2);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarC6);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    ci4Var.invoke(bj4VarO, Integer.valueOf((i3 >> 15) & 14));
                    bj4VarO.U(true);
                    ox6Var4 = ox6Var3;
                    mh4Var8 = mh4Var7;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: n31
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return CameraInputButtonKt.CameraInputButton$lambda$21(ox6Var4, cameraInputType, oh4Var, mh4Var8, mh4Var6, ci4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            mh4Var4 = mh4Var2;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bj4VarO.j(ci4Var)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i3 & 74899) == 74898) {
                if (i13 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                i10 = 0;
                if (i5 != 0) {
                    bj4VarO.K(-845519198);
                    objF9 = bj4VarO.f();
                    if (objF9 == c0187a) {
                        objF9 = new h31();
                        bj4VarO.C(objF9);
                    }
                    bj4VarO.U(false);
                    mh4Var5 = (mh4) objF9;
                } else {
                    mh4Var5 = mh4Var3;
                }
                if (i7 != 0) {
                    bj4VarO.K(-845517886);
                    objF8 = bj4VarO.f();
                    if (objF8 == c0187a) {
                        objF8 = new i31(i10);
                        bj4VarO.C(objF8);
                    }
                    mh4Var4 = (mh4) objF8;
                    bj4VarO.U(false);
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                bj4VarO.K(-845514337);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(BuildConfig.FLAVOR);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                bj4VarO.U(false);
                i11 = WhenMappings.$EnumSwitchMapping$0[cameraInputType2.ordinal()];
                if (i11 == 1) {
                    str = "videos";
                } else {
                    if (i11 != 2) {
                        defpackage.u.b();
                        return;
                    }
                    str = "images";
                }
                u9 u9Var6 = new u9();
                bj4VarO.K(-845504028);
                if ((i3 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                zJ = z | bj4VarO.j(context) | bj4VarO.J(str);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new oh4() { // from class: j31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: j31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                eh6VarF = ia.f(u9Var6, (oh4) objF2, bj4VarO);
                bj4VarO.K(-845473406);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF3);
                }
                h37Var2 = (h37) objF3;
                bj4VarO.U(false);
                bj4VarO.K(-845471236);
                if (CameraInputButton$lambda$10(h37Var2)) {
                    String string6 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                    String strF11 = nr1.f(bj4VarO, R.string.intercom_settings);
                    String strF12 = nr1.f(bj4VarO, R.string.intercom_not_now);
                    Integer numValueOf6 = Integer.valueOf(R.drawable.intercom_ic_camera);
                    bj4VarO.K(-845454121);
                    if ((57344 & i3) == 16384) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objF6 = bj4VarO.f();
                    if (z6) {
                        objF6 = new kh0(mh4Var4, h37Var2);
                        bj4VarO.C(objF6);
                    } else {
                        objF6 = new kh0(mh4Var4, h37Var2);
                        bj4VarO.C(objF6);
                    }
                    mh4 mh4Var19 = (mh4) objF6;
                    bj4VarO.U(false);
                    bj4VarO.K(-845450328);
                    zJ4 = bj4VarO.j(context);
                    objF7 = bj4VarO.f();
                    if (zJ4) {
                        objF7 = new mh4() { // from class: k31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                            }
                        };
                        bj4VarO.C(objF7);
                    } else {
                        objF7 = new mh4() { // from class: k31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                            }
                        };
                        bj4VarO.C(objF7);
                    }
                    mh4 mh4Var110 = (mh4) objF7;
                    z2 = false;
                    bj4VarO.U(false);
                    mh4Var6 = mh4Var4;
                    PermissionDeniedDialogKt.PermissionDeniedDialog(null, string6, strF11, strF12, numValueOf6, mh4Var19, mh4Var110, bj4VarO, 0, 1);
                } else {
                    mh4Var6 = mh4Var4;
                    z2 = false;
                }
                bj4VarO.U(z2);
                t9 t9Var6 = new t9();
                bj4VarO.K(-845437412);
                i12 = i3 & 112;
                if (i12 == 32) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                zJ2 = z3 | bj4VarO.j(context) | bj4VarO.J(str) | bj4VarO.j(eh6VarF);
                objF4 = bj4VarO.f();
                if (zJ2) {
                    final String str110 = str;
                    objF4 = new oh4() { // from class: l31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str110, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    final String str111 = str;
                    objF4 = new oh4() { // from class: l31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str111, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(z2);
                eh6VarF2 = ia.f(t9Var6, (oh4) objF4, bj4VarO);
                bj4VarO.K(-845427931);
                if ((i3 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                boolean zJ10 = z4 | bj4VarO.j(context);
                if (i12 == 32) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                zJ3 = z5 | zJ10 | bj4VarO.J(str) | bj4VarO.j(eh6VarF) | bj4VarO.j(eh6VarF2);
                objF5 = bj4VarO.f();
                if (zJ3) {
                    mh4Var7 = mh4Var5;
                    final String str112 = str;
                    objF5 = new mh4() { // from class: m31
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str112, eh6VarF, h37Var);
                        }
                    };
                    bj4VarO.C(objF5);
                } else {
                    mh4Var7 = mh4Var5;
                    final String str113 = str;
                    objF5 = new mh4() { // from class: m31
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str113, eh6VarF, h37Var);
                        }
                    };
                    bj4VarO.C(objF5);
                }
                bj4VarO.U(z2);
                ox6 ox6VarC7 = we1.c(ox6Var3, z2, null, (mh4) objF5, 15);
                fl6VarD = dv0.d(di.a.a, z2);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarC7);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                ci4Var.invoke(bj4VarO, Integer.valueOf((i3 >> 15) & 14));
                bj4VarO.U(true);
                ox6Var4 = ox6Var3;
                mh4Var8 = mh4Var7;
            } else {
                if (i13 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                i10 = 0;
                if (i5 != 0) {
                    bj4VarO.K(-845519198);
                    objF9 = bj4VarO.f();
                    if (objF9 == c0187a) {
                        objF9 = new h31();
                        bj4VarO.C(objF9);
                    }
                    bj4VarO.U(false);
                    mh4Var5 = (mh4) objF9;
                } else {
                    mh4Var5 = mh4Var3;
                }
                if (i7 != 0) {
                    bj4VarO.K(-845517886);
                    objF8 = bj4VarO.f();
                    if (objF8 == c0187a) {
                        objF8 = new i31(i10);
                        bj4VarO.C(objF8);
                    }
                    mh4Var4 = (mh4) objF8;
                    bj4VarO.U(false);
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                bj4VarO.K(-845514337);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(BuildConfig.FLAVOR);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                bj4VarO.U(false);
                i11 = WhenMappings.$EnumSwitchMapping$0[cameraInputType2.ordinal()];
                if (i11 == 1) {
                    str = "videos";
                } else {
                    if (i11 != 2) {
                        defpackage.u.b();
                        return;
                    }
                    str = "images";
                }
                u9 u9Var7 = new u9();
                bj4VarO.K(-845504028);
                if ((i3 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                zJ = z | bj4VarO.j(context) | bj4VarO.J(str);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new oh4() { // from class: j31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: j31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                eh6VarF = ia.f(u9Var7, (oh4) objF2, bj4VarO);
                bj4VarO.K(-845473406);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF3);
                }
                h37Var2 = (h37) objF3;
                bj4VarO.U(false);
                bj4VarO.K(-845471236);
                if (CameraInputButton$lambda$10(h37Var2)) {
                    String string7 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                    String strF13 = nr1.f(bj4VarO, R.string.intercom_settings);
                    String strF14 = nr1.f(bj4VarO, R.string.intercom_not_now);
                    Integer numValueOf7 = Integer.valueOf(R.drawable.intercom_ic_camera);
                    bj4VarO.K(-845454121);
                    if ((57344 & i3) == 16384) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objF6 = bj4VarO.f();
                    if (z6) {
                        objF6 = new kh0(mh4Var4, h37Var2);
                        bj4VarO.C(objF6);
                    } else {
                        objF6 = new kh0(mh4Var4, h37Var2);
                        bj4VarO.C(objF6);
                    }
                    mh4 mh4Var111 = (mh4) objF6;
                    bj4VarO.U(false);
                    bj4VarO.K(-845450328);
                    zJ4 = bj4VarO.j(context);
                    objF7 = bj4VarO.f();
                    if (zJ4) {
                        objF7 = new mh4() { // from class: k31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                            }
                        };
                        bj4VarO.C(objF7);
                    } else {
                        objF7 = new mh4() { // from class: k31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                            }
                        };
                        bj4VarO.C(objF7);
                    }
                    mh4 mh4Var112 = (mh4) objF7;
                    z2 = false;
                    bj4VarO.U(false);
                    mh4Var6 = mh4Var4;
                    PermissionDeniedDialogKt.PermissionDeniedDialog(null, string7, strF13, strF14, numValueOf7, mh4Var111, mh4Var112, bj4VarO, 0, 1);
                } else {
                    mh4Var6 = mh4Var4;
                    z2 = false;
                }
                bj4VarO.U(z2);
                t9 t9Var7 = new t9();
                bj4VarO.K(-845437412);
                i12 = i3 & 112;
                if (i12 == 32) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                zJ2 = z3 | bj4VarO.j(context) | bj4VarO.J(str) | bj4VarO.j(eh6VarF);
                objF4 = bj4VarO.f();
                if (zJ2) {
                    final String str114 = str;
                    objF4 = new oh4() { // from class: l31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str114, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    final String str115 = str;
                    objF4 = new oh4() { // from class: l31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str115, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(z2);
                eh6VarF2 = ia.f(t9Var7, (oh4) objF4, bj4VarO);
                bj4VarO.K(-845427931);
                if ((i3 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                boolean zJ11 = z4 | bj4VarO.j(context);
                if (i12 == 32) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                zJ3 = z5 | zJ11 | bj4VarO.J(str) | bj4VarO.j(eh6VarF) | bj4VarO.j(eh6VarF2);
                objF5 = bj4VarO.f();
                if (zJ3) {
                    mh4Var7 = mh4Var5;
                    final String str116 = str;
                    objF5 = new mh4() { // from class: m31
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str116, eh6VarF, h37Var);
                        }
                    };
                    bj4VarO.C(objF5);
                } else {
                    mh4Var7 = mh4Var5;
                    final String str117 = str;
                    objF5 = new mh4() { // from class: m31
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str117, eh6VarF, h37Var);
                        }
                    };
                    bj4VarO.C(objF5);
                }
                bj4VarO.U(z2);
                ox6 ox6VarC8 = we1.c(ox6Var3, z2, null, (mh4) objF5, 15);
                fl6VarD = dv0.d(di.a.a, z2);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarC8);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                ci4Var.invoke(bj4VarO, Integer.valueOf((i3 >> 15) & 14));
                bj4VarO.U(true);
                ox6Var4 = ox6Var3;
                mh4Var8 = mh4Var7;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: n31
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return CameraInputButtonKt.CameraInputButton$lambda$21(ox6Var4, cameraInputType, oh4Var, mh4Var8, mh4Var6, ci4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        cameraInputType2 = cameraInputType;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (bj4VarO.j(oh4Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        i5 = i2 & 8;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                mh4Var3 = mh4Var;
                if (bj4VarO.j(mh4Var3)) {
                    i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    mh4Var4 = mh4Var2;
                    if (bj4VarO.j(mh4Var4)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bj4VarO.j(ci4Var)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i3 & 74899) == 74898) {
                    if (i13 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    c0187a = jt1.a.a;
                    i10 = 0;
                    if (i5 != 0) {
                        bj4VarO.K(-845519198);
                        objF9 = bj4VarO.f();
                        if (objF9 == c0187a) {
                            objF9 = new h31();
                            bj4VarO.C(objF9);
                        }
                        bj4VarO.U(false);
                        mh4Var5 = (mh4) objF9;
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    if (i7 != 0) {
                        bj4VarO.K(-845517886);
                        objF8 = bj4VarO.f();
                        if (objF8 == c0187a) {
                            objF8 = new i31(i10);
                            bj4VarO.C(objF8);
                        }
                        mh4Var4 = (mh4) objF8;
                        bj4VarO.U(false);
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    bj4VarO.K(-845514337);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(BuildConfig.FLAVOR);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    bj4VarO.U(false);
                    i11 = WhenMappings.$EnumSwitchMapping$0[cameraInputType2.ordinal()];
                    if (i11 == 1) {
                        str = "videos";
                    } else {
                        if (i11 != 2) {
                            defpackage.u.b();
                            return;
                        }
                        str = "images";
                    }
                    u9 u9Var8 = new u9();
                    bj4VarO.K(-845504028);
                    if ((i3 & 896) == 256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zJ = z | bj4VarO.j(context) | bj4VarO.J(str);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new oh4() { // from class: j31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: j31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    eh6VarF = ia.f(u9Var8, (oh4) objF2, bj4VarO);
                    bj4VarO.K(-845473406);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF3);
                    }
                    h37Var2 = (h37) objF3;
                    bj4VarO.U(false);
                    bj4VarO.K(-845471236);
                    if (CameraInputButton$lambda$10(h37Var2)) {
                        String string8 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                        String strF15 = nr1.f(bj4VarO, R.string.intercom_settings);
                        String strF16 = nr1.f(bj4VarO, R.string.intercom_not_now);
                        Integer numValueOf8 = Integer.valueOf(R.drawable.intercom_ic_camera);
                        bj4VarO.K(-845454121);
                        if ((57344 & i3) == 16384) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objF6 = bj4VarO.f();
                        if (z6) {
                            objF6 = new kh0(mh4Var4, h37Var2);
                            bj4VarO.C(objF6);
                        } else {
                            objF6 = new kh0(mh4Var4, h37Var2);
                            bj4VarO.C(objF6);
                        }
                        mh4 mh4Var113 = (mh4) objF6;
                        bj4VarO.U(false);
                        bj4VarO.K(-845450328);
                        zJ4 = bj4VarO.j(context);
                        objF7 = bj4VarO.f();
                        if (zJ4) {
                            objF7 = new mh4() { // from class: k31
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                                }
                            };
                            bj4VarO.C(objF7);
                        } else {
                            objF7 = new mh4() { // from class: k31
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                                }
                            };
                            bj4VarO.C(objF7);
                        }
                        mh4 mh4Var114 = (mh4) objF7;
                        z2 = false;
                        bj4VarO.U(false);
                        mh4Var6 = mh4Var4;
                        PermissionDeniedDialogKt.PermissionDeniedDialog(null, string8, strF15, strF16, numValueOf8, mh4Var113, mh4Var114, bj4VarO, 0, 1);
                    } else {
                        mh4Var6 = mh4Var4;
                        z2 = false;
                    }
                    bj4VarO.U(z2);
                    t9 t9Var8 = new t9();
                    bj4VarO.K(-845437412);
                    i12 = i3 & 112;
                    if (i12 == 32) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    zJ2 = z3 | bj4VarO.j(context) | bj4VarO.J(str) | bj4VarO.j(eh6VarF);
                    objF4 = bj4VarO.f();
                    if (zJ2) {
                        final String str118 = str;
                        objF4 = new oh4() { // from class: l31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str118, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        final String str119 = str;
                        objF4 = new oh4() { // from class: l31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str119, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(z2);
                    eh6VarF2 = ia.f(t9Var8, (oh4) objF4, bj4VarO);
                    bj4VarO.K(-845427931);
                    if ((i3 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    boolean zJ12 = z4 | bj4VarO.j(context);
                    if (i12 == 32) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    zJ3 = z5 | zJ12 | bj4VarO.J(str) | bj4VarO.j(eh6VarF) | bj4VarO.j(eh6VarF2);
                    objF5 = bj4VarO.f();
                    if (zJ3) {
                        mh4Var7 = mh4Var5;
                        final String str1110 = str;
                        objF5 = new mh4() { // from class: m31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str1110, eh6VarF, h37Var);
                            }
                        };
                        bj4VarO.C(objF5);
                    } else {
                        mh4Var7 = mh4Var5;
                        final String str1111 = str;
                        objF5 = new mh4() { // from class: m31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str1111, eh6VarF, h37Var);
                            }
                        };
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(z2);
                    ox6 ox6VarC9 = we1.c(ox6Var3, z2, null, (mh4) objF5, 15);
                    fl6VarD = dv0.d(di.a.a, z2);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarC9);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    ci4Var.invoke(bj4VarO, Integer.valueOf((i3 >> 15) & 14));
                    bj4VarO.U(true);
                    ox6Var4 = ox6Var3;
                    mh4Var8 = mh4Var7;
                } else {
                    if (i13 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    c0187a = jt1.a.a;
                    i10 = 0;
                    if (i5 != 0) {
                        bj4VarO.K(-845519198);
                        objF9 = bj4VarO.f();
                        if (objF9 == c0187a) {
                            objF9 = new h31();
                            bj4VarO.C(objF9);
                        }
                        bj4VarO.U(false);
                        mh4Var5 = (mh4) objF9;
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    if (i7 != 0) {
                        bj4VarO.K(-845517886);
                        objF8 = bj4VarO.f();
                        if (objF8 == c0187a) {
                            objF8 = new i31(i10);
                            bj4VarO.C(objF8);
                        }
                        mh4Var4 = (mh4) objF8;
                        bj4VarO.U(false);
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    bj4VarO.K(-845514337);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(BuildConfig.FLAVOR);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    bj4VarO.U(false);
                    i11 = WhenMappings.$EnumSwitchMapping$0[cameraInputType2.ordinal()];
                    if (i11 == 1) {
                        str = "videos";
                    } else {
                        if (i11 != 2) {
                            defpackage.u.b();
                            return;
                        }
                        str = "images";
                    }
                    u9 u9Var9 = new u9();
                    bj4VarO.K(-845504028);
                    if ((i3 & 896) == 256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zJ = z | bj4VarO.j(context) | bj4VarO.J(str);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new oh4() { // from class: j31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: j31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    eh6VarF = ia.f(u9Var9, (oh4) objF2, bj4VarO);
                    bj4VarO.K(-845473406);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF3);
                    }
                    h37Var2 = (h37) objF3;
                    bj4VarO.U(false);
                    bj4VarO.K(-845471236);
                    if (CameraInputButton$lambda$10(h37Var2)) {
                        String string9 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                        String strF17 = nr1.f(bj4VarO, R.string.intercom_settings);
                        String strF18 = nr1.f(bj4VarO, R.string.intercom_not_now);
                        Integer numValueOf9 = Integer.valueOf(R.drawable.intercom_ic_camera);
                        bj4VarO.K(-845454121);
                        if ((57344 & i3) == 16384) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objF6 = bj4VarO.f();
                        if (z6) {
                            objF6 = new kh0(mh4Var4, h37Var2);
                            bj4VarO.C(objF6);
                        } else {
                            objF6 = new kh0(mh4Var4, h37Var2);
                            bj4VarO.C(objF6);
                        }
                        mh4 mh4Var115 = (mh4) objF6;
                        bj4VarO.U(false);
                        bj4VarO.K(-845450328);
                        zJ4 = bj4VarO.j(context);
                        objF7 = bj4VarO.f();
                        if (zJ4) {
                            objF7 = new mh4() { // from class: k31
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                                }
                            };
                            bj4VarO.C(objF7);
                        } else {
                            objF7 = new mh4() { // from class: k31
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                                }
                            };
                            bj4VarO.C(objF7);
                        }
                        mh4 mh4Var116 = (mh4) objF7;
                        z2 = false;
                        bj4VarO.U(false);
                        mh4Var6 = mh4Var4;
                        PermissionDeniedDialogKt.PermissionDeniedDialog(null, string9, strF17, strF18, numValueOf9, mh4Var115, mh4Var116, bj4VarO, 0, 1);
                    } else {
                        mh4Var6 = mh4Var4;
                        z2 = false;
                    }
                    bj4VarO.U(z2);
                    t9 t9Var9 = new t9();
                    bj4VarO.K(-845437412);
                    i12 = i3 & 112;
                    if (i12 == 32) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    zJ2 = z3 | bj4VarO.j(context) | bj4VarO.J(str) | bj4VarO.j(eh6VarF);
                    objF4 = bj4VarO.f();
                    if (zJ2) {
                        final String str1112 = str;
                        objF4 = new oh4() { // from class: l31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str1112, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        final String str1113 = str;
                        objF4 = new oh4() { // from class: l31
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str1113, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(z2);
                    eh6VarF2 = ia.f(t9Var9, (oh4) objF4, bj4VarO);
                    bj4VarO.K(-845427931);
                    if ((i3 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    boolean zJ13 = z4 | bj4VarO.j(context);
                    if (i12 == 32) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    zJ3 = z5 | zJ13 | bj4VarO.J(str) | bj4VarO.j(eh6VarF) | bj4VarO.j(eh6VarF2);
                    objF5 = bj4VarO.f();
                    if (zJ3) {
                        mh4Var7 = mh4Var5;
                        final String str1114 = str;
                        objF5 = new mh4() { // from class: m31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str1114, eh6VarF, h37Var);
                            }
                        };
                        bj4VarO.C(objF5);
                    } else {
                        mh4Var7 = mh4Var5;
                        final String str1115 = str;
                        objF5 = new mh4() { // from class: m31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str1115, eh6VarF, h37Var);
                            }
                        };
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(z2);
                    ox6 ox6VarC10 = we1.c(ox6Var3, z2, null, (mh4) objF5, 15);
                    fl6VarD = dv0.d(di.a.a, z2);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarC10);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    ci4Var.invoke(bj4VarO, Integer.valueOf((i3 >> 15) & 14));
                    bj4VarO.U(true);
                    ox6Var4 = ox6Var3;
                    mh4Var8 = mh4Var7;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: n31
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return CameraInputButtonKt.CameraInputButton$lambda$21(ox6Var4, cameraInputType, oh4Var, mh4Var8, mh4Var6, ci4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            mh4Var4 = mh4Var2;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bj4VarO.j(ci4Var)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i3 & 74899) == 74898) {
                if (i13 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                i10 = 0;
                if (i5 != 0) {
                    bj4VarO.K(-845519198);
                    objF9 = bj4VarO.f();
                    if (objF9 == c0187a) {
                        objF9 = new h31();
                        bj4VarO.C(objF9);
                    }
                    bj4VarO.U(false);
                    mh4Var5 = (mh4) objF9;
                } else {
                    mh4Var5 = mh4Var3;
                }
                if (i7 != 0) {
                    bj4VarO.K(-845517886);
                    objF8 = bj4VarO.f();
                    if (objF8 == c0187a) {
                        objF8 = new i31(i10);
                        bj4VarO.C(objF8);
                    }
                    mh4Var4 = (mh4) objF8;
                    bj4VarO.U(false);
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                bj4VarO.K(-845514337);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(BuildConfig.FLAVOR);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                bj4VarO.U(false);
                i11 = WhenMappings.$EnumSwitchMapping$0[cameraInputType2.ordinal()];
                if (i11 == 1) {
                    str = "videos";
                } else {
                    if (i11 != 2) {
                        defpackage.u.b();
                        return;
                    }
                    str = "images";
                }
                u9 u9Var10 = new u9();
                bj4VarO.K(-845504028);
                if ((i3 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                zJ = z | bj4VarO.j(context) | bj4VarO.J(str);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new oh4() { // from class: j31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: j31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                eh6VarF = ia.f(u9Var10, (oh4) objF2, bj4VarO);
                bj4VarO.K(-845473406);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF3);
                }
                h37Var2 = (h37) objF3;
                bj4VarO.U(false);
                bj4VarO.K(-845471236);
                if (CameraInputButton$lambda$10(h37Var2)) {
                    String string10 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                    String strF19 = nr1.f(bj4VarO, R.string.intercom_settings);
                    String strF110 = nr1.f(bj4VarO, R.string.intercom_not_now);
                    Integer numValueOf10 = Integer.valueOf(R.drawable.intercom_ic_camera);
                    bj4VarO.K(-845454121);
                    if ((57344 & i3) == 16384) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objF6 = bj4VarO.f();
                    if (z6) {
                        objF6 = new kh0(mh4Var4, h37Var2);
                        bj4VarO.C(objF6);
                    } else {
                        objF6 = new kh0(mh4Var4, h37Var2);
                        bj4VarO.C(objF6);
                    }
                    mh4 mh4Var117 = (mh4) objF6;
                    bj4VarO.U(false);
                    bj4VarO.K(-845450328);
                    zJ4 = bj4VarO.j(context);
                    objF7 = bj4VarO.f();
                    if (zJ4) {
                        objF7 = new mh4() { // from class: k31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                            }
                        };
                        bj4VarO.C(objF7);
                    } else {
                        objF7 = new mh4() { // from class: k31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                            }
                        };
                        bj4VarO.C(objF7);
                    }
                    mh4 mh4Var118 = (mh4) objF7;
                    z2 = false;
                    bj4VarO.U(false);
                    mh4Var6 = mh4Var4;
                    PermissionDeniedDialogKt.PermissionDeniedDialog(null, string10, strF19, strF110, numValueOf10, mh4Var117, mh4Var118, bj4VarO, 0, 1);
                } else {
                    mh4Var6 = mh4Var4;
                    z2 = false;
                }
                bj4VarO.U(z2);
                t9 t9Var10 = new t9();
                bj4VarO.K(-845437412);
                i12 = i3 & 112;
                if (i12 == 32) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                zJ2 = z3 | bj4VarO.j(context) | bj4VarO.J(str) | bj4VarO.j(eh6VarF);
                objF4 = bj4VarO.f();
                if (zJ2) {
                    final String str1116 = str;
                    objF4 = new oh4() { // from class: l31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str1116, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    final String str1117 = str;
                    objF4 = new oh4() { // from class: l31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str1117, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(z2);
                eh6VarF2 = ia.f(t9Var10, (oh4) objF4, bj4VarO);
                bj4VarO.K(-845427931);
                if ((i3 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                boolean zJ14 = z4 | bj4VarO.j(context);
                if (i12 == 32) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                zJ3 = z5 | zJ14 | bj4VarO.J(str) | bj4VarO.j(eh6VarF) | bj4VarO.j(eh6VarF2);
                objF5 = bj4VarO.f();
                if (zJ3) {
                    mh4Var7 = mh4Var5;
                    final String str1118 = str;
                    objF5 = new mh4() { // from class: m31
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str1118, eh6VarF, h37Var);
                        }
                    };
                    bj4VarO.C(objF5);
                } else {
                    mh4Var7 = mh4Var5;
                    final String str1119 = str;
                    objF5 = new mh4() { // from class: m31
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str1119, eh6VarF, h37Var);
                        }
                    };
                    bj4VarO.C(objF5);
                }
                bj4VarO.U(z2);
                ox6 ox6VarC11 = we1.c(ox6Var3, z2, null, (mh4) objF5, 15);
                fl6VarD = dv0.d(di.a.a, z2);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarC11);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                ci4Var.invoke(bj4VarO, Integer.valueOf((i3 >> 15) & 14));
                bj4VarO.U(true);
                ox6Var4 = ox6Var3;
                mh4Var8 = mh4Var7;
            } else {
                if (i13 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                i10 = 0;
                if (i5 != 0) {
                    bj4VarO.K(-845519198);
                    objF9 = bj4VarO.f();
                    if (objF9 == c0187a) {
                        objF9 = new h31();
                        bj4VarO.C(objF9);
                    }
                    bj4VarO.U(false);
                    mh4Var5 = (mh4) objF9;
                } else {
                    mh4Var5 = mh4Var3;
                }
                if (i7 != 0) {
                    bj4VarO.K(-845517886);
                    objF8 = bj4VarO.f();
                    if (objF8 == c0187a) {
                        objF8 = new i31(i10);
                        bj4VarO.C(objF8);
                    }
                    mh4Var4 = (mh4) objF8;
                    bj4VarO.U(false);
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                bj4VarO.K(-845514337);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(BuildConfig.FLAVOR);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                bj4VarO.U(false);
                i11 = WhenMappings.$EnumSwitchMapping$0[cameraInputType2.ordinal()];
                if (i11 == 1) {
                    str = "videos";
                } else {
                    if (i11 != 2) {
                        defpackage.u.b();
                        return;
                    }
                    str = "images";
                }
                u9 u9Var11 = new u9();
                bj4VarO.K(-845504028);
                if ((i3 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                zJ = z | bj4VarO.j(context) | bj4VarO.J(str);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new oh4() { // from class: j31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: j31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                eh6VarF = ia.f(u9Var11, (oh4) objF2, bj4VarO);
                bj4VarO.K(-845473406);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF3);
                }
                h37Var2 = (h37) objF3;
                bj4VarO.U(false);
                bj4VarO.K(-845471236);
                if (CameraInputButton$lambda$10(h37Var2)) {
                    String string11 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                    String strF111 = nr1.f(bj4VarO, R.string.intercom_settings);
                    String strF112 = nr1.f(bj4VarO, R.string.intercom_not_now);
                    Integer numValueOf11 = Integer.valueOf(R.drawable.intercom_ic_camera);
                    bj4VarO.K(-845454121);
                    if ((57344 & i3) == 16384) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objF6 = bj4VarO.f();
                    if (z6) {
                        objF6 = new kh0(mh4Var4, h37Var2);
                        bj4VarO.C(objF6);
                    } else {
                        objF6 = new kh0(mh4Var4, h37Var2);
                        bj4VarO.C(objF6);
                    }
                    mh4 mh4Var119 = (mh4) objF6;
                    bj4VarO.U(false);
                    bj4VarO.K(-845450328);
                    zJ4 = bj4VarO.j(context);
                    objF7 = bj4VarO.f();
                    if (zJ4) {
                        objF7 = new mh4() { // from class: k31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                            }
                        };
                        bj4VarO.C(objF7);
                    } else {
                        objF7 = new mh4() { // from class: k31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                            }
                        };
                        bj4VarO.C(objF7);
                    }
                    mh4 mh4Var1110 = (mh4) objF7;
                    z2 = false;
                    bj4VarO.U(false);
                    mh4Var6 = mh4Var4;
                    PermissionDeniedDialogKt.PermissionDeniedDialog(null, string11, strF111, strF112, numValueOf11, mh4Var119, mh4Var1110, bj4VarO, 0, 1);
                } else {
                    mh4Var6 = mh4Var4;
                    z2 = false;
                }
                bj4VarO.U(z2);
                t9 t9Var11 = new t9();
                bj4VarO.K(-845437412);
                i12 = i3 & 112;
                if (i12 == 32) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                zJ2 = z3 | bj4VarO.j(context) | bj4VarO.J(str) | bj4VarO.j(eh6VarF);
                objF4 = bj4VarO.f();
                if (zJ2) {
                    final String str11110 = str;
                    objF4 = new oh4() { // from class: l31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str11110, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    final String str11111 = str;
                    objF4 = new oh4() { // from class: l31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str11111, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(z2);
                eh6VarF2 = ia.f(t9Var11, (oh4) objF4, bj4VarO);
                bj4VarO.K(-845427931);
                if ((i3 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                boolean zJ15 = z4 | bj4VarO.j(context);
                if (i12 == 32) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                zJ3 = z5 | zJ15 | bj4VarO.J(str) | bj4VarO.j(eh6VarF) | bj4VarO.j(eh6VarF2);
                objF5 = bj4VarO.f();
                if (zJ3) {
                    mh4Var7 = mh4Var5;
                    final String str11112 = str;
                    objF5 = new mh4() { // from class: m31
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str11112, eh6VarF, h37Var);
                        }
                    };
                    bj4VarO.C(objF5);
                } else {
                    mh4Var7 = mh4Var5;
                    final String str11113 = str;
                    objF5 = new mh4() { // from class: m31
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str11113, eh6VarF, h37Var);
                        }
                    };
                    bj4VarO.C(objF5);
                }
                bj4VarO.U(z2);
                ox6 ox6VarC12 = we1.c(ox6Var3, z2, null, (mh4) objF5, 15);
                fl6VarD = dv0.d(di.a.a, z2);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarC12);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                ci4Var.invoke(bj4VarO, Integer.valueOf((i3 >> 15) & 14));
                bj4VarO.U(true);
                ox6Var4 = ox6Var3;
                mh4Var8 = mh4Var7;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: n31
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return CameraInputButtonKt.CameraInputButton$lambda$21(ox6Var4, cameraInputType, oh4Var, mh4Var8, mh4Var6, ci4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        mh4Var3 = mh4Var;
        i7 = i2 & 16;
        if (i7 != 0) {
            if ((i & 24576) == 0) {
                mh4Var4 = mh4Var2;
                if (bj4VarO.j(mh4Var4)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bj4VarO.j(ci4Var)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i3 & 74899) == 74898) {
                if (i13 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                i10 = 0;
                if (i5 != 0) {
                    bj4VarO.K(-845519198);
                    objF9 = bj4VarO.f();
                    if (objF9 == c0187a) {
                        objF9 = new h31();
                        bj4VarO.C(objF9);
                    }
                    bj4VarO.U(false);
                    mh4Var5 = (mh4) objF9;
                } else {
                    mh4Var5 = mh4Var3;
                }
                if (i7 != 0) {
                    bj4VarO.K(-845517886);
                    objF8 = bj4VarO.f();
                    if (objF8 == c0187a) {
                        objF8 = new i31(i10);
                        bj4VarO.C(objF8);
                    }
                    mh4Var4 = (mh4) objF8;
                    bj4VarO.U(false);
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                bj4VarO.K(-845514337);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(BuildConfig.FLAVOR);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                bj4VarO.U(false);
                i11 = WhenMappings.$EnumSwitchMapping$0[cameraInputType2.ordinal()];
                if (i11 == 1) {
                    str = "videos";
                } else {
                    if (i11 != 2) {
                        defpackage.u.b();
                        return;
                    }
                    str = "images";
                }
                u9 u9Var12 = new u9();
                bj4VarO.K(-845504028);
                if ((i3 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                zJ = z | bj4VarO.j(context) | bj4VarO.J(str);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new oh4() { // from class: j31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: j31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                eh6VarF = ia.f(u9Var12, (oh4) objF2, bj4VarO);
                bj4VarO.K(-845473406);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF3);
                }
                h37Var2 = (h37) objF3;
                bj4VarO.U(false);
                bj4VarO.K(-845471236);
                if (CameraInputButton$lambda$10(h37Var2)) {
                    String string12 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                    String strF113 = nr1.f(bj4VarO, R.string.intercom_settings);
                    String strF114 = nr1.f(bj4VarO, R.string.intercom_not_now);
                    Integer numValueOf12 = Integer.valueOf(R.drawable.intercom_ic_camera);
                    bj4VarO.K(-845454121);
                    if ((57344 & i3) == 16384) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objF6 = bj4VarO.f();
                    if (z6) {
                        objF6 = new kh0(mh4Var4, h37Var2);
                        bj4VarO.C(objF6);
                    } else {
                        objF6 = new kh0(mh4Var4, h37Var2);
                        bj4VarO.C(objF6);
                    }
                    mh4 mh4Var1111 = (mh4) objF6;
                    bj4VarO.U(false);
                    bj4VarO.K(-845450328);
                    zJ4 = bj4VarO.j(context);
                    objF7 = bj4VarO.f();
                    if (zJ4) {
                        objF7 = new mh4() { // from class: k31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                            }
                        };
                        bj4VarO.C(objF7);
                    } else {
                        objF7 = new mh4() { // from class: k31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                            }
                        };
                        bj4VarO.C(objF7);
                    }
                    mh4 mh4Var1112 = (mh4) objF7;
                    z2 = false;
                    bj4VarO.U(false);
                    mh4Var6 = mh4Var4;
                    PermissionDeniedDialogKt.PermissionDeniedDialog(null, string12, strF113, strF114, numValueOf12, mh4Var1111, mh4Var1112, bj4VarO, 0, 1);
                } else {
                    mh4Var6 = mh4Var4;
                    z2 = false;
                }
                bj4VarO.U(z2);
                t9 t9Var12 = new t9();
                bj4VarO.K(-845437412);
                i12 = i3 & 112;
                if (i12 == 32) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                zJ2 = z3 | bj4VarO.j(context) | bj4VarO.J(str) | bj4VarO.j(eh6VarF);
                objF4 = bj4VarO.f();
                if (zJ2) {
                    final String str11114 = str;
                    objF4 = new oh4() { // from class: l31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str11114, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    final String str11115 = str;
                    objF4 = new oh4() { // from class: l31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str11115, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(z2);
                eh6VarF2 = ia.f(t9Var12, (oh4) objF4, bj4VarO);
                bj4VarO.K(-845427931);
                if ((i3 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                boolean zJ16 = z4 | bj4VarO.j(context);
                if (i12 == 32) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                zJ3 = z5 | zJ16 | bj4VarO.J(str) | bj4VarO.j(eh6VarF) | bj4VarO.j(eh6VarF2);
                objF5 = bj4VarO.f();
                if (zJ3) {
                    mh4Var7 = mh4Var5;
                    final String str11116 = str;
                    objF5 = new mh4() { // from class: m31
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str11116, eh6VarF, h37Var);
                        }
                    };
                    bj4VarO.C(objF5);
                } else {
                    mh4Var7 = mh4Var5;
                    final String str11117 = str;
                    objF5 = new mh4() { // from class: m31
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str11117, eh6VarF, h37Var);
                        }
                    };
                    bj4VarO.C(objF5);
                }
                bj4VarO.U(z2);
                ox6 ox6VarC13 = we1.c(ox6Var3, z2, null, (mh4) objF5, 15);
                fl6VarD = dv0.d(di.a.a, z2);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarC13);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                ci4Var.invoke(bj4VarO, Integer.valueOf((i3 >> 15) & 14));
                bj4VarO.U(true);
                ox6Var4 = ox6Var3;
                mh4Var8 = mh4Var7;
            } else {
                if (i13 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                i10 = 0;
                if (i5 != 0) {
                    bj4VarO.K(-845519198);
                    objF9 = bj4VarO.f();
                    if (objF9 == c0187a) {
                        objF9 = new h31();
                        bj4VarO.C(objF9);
                    }
                    bj4VarO.U(false);
                    mh4Var5 = (mh4) objF9;
                } else {
                    mh4Var5 = mh4Var3;
                }
                if (i7 != 0) {
                    bj4VarO.K(-845517886);
                    objF8 = bj4VarO.f();
                    if (objF8 == c0187a) {
                        objF8 = new i31(i10);
                        bj4VarO.C(objF8);
                    }
                    mh4Var4 = (mh4) objF8;
                    bj4VarO.U(false);
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                bj4VarO.K(-845514337);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(BuildConfig.FLAVOR);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                bj4VarO.U(false);
                i11 = WhenMappings.$EnumSwitchMapping$0[cameraInputType2.ordinal()];
                if (i11 == 1) {
                    str = "videos";
                } else {
                    if (i11 != 2) {
                        defpackage.u.b();
                        return;
                    }
                    str = "images";
                }
                u9 u9Var13 = new u9();
                bj4VarO.K(-845504028);
                if ((i3 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                zJ = z | bj4VarO.j(context) | bj4VarO.J(str);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new oh4() { // from class: j31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: j31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                eh6VarF = ia.f(u9Var13, (oh4) objF2, bj4VarO);
                bj4VarO.K(-845473406);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF3);
                }
                h37Var2 = (h37) objF3;
                bj4VarO.U(false);
                bj4VarO.K(-845471236);
                if (CameraInputButton$lambda$10(h37Var2)) {
                    String string13 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                    String strF115 = nr1.f(bj4VarO, R.string.intercom_settings);
                    String strF116 = nr1.f(bj4VarO, R.string.intercom_not_now);
                    Integer numValueOf13 = Integer.valueOf(R.drawable.intercom_ic_camera);
                    bj4VarO.K(-845454121);
                    if ((57344 & i3) == 16384) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objF6 = bj4VarO.f();
                    if (z6) {
                        objF6 = new kh0(mh4Var4, h37Var2);
                        bj4VarO.C(objF6);
                    } else {
                        objF6 = new kh0(mh4Var4, h37Var2);
                        bj4VarO.C(objF6);
                    }
                    mh4 mh4Var1113 = (mh4) objF6;
                    bj4VarO.U(false);
                    bj4VarO.K(-845450328);
                    zJ4 = bj4VarO.j(context);
                    objF7 = bj4VarO.f();
                    if (zJ4) {
                        objF7 = new mh4() { // from class: k31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                            }
                        };
                        bj4VarO.C(objF7);
                    } else {
                        objF7 = new mh4() { // from class: k31
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                            }
                        };
                        bj4VarO.C(objF7);
                    }
                    mh4 mh4Var1114 = (mh4) objF7;
                    z2 = false;
                    bj4VarO.U(false);
                    mh4Var6 = mh4Var4;
                    PermissionDeniedDialogKt.PermissionDeniedDialog(null, string13, strF115, strF116, numValueOf13, mh4Var1113, mh4Var1114, bj4VarO, 0, 1);
                } else {
                    mh4Var6 = mh4Var4;
                    z2 = false;
                }
                bj4VarO.U(z2);
                t9 t9Var13 = new t9();
                bj4VarO.K(-845437412);
                i12 = i3 & 112;
                if (i12 == 32) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                zJ2 = z3 | bj4VarO.j(context) | bj4VarO.J(str) | bj4VarO.j(eh6VarF);
                objF4 = bj4VarO.f();
                if (zJ2) {
                    final String str11118 = str;
                    objF4 = new oh4() { // from class: l31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str11118, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    final String str11119 = str;
                    objF4 = new oh4() { // from class: l31
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str11119, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(z2);
                eh6VarF2 = ia.f(t9Var13, (oh4) objF4, bj4VarO);
                bj4VarO.K(-845427931);
                if ((i3 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                boolean zJ17 = z4 | bj4VarO.j(context);
                if (i12 == 32) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                zJ3 = z5 | zJ17 | bj4VarO.J(str) | bj4VarO.j(eh6VarF) | bj4VarO.j(eh6VarF2);
                objF5 = bj4VarO.f();
                if (zJ3) {
                    mh4Var7 = mh4Var5;
                    final String str111110 = str;
                    objF5 = new mh4() { // from class: m31
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str111110, eh6VarF, h37Var);
                        }
                    };
                    bj4VarO.C(objF5);
                } else {
                    mh4Var7 = mh4Var5;
                    final String str111111 = str;
                    objF5 = new mh4() { // from class: m31
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str111111, eh6VarF, h37Var);
                        }
                    };
                    bj4VarO.C(objF5);
                }
                bj4VarO.U(z2);
                ox6 ox6VarC14 = we1.c(ox6Var3, z2, null, (mh4) objF5, 15);
                fl6VarD = dv0.d(di.a.a, z2);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarC14);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                ci4Var.invoke(bj4VarO, Integer.valueOf((i3 >> 15) & 14));
                bj4VarO.U(true);
                ox6Var4 = ox6Var3;
                mh4Var8 = mh4Var7;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: n31
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return CameraInputButtonKt.CameraInputButton$lambda$21(ox6Var4, cameraInputType, oh4Var, mh4Var8, mh4Var6, ci4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        mh4Var4 = mh4Var2;
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (bj4VarO.j(ci4Var)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((i3 & 74899) == 74898) {
            if (i13 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            c0187a = jt1.a.a;
            i10 = 0;
            if (i5 != 0) {
                bj4VarO.K(-845519198);
                objF9 = bj4VarO.f();
                if (objF9 == c0187a) {
                    objF9 = new h31();
                    bj4VarO.C(objF9);
                }
                bj4VarO.U(false);
                mh4Var5 = (mh4) objF9;
            } else {
                mh4Var5 = mh4Var3;
            }
            if (i7 != 0) {
                bj4VarO.K(-845517886);
                objF8 = bj4VarO.f();
                if (objF8 == c0187a) {
                    objF8 = new i31(i10);
                    bj4VarO.C(objF8);
                }
                mh4Var4 = (mh4) objF8;
                bj4VarO.U(false);
            }
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            bj4VarO.K(-845514337);
            objF = bj4VarO.f();
            if (objF == c0187a) {
                objF = bl7.i(BuildConfig.FLAVOR);
                bj4VarO.C(objF);
            }
            h37Var = (h37) objF;
            bj4VarO.U(false);
            i11 = WhenMappings.$EnumSwitchMapping$0[cameraInputType2.ordinal()];
            if (i11 == 1) {
                str = "videos";
            } else {
                if (i11 != 2) {
                    defpackage.u.b();
                    return;
                }
                str = "images";
            }
            u9 u9Var14 = new u9();
            bj4VarO.K(-845504028);
            if ((i3 & 896) == 256) {
                z = true;
            } else {
                z = false;
            }
            zJ = z | bj4VarO.j(context) | bj4VarO.J(str);
            objF2 = bj4VarO.f();
            if (zJ) {
                objF2 = new oh4() { // from class: j31
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new oh4() { // from class: j31
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                    }
                };
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            eh6VarF = ia.f(u9Var14, (oh4) objF2, bj4VarO);
            bj4VarO.K(-845473406);
            objF3 = bj4VarO.f();
            if (objF3 == c0187a) {
                objF3 = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF3);
            }
            h37Var2 = (h37) objF3;
            bj4VarO.U(false);
            bj4VarO.K(-845471236);
            if (CameraInputButton$lambda$10(h37Var2)) {
                String string14 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                String strF117 = nr1.f(bj4VarO, R.string.intercom_settings);
                String strF118 = nr1.f(bj4VarO, R.string.intercom_not_now);
                Integer numValueOf14 = Integer.valueOf(R.drawable.intercom_ic_camera);
                bj4VarO.K(-845454121);
                if ((57344 & i3) == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objF6 = bj4VarO.f();
                if (z6) {
                    objF6 = new kh0(mh4Var4, h37Var2);
                    bj4VarO.C(objF6);
                } else {
                    objF6 = new kh0(mh4Var4, h37Var2);
                    bj4VarO.C(objF6);
                }
                mh4 mh4Var1115 = (mh4) objF6;
                bj4VarO.U(false);
                bj4VarO.K(-845450328);
                zJ4 = bj4VarO.j(context);
                objF7 = bj4VarO.f();
                if (zJ4) {
                    objF7 = new mh4() { // from class: k31
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                        }
                    };
                    bj4VarO.C(objF7);
                } else {
                    objF7 = new mh4() { // from class: k31
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                        }
                    };
                    bj4VarO.C(objF7);
                }
                mh4 mh4Var1116 = (mh4) objF7;
                z2 = false;
                bj4VarO.U(false);
                mh4Var6 = mh4Var4;
                PermissionDeniedDialogKt.PermissionDeniedDialog(null, string14, strF117, strF118, numValueOf14, mh4Var1115, mh4Var1116, bj4VarO, 0, 1);
            } else {
                mh4Var6 = mh4Var4;
                z2 = false;
            }
            bj4VarO.U(z2);
            t9 t9Var14 = new t9();
            bj4VarO.K(-845437412);
            i12 = i3 & 112;
            if (i12 == 32) {
                z3 = true;
            } else {
                z3 = z2;
            }
            zJ2 = z3 | bj4VarO.j(context) | bj4VarO.J(str) | bj4VarO.j(eh6VarF);
            objF4 = bj4VarO.f();
            if (zJ2) {
                final String str111112 = str;
                objF4 = new oh4() { // from class: l31
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str111112, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                    }
                };
                bj4VarO.C(objF4);
            } else {
                final String str111113 = str;
                objF4 = new oh4() { // from class: l31
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str111113, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                    }
                };
                bj4VarO.C(objF4);
            }
            bj4VarO.U(z2);
            eh6VarF2 = ia.f(t9Var14, (oh4) objF4, bj4VarO);
            bj4VarO.K(-845427931);
            if ((i3 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = z2;
            }
            boolean zJ18 = z4 | bj4VarO.j(context);
            if (i12 == 32) {
                z5 = true;
            } else {
                z5 = z2;
            }
            zJ3 = z5 | zJ18 | bj4VarO.J(str) | bj4VarO.j(eh6VarF) | bj4VarO.j(eh6VarF2);
            objF5 = bj4VarO.f();
            if (zJ3) {
                mh4Var7 = mh4Var5;
                final String str111114 = str;
                objF5 = new mh4() { // from class: m31
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str111114, eh6VarF, h37Var);
                    }
                };
                bj4VarO.C(objF5);
            } else {
                mh4Var7 = mh4Var5;
                final String str111115 = str;
                objF5 = new mh4() { // from class: m31
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str111115, eh6VarF, h37Var);
                    }
                };
                bj4VarO.C(objF5);
            }
            bj4VarO.U(z2);
            ox6 ox6VarC15 = we1.c(ox6Var3, z2, null, (mh4) objF5, 15);
            fl6VarD = dv0.d(di.a.a, z2);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarC15);
            bt1.c.getClass();
            aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            ci4Var.invoke(bj4VarO, Integer.valueOf((i3 >> 15) & 14));
            bj4VarO.U(true);
            ox6Var4 = ox6Var3;
            mh4Var8 = mh4Var7;
        } else {
            if (i13 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            c0187a = jt1.a.a;
            i10 = 0;
            if (i5 != 0) {
                bj4VarO.K(-845519198);
                objF9 = bj4VarO.f();
                if (objF9 == c0187a) {
                    objF9 = new h31();
                    bj4VarO.C(objF9);
                }
                bj4VarO.U(false);
                mh4Var5 = (mh4) objF9;
            } else {
                mh4Var5 = mh4Var3;
            }
            if (i7 != 0) {
                bj4VarO.K(-845517886);
                objF8 = bj4VarO.f();
                if (objF8 == c0187a) {
                    objF8 = new i31(i10);
                    bj4VarO.C(objF8);
                }
                mh4Var4 = (mh4) objF8;
                bj4VarO.U(false);
            }
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            bj4VarO.K(-845514337);
            objF = bj4VarO.f();
            if (objF == c0187a) {
                objF = bl7.i(BuildConfig.FLAVOR);
                bj4VarO.C(objF);
            }
            h37Var = (h37) objF;
            bj4VarO.U(false);
            i11 = WhenMappings.$EnumSwitchMapping$0[cameraInputType2.ordinal()];
            if (i11 == 1) {
                str = "videos";
            } else {
                if (i11 != 2) {
                    defpackage.u.b();
                    return;
                }
                str = "images";
            }
            u9 u9Var15 = new u9();
            bj4VarO.K(-845504028);
            if ((i3 & 896) == 256) {
                z = true;
            } else {
                z = false;
            }
            zJ = z | bj4VarO.j(context) | bj4VarO.J(str);
            objF2 = bj4VarO.f();
            if (zJ) {
                objF2 = new oh4() { // from class: j31
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new oh4() { // from class: j31
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$8$lambda$7(oh4Var, context, str, h37Var, (m9) obj);
                    }
                };
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            eh6VarF = ia.f(u9Var15, (oh4) objF2, bj4VarO);
            bj4VarO.K(-845473406);
            objF3 = bj4VarO.f();
            if (objF3 == c0187a) {
                objF3 = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF3);
            }
            h37Var2 = (h37) objF3;
            bj4VarO.U(false);
            bj4VarO.K(-845471236);
            if (CameraInputButton$lambda$10(h37Var2)) {
                String string15 = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                String strF119 = nr1.f(bj4VarO, R.string.intercom_settings);
                String strF1110 = nr1.f(bj4VarO, R.string.intercom_not_now);
                Integer numValueOf15 = Integer.valueOf(R.drawable.intercom_ic_camera);
                bj4VarO.K(-845454121);
                if ((57344 & i3) == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objF6 = bj4VarO.f();
                if (z6) {
                    objF6 = new kh0(mh4Var4, h37Var2);
                    bj4VarO.C(objF6);
                } else {
                    objF6 = new kh0(mh4Var4, h37Var2);
                    bj4VarO.C(objF6);
                }
                mh4 mh4Var1117 = (mh4) objF6;
                bj4VarO.U(false);
                bj4VarO.K(-845450328);
                zJ4 = bj4VarO.j(context);
                objF7 = bj4VarO.f();
                if (zJ4) {
                    objF7 = new mh4() { // from class: k31
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                        }
                    };
                    bj4VarO.C(objF7);
                } else {
                    objF7 = new mh4() { // from class: k31
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$15$lambda$14(context, h37Var2);
                        }
                    };
                    bj4VarO.C(objF7);
                }
                mh4 mh4Var1118 = (mh4) objF7;
                z2 = false;
                bj4VarO.U(false);
                mh4Var6 = mh4Var4;
                PermissionDeniedDialogKt.PermissionDeniedDialog(null, string15, strF119, strF1110, numValueOf15, mh4Var1117, mh4Var1118, bj4VarO, 0, 1);
            } else {
                mh4Var6 = mh4Var4;
                z2 = false;
            }
            bj4VarO.U(z2);
            t9 t9Var15 = new t9();
            bj4VarO.K(-845437412);
            i12 = i3 & 112;
            if (i12 == 32) {
                z3 = true;
            } else {
                z3 = z2;
            }
            zJ2 = z3 | bj4VarO.j(context) | bj4VarO.J(str) | bj4VarO.j(eh6VarF);
            objF4 = bj4VarO.f();
            if (zJ2) {
                final String str111116 = str;
                objF4 = new oh4() { // from class: l31
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str111116, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                    }
                };
                bj4VarO.C(objF4);
            } else {
                final String str111117 = str;
                objF4 = new oh4() { // from class: l31
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return CameraInputButtonKt.CameraInputButton$lambda$17$lambda$16(cameraInputType, context, str111117, eh6VarF, h37Var, h37Var2, ((Boolean) obj).booleanValue());
                    }
                };
                bj4VarO.C(objF4);
            }
            bj4VarO.U(z2);
            eh6VarF2 = ia.f(t9Var15, (oh4) objF4, bj4VarO);
            bj4VarO.K(-845427931);
            if ((i3 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = z2;
            }
            boolean zJ19 = z4 | bj4VarO.j(context);
            if (i12 == 32) {
                z5 = true;
            } else {
                z5 = z2;
            }
            zJ3 = z5 | zJ19 | bj4VarO.J(str) | bj4VarO.j(eh6VarF) | bj4VarO.j(eh6VarF2);
            objF5 = bj4VarO.f();
            if (zJ3) {
                mh4Var7 = mh4Var5;
                final String str111118 = str;
                objF5 = new mh4() { // from class: m31
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str111118, eh6VarF, h37Var);
                    }
                };
                bj4VarO.C(objF5);
            } else {
                mh4Var7 = mh4Var5;
                final String str111119 = str;
                objF5 = new mh4() { // from class: m31
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return CameraInputButtonKt.CameraInputButton$lambda$19$lambda$18(mh4Var7, context, eh6VarF2, cameraInputType, str111119, eh6VarF, h37Var);
                    }
                };
                bj4VarO.C(objF5);
            }
            bj4VarO.U(z2);
            ox6 ox6VarC16 = we1.c(ox6Var3, z2, null, (mh4) objF5, 15);
            fl6VarD = dv0.d(di.a.a, z2);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarC16);
            bt1.c.getClass();
            aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            ci4Var.invoke(bj4VarO, Integer.valueOf((i3 >> 15) & 14));
            bj4VarO.U(true);
            ox6Var4 = ox6Var3;
            mh4Var8 = mh4Var7;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: n31
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return CameraInputButtonKt.CameraInputButton$lambda$21(ox6Var4, cameraInputType, oh4Var, mh4Var8, mh4Var6, ci4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    private static final boolean CameraInputButton$lambda$10(h37<Boolean> h37Var) {
        return h37Var.getValue().booleanValue();
    }

    private static final void CameraInputButton$lambda$11(h37<Boolean> h37Var, boolean z) {
        h37Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CameraInputButton$lambda$13$lambda$12(mh4 mh4Var, h37 h37Var) {
        CameraInputButton$lambda$11(h37Var, false);
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CameraInputButton$lambda$15$lambda$14(Context context, h37 h37Var) {
        CameraInputButton$lambda$11(h37Var, false);
        context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context.getPackageName(), null)));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CameraInputButton$lambda$17$lambda$16(CameraInputType cameraInputType, Context context, String str, eh6 eh6Var, h37 h37Var, h37 h37Var2, boolean z) {
        if (z) {
            CameraInputButton$launchCameraIntent(cameraInputType, context, str, eh6Var, h37Var);
        } else {
            CameraInputButton$lambda$11(h37Var2, true);
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CameraInputButton$lambda$19$lambda$18(mh4 mh4Var, Context context, eh6 eh6Var, CameraInputType cameraInputType, String str, eh6 eh6Var2, h37 h37Var) {
        mh4Var.invoke();
        if (!hasCameraPermissionInManifest(context) || vz1.a(context, "android.permission.CAMERA") == 0) {
            CameraInputButton$launchCameraIntent(cameraInputType, context, str, eh6Var2, h37Var);
        } else {
            eh6Var.a("android.permission.CAMERA");
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CameraInputButton$lambda$21(ox6 ox6Var, CameraInputType cameraInputType, oh4 oh4Var, mh4 mh4Var, mh4 mh4Var2, ci4 ci4Var, int i, int i2, jt1 jt1Var, int i3) {
        CameraInputButton(ox6Var, cameraInputType, oh4Var, mh4Var, mh4Var2, ci4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    private static final String CameraInputButton$lambda$5(h37<String> h37Var) {
        return h37Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CameraInputButton$lambda$8$lambda$7(oh4 oh4Var, Context context, String str, h37 h37Var, m9 m9Var) {
        m9Var.getClass();
        if (m9Var.t == -1 && CameraInputButton$lambda$5(h37Var).length() > 0) {
            oh4Var.invoke(getUriByFileName(context, CameraInputButton$lambda$5(h37Var), str));
        }
        h37Var.setValue(BuildConfig.FLAVOR);
        return g2b.a;
    }

    private static final void CameraInputButton$launchCameraIntent(CameraInputType cameraInputType, Context context, String str, eh6<Intent, m9> eh6Var, h37<String> h37Var) {
        String str2;
        Intent intent;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[cameraInputType.ordinal()];
        if (i == 1) {
            str2 = ".mp4";
        } else {
            if (i != 2) {
                defpackage.u.b();
                return;
            }
            str2 = ".jpg";
        }
        String str3 = UUID.randomUUID() + str2;
        Uri uriByFileName = getUriByFileName(context, str3, str);
        h37Var.setValue(str3);
        int i2 = iArr[cameraInputType.ordinal()];
        if (i2 == 1) {
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
        } else {
            if (i2 != 2) {
                defpackage.u.b();
                return;
            }
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
        }
        Intent intentPutExtra = intent.putExtra("output", uriByFileName);
        intentPutExtra.getClass();
        eh6Var.a(intentPutExtra);
    }

    private static final Uri getUriByFileName(Context context, String str, String str2) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        File file = new File(externalCacheDir, str2);
        file.mkdir();
        Uri uriForFile = FileProvider.getUriForFile(context, IntercomFileProviderKt.fileProviderAuthority(context), new File(file, str));
        uriForFile.getClass();
        return uriForFile;
    }

    private static final boolean hasCameraPermissionInManifest(Context context) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                return u30.t("android.permission.CAMERA", strArr);
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
