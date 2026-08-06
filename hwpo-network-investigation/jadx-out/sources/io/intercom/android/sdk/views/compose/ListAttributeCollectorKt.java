package io.intercom.android.sdk.views.compose;

import com.intercom.twig.BuildConfig;
import defpackage.ae8;
import defpackage.ah5;
import defpackage.b72;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fd1;
import defpackage.fl6;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.i12;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kp;
import defpackage.kr3;
import defpackage.kw7;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.mm8;
import defpackage.np4;
import defpackage.oh4;
import defpackage.op4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.vu5;
import defpackage.xi3;
import defpackage.xj8;
import defpackage.xq3;
import defpackage.zg5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.views.compose.ListAttributeCollectorKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ListAttributeCollectorKt {
    public static final void DisabledListAttributePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(865192767);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m865getLambda7$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new np4(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b DisabledListAttributePreview$lambda$14(int i, jt1 jt1Var, int i2) {
        DisabledListAttributePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:84:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0119  */
    /* JADX WARN: Code duplicated, block: B:89:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x014b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0183  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void ListAttributeCollector(ox6 ox6Var, final AttributeData attributeData, boolean z, boolean z2, oh4<? super AttributeData, g2b> oh4Var, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        oh4<? super AttributeData, g2b> oh4Var2;
        int i7;
        ox6 ox6Var3;
        boolean z5;
        boolean z6;
        jt1.a.C0187a c0187a;
        int i8;
        oh4<? super AttributeData, g2b> oh4Var3;
        Object objF;
        final h37 h37Var;
        boolean zJ;
        Object objF2;
        Object objF3;
        final boolean z7;
        bj4 bj4Var;
        final oh4<? super AttributeData, g2b> oh4Var4;
        final boolean z8;
        Object objF4;
        xj8 xj8VarW;
        attributeData.getClass();
        bj4 bj4VarO = jt1Var.o(1993212876);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(attributeData) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                z3 = z;
                i3 |= bj4VarO.c(z3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z4 = z2;
                    if (bj4VarO.c(z4)) {
                        i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        oh4Var2 = oh4Var;
                        if (bj4VarO.j(oh4Var2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i3 & 9363) == 9362 || !bj4VarO.r()) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i10 != 0) {
                            z5 = false;
                        } else {
                            z5 = z3;
                        }
                        if (i4 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        c0187a = jt1.a.a;
                        i8 = 1;
                        if (i6 != 0) {
                            bj4VarO.K(497279521);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new vu5(i8);
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF4;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        boolean zIsFormDisabled = attributeData.isFormDisabled();
                        boolean submitted = attributeData.getAttribute().getSubmitted();
                        bj4VarO.K(497283745);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        bj4VarO.U(false);
                        Object[] objArr = new Object[0];
                        bj4VarO.K(497285974);
                        zJ = bj4VarO.j(attributeData);
                        objF2 = bj4VarO.f();
                        if (zJ || objF2 == c0187a) {
                            objF2 = new xi3(i8, attributeData);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        h37 h37Var2 = (h37) mm8.d(objArr, (mh4) objF2, bj4VarO, 0);
                        if (!z5 && (zIsFormDisabled || submitted)) {
                            i8 = 0;
                        }
                        ox6 ox6VarC = ir9.c(ox6Var3, 1.0f);
                        boolean zListAttributeCollector$lambda$3 = ListAttributeCollector$lambda$3(h37Var);
                        bj4VarO.K(497294500);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new oh4() { // from class: c96
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return ListAttributeCollectorKt.ListAttributeCollector$lambda$10$lambda$9(h37Var, ((Boolean) obj).booleanValue());
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        kr3.a(zListAttributeCollector$lambda$3, (oh4) objF3, ox6VarC, gr1.b(1992435426, new AnonymousClass3(zIsFormDisabled, i8, attributeData, h37Var2, submitted, z6, h37Var, oh4Var3), bj4VarO), bj4VarO, 3120);
                        z7 = z6;
                        bj4Var = bj4VarO;
                        oh4Var4 = oh4Var3;
                        ox6Var2 = ox6Var3;
                        z8 = z5;
                    } else {
                        bj4VarO.u();
                        z8 = z3;
                        z7 = z4;
                        bj4Var = bj4VarO;
                        oh4Var4 = oh4Var2;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: d96
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ListAttributeCollectorKt.ListAttributeCollector$lambda$11(ox6Var2, attributeData, z8, z7, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                oh4Var2 = oh4Var;
                if ((i3 & 9363) == 9362) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i10 != 0) {
                        z5 = false;
                    } else {
                        z5 = z3;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    c0187a = jt1.a.a;
                    i8 = 1;
                    if (i6 != 0) {
                        bj4VarO.K(497279521);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new vu5(i8);
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF4;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    boolean zIsFormDisabled2 = attributeData.isFormDisabled();
                    boolean submitted2 = attributeData.getAttribute().getSubmitted();
                    bj4VarO.K(497283745);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    bj4VarO.U(false);
                    Object[] objArr2 = new Object[0];
                    bj4VarO.K(497285974);
                    zJ = bj4VarO.j(attributeData);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new xi3(i8, attributeData);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new xi3(i8, attributeData);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    h37 h37Var3 = (h37) mm8.d(objArr2, (mh4) objF2, bj4VarO, 0);
                    if (!z5) {
                        i8 = 0;
                    }
                    ox6 ox6VarC2 = ir9.c(ox6Var3, 1.0f);
                    boolean zListAttributeCollector$lambda$4 = ListAttributeCollector$lambda$3(h37Var);
                    bj4VarO.K(497294500);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new oh4() { // from class: c96
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ListAttributeCollectorKt.ListAttributeCollector$lambda$10$lambda$9(h37Var, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    kr3.a(zListAttributeCollector$lambda$4, (oh4) objF3, ox6VarC2, gr1.b(1992435426, new AnonymousClass3(zIsFormDisabled2, i8, attributeData, h37Var3, submitted2, z6, h37Var, oh4Var3), bj4VarO), bj4VarO, 3120);
                    z7 = z6;
                    bj4Var = bj4VarO;
                    oh4Var4 = oh4Var3;
                    ox6Var2 = ox6Var3;
                    z8 = z5;
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i10 != 0) {
                        z5 = false;
                    } else {
                        z5 = z3;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    c0187a = jt1.a.a;
                    i8 = 1;
                    if (i6 != 0) {
                        bj4VarO.K(497279521);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new vu5(i8);
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF4;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    boolean zIsFormDisabled3 = attributeData.isFormDisabled();
                    boolean submitted3 = attributeData.getAttribute().getSubmitted();
                    bj4VarO.K(497283745);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    bj4VarO.U(false);
                    Object[] objArr3 = new Object[0];
                    bj4VarO.K(497285974);
                    zJ = bj4VarO.j(attributeData);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new xi3(i8, attributeData);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new xi3(i8, attributeData);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    h37 h37Var4 = (h37) mm8.d(objArr3, (mh4) objF2, bj4VarO, 0);
                    if (!z5) {
                        i8 = 0;
                    }
                    ox6 ox6VarC3 = ir9.c(ox6Var3, 1.0f);
                    boolean zListAttributeCollector$lambda$5 = ListAttributeCollector$lambda$3(h37Var);
                    bj4VarO.K(497294500);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new oh4() { // from class: c96
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ListAttributeCollectorKt.ListAttributeCollector$lambda$10$lambda$9(h37Var, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    kr3.a(zListAttributeCollector$lambda$5, (oh4) objF3, ox6VarC3, gr1.b(1992435426, new AnonymousClass3(zIsFormDisabled3, i8, attributeData, h37Var4, submitted3, z6, h37Var, oh4Var3), bj4VarO), bj4VarO, 3120);
                    z7 = z6;
                    bj4Var = bj4VarO;
                    oh4Var4 = oh4Var3;
                    ox6Var2 = ox6Var3;
                    z8 = z5;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: d96
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ListAttributeCollectorKt.ListAttributeCollector$lambda$11(ox6Var2, attributeData, z8, z7, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            z4 = z2;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    oh4Var2 = oh4Var;
                    if (bj4VarO.j(oh4Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i3 & 9363) == 9362) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i10 != 0) {
                        z5 = false;
                    } else {
                        z5 = z3;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    c0187a = jt1.a.a;
                    i8 = 1;
                    if (i6 != 0) {
                        bj4VarO.K(497279521);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new vu5(i8);
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF4;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    boolean zIsFormDisabled4 = attributeData.isFormDisabled();
                    boolean submitted4 = attributeData.getAttribute().getSubmitted();
                    bj4VarO.K(497283745);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    bj4VarO.U(false);
                    Object[] objArr4 = new Object[0];
                    bj4VarO.K(497285974);
                    zJ = bj4VarO.j(attributeData);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new xi3(i8, attributeData);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new xi3(i8, attributeData);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    h37 h37Var5 = (h37) mm8.d(objArr4, (mh4) objF2, bj4VarO, 0);
                    if (!z5) {
                        i8 = 0;
                    }
                    ox6 ox6VarC4 = ir9.c(ox6Var3, 1.0f);
                    boolean zListAttributeCollector$lambda$6 = ListAttributeCollector$lambda$3(h37Var);
                    bj4VarO.K(497294500);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new oh4() { // from class: c96
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ListAttributeCollectorKt.ListAttributeCollector$lambda$10$lambda$9(h37Var, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    kr3.a(zListAttributeCollector$lambda$6, (oh4) objF3, ox6VarC4, gr1.b(1992435426, new AnonymousClass3(zIsFormDisabled4, i8, attributeData, h37Var5, submitted4, z6, h37Var, oh4Var3), bj4VarO), bj4VarO, 3120);
                    z7 = z6;
                    bj4Var = bj4VarO;
                    oh4Var4 = oh4Var3;
                    ox6Var2 = ox6Var3;
                    z8 = z5;
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i10 != 0) {
                        z5 = false;
                    } else {
                        z5 = z3;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    c0187a = jt1.a.a;
                    i8 = 1;
                    if (i6 != 0) {
                        bj4VarO.K(497279521);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new vu5(i8);
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF4;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    boolean zIsFormDisabled5 = attributeData.isFormDisabled();
                    boolean submitted5 = attributeData.getAttribute().getSubmitted();
                    bj4VarO.K(497283745);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    bj4VarO.U(false);
                    Object[] objArr5 = new Object[0];
                    bj4VarO.K(497285974);
                    zJ = bj4VarO.j(attributeData);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new xi3(i8, attributeData);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new xi3(i8, attributeData);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    h37 h37Var6 = (h37) mm8.d(objArr5, (mh4) objF2, bj4VarO, 0);
                    if (!z5) {
                        i8 = 0;
                    }
                    ox6 ox6VarC5 = ir9.c(ox6Var3, 1.0f);
                    boolean zListAttributeCollector$lambda$7 = ListAttributeCollector$lambda$3(h37Var);
                    bj4VarO.K(497294500);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new oh4() { // from class: c96
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ListAttributeCollectorKt.ListAttributeCollector$lambda$10$lambda$9(h37Var, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    kr3.a(zListAttributeCollector$lambda$7, (oh4) objF3, ox6VarC5, gr1.b(1992435426, new AnonymousClass3(zIsFormDisabled5, i8, attributeData, h37Var6, submitted5, z6, h37Var, oh4Var3), bj4VarO), bj4VarO, 3120);
                    z7 = z6;
                    bj4Var = bj4VarO;
                    oh4Var4 = oh4Var3;
                    ox6Var2 = ox6Var3;
                    z8 = z5;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: d96
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ListAttributeCollectorKt.ListAttributeCollector$lambda$11(ox6Var2, attributeData, z8, z7, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            oh4Var2 = oh4Var;
            if ((i3 & 9363) == 9362) {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i10 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                c0187a = jt1.a.a;
                i8 = 1;
                if (i6 != 0) {
                    bj4VarO.K(497279521);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new vu5(i8);
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF4;
                } else {
                    oh4Var3 = oh4Var2;
                }
                boolean zIsFormDisabled6 = attributeData.isFormDisabled();
                boolean submitted6 = attributeData.getAttribute().getSubmitted();
                bj4VarO.K(497283745);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                bj4VarO.U(false);
                Object[] objArr6 = new Object[0];
                bj4VarO.K(497285974);
                zJ = bj4VarO.j(attributeData);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new xi3(i8, attributeData);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new xi3(i8, attributeData);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                h37 h37Var7 = (h37) mm8.d(objArr6, (mh4) objF2, bj4VarO, 0);
                if (!z5) {
                    i8 = 0;
                }
                ox6 ox6VarC6 = ir9.c(ox6Var3, 1.0f);
                boolean zListAttributeCollector$lambda$8 = ListAttributeCollector$lambda$3(h37Var);
                bj4VarO.K(497294500);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new oh4() { // from class: c96
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ListAttributeCollectorKt.ListAttributeCollector$lambda$10$lambda$9(h37Var, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                kr3.a(zListAttributeCollector$lambda$8, (oh4) objF3, ox6VarC6, gr1.b(1992435426, new AnonymousClass3(zIsFormDisabled6, i8, attributeData, h37Var7, submitted6, z6, h37Var, oh4Var3), bj4VarO), bj4VarO, 3120);
                z7 = z6;
                bj4Var = bj4VarO;
                oh4Var4 = oh4Var3;
                ox6Var2 = ox6Var3;
                z8 = z5;
            } else {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i10 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                c0187a = jt1.a.a;
                i8 = 1;
                if (i6 != 0) {
                    bj4VarO.K(497279521);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new vu5(i8);
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF4;
                } else {
                    oh4Var3 = oh4Var2;
                }
                boolean zIsFormDisabled7 = attributeData.isFormDisabled();
                boolean submitted7 = attributeData.getAttribute().getSubmitted();
                bj4VarO.K(497283745);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                bj4VarO.U(false);
                Object[] objArr7 = new Object[0];
                bj4VarO.K(497285974);
                zJ = bj4VarO.j(attributeData);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new xi3(i8, attributeData);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new xi3(i8, attributeData);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                h37 h37Var8 = (h37) mm8.d(objArr7, (mh4) objF2, bj4VarO, 0);
                if (!z5) {
                    i8 = 0;
                }
                ox6 ox6VarC7 = ir9.c(ox6Var3, 1.0f);
                boolean zListAttributeCollector$lambda$9 = ListAttributeCollector$lambda$3(h37Var);
                bj4VarO.K(497294500);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new oh4() { // from class: c96
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ListAttributeCollectorKt.ListAttributeCollector$lambda$10$lambda$9(h37Var, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                kr3.a(zListAttributeCollector$lambda$9, (oh4) objF3, ox6VarC7, gr1.b(1992435426, new AnonymousClass3(zIsFormDisabled7, i8, attributeData, h37Var8, submitted7, z6, h37Var, oh4Var3), bj4VarO), bj4VarO, 3120);
                z7 = z6;
                bj4Var = bj4VarO;
                oh4Var4 = oh4Var3;
                ox6Var2 = ox6Var3;
                z8 = z5;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: d96
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ListAttributeCollectorKt.ListAttributeCollector$lambda$11(ox6Var2, attributeData, z8, z7, oh4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        z3 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z4 = z2;
                if (bj4VarO.c(z4)) {
                    i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    oh4Var2 = oh4Var;
                    if (bj4VarO.j(oh4Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i3 & 9363) == 9362) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i10 != 0) {
                        z5 = false;
                    } else {
                        z5 = z3;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    c0187a = jt1.a.a;
                    i8 = 1;
                    if (i6 != 0) {
                        bj4VarO.K(497279521);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new vu5(i8);
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF4;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    boolean zIsFormDisabled8 = attributeData.isFormDisabled();
                    boolean submitted8 = attributeData.getAttribute().getSubmitted();
                    bj4VarO.K(497283745);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    bj4VarO.U(false);
                    Object[] objArr8 = new Object[0];
                    bj4VarO.K(497285974);
                    zJ = bj4VarO.j(attributeData);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new xi3(i8, attributeData);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new xi3(i8, attributeData);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    h37 h37Var9 = (h37) mm8.d(objArr8, (mh4) objF2, bj4VarO, 0);
                    if (!z5) {
                        i8 = 0;
                    }
                    ox6 ox6VarC8 = ir9.c(ox6Var3, 1.0f);
                    boolean zListAttributeCollector$lambda$10 = ListAttributeCollector$lambda$3(h37Var);
                    bj4VarO.K(497294500);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new oh4() { // from class: c96
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ListAttributeCollectorKt.ListAttributeCollector$lambda$10$lambda$9(h37Var, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    kr3.a(zListAttributeCollector$lambda$10, (oh4) objF3, ox6VarC8, gr1.b(1992435426, new AnonymousClass3(zIsFormDisabled8, i8, attributeData, h37Var9, submitted8, z6, h37Var, oh4Var3), bj4VarO), bj4VarO, 3120);
                    z7 = z6;
                    bj4Var = bj4VarO;
                    oh4Var4 = oh4Var3;
                    ox6Var2 = ox6Var3;
                    z8 = z5;
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i10 != 0) {
                        z5 = false;
                    } else {
                        z5 = z3;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    c0187a = jt1.a.a;
                    i8 = 1;
                    if (i6 != 0) {
                        bj4VarO.K(497279521);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new vu5(i8);
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF4;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    boolean zIsFormDisabled9 = attributeData.isFormDisabled();
                    boolean submitted9 = attributeData.getAttribute().getSubmitted();
                    bj4VarO.K(497283745);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    bj4VarO.U(false);
                    Object[] objArr9 = new Object[0];
                    bj4VarO.K(497285974);
                    zJ = bj4VarO.j(attributeData);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new xi3(i8, attributeData);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new xi3(i8, attributeData);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    h37 h37Var10 = (h37) mm8.d(objArr9, (mh4) objF2, bj4VarO, 0);
                    if (!z5) {
                        i8 = 0;
                    }
                    ox6 ox6VarC9 = ir9.c(ox6Var3, 1.0f);
                    boolean zListAttributeCollector$lambda$11 = ListAttributeCollector$lambda$3(h37Var);
                    bj4VarO.K(497294500);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new oh4() { // from class: c96
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ListAttributeCollectorKt.ListAttributeCollector$lambda$10$lambda$9(h37Var, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    kr3.a(zListAttributeCollector$lambda$11, (oh4) objF3, ox6VarC9, gr1.b(1992435426, new AnonymousClass3(zIsFormDisabled9, i8, attributeData, h37Var10, submitted9, z6, h37Var, oh4Var3), bj4VarO), bj4VarO, 3120);
                    z7 = z6;
                    bj4Var = bj4VarO;
                    oh4Var4 = oh4Var3;
                    ox6Var2 = ox6Var3;
                    z8 = z5;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: d96
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ListAttributeCollectorKt.ListAttributeCollector$lambda$11(ox6Var2, attributeData, z8, z7, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            oh4Var2 = oh4Var;
            if ((i3 & 9363) == 9362) {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i10 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                c0187a = jt1.a.a;
                i8 = 1;
                if (i6 != 0) {
                    bj4VarO.K(497279521);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new vu5(i8);
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF4;
                } else {
                    oh4Var3 = oh4Var2;
                }
                boolean zIsFormDisabled10 = attributeData.isFormDisabled();
                boolean submitted10 = attributeData.getAttribute().getSubmitted();
                bj4VarO.K(497283745);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                bj4VarO.U(false);
                Object[] objArr10 = new Object[0];
                bj4VarO.K(497285974);
                zJ = bj4VarO.j(attributeData);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new xi3(i8, attributeData);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new xi3(i8, attributeData);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                h37 h37Var11 = (h37) mm8.d(objArr10, (mh4) objF2, bj4VarO, 0);
                if (!z5) {
                    i8 = 0;
                }
                ox6 ox6VarC10 = ir9.c(ox6Var3, 1.0f);
                boolean zListAttributeCollector$lambda$12 = ListAttributeCollector$lambda$3(h37Var);
                bj4VarO.K(497294500);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new oh4() { // from class: c96
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ListAttributeCollectorKt.ListAttributeCollector$lambda$10$lambda$9(h37Var, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                kr3.a(zListAttributeCollector$lambda$12, (oh4) objF3, ox6VarC10, gr1.b(1992435426, new AnonymousClass3(zIsFormDisabled10, i8, attributeData, h37Var11, submitted10, z6, h37Var, oh4Var3), bj4VarO), bj4VarO, 3120);
                z7 = z6;
                bj4Var = bj4VarO;
                oh4Var4 = oh4Var3;
                ox6Var2 = ox6Var3;
                z8 = z5;
            } else {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i10 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                c0187a = jt1.a.a;
                i8 = 1;
                if (i6 != 0) {
                    bj4VarO.K(497279521);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new vu5(i8);
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF4;
                } else {
                    oh4Var3 = oh4Var2;
                }
                boolean zIsFormDisabled11 = attributeData.isFormDisabled();
                boolean submitted11 = attributeData.getAttribute().getSubmitted();
                bj4VarO.K(497283745);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                bj4VarO.U(false);
                Object[] objArr11 = new Object[0];
                bj4VarO.K(497285974);
                zJ = bj4VarO.j(attributeData);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new xi3(i8, attributeData);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new xi3(i8, attributeData);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                h37 h37Var12 = (h37) mm8.d(objArr11, (mh4) objF2, bj4VarO, 0);
                if (!z5) {
                    i8 = 0;
                }
                ox6 ox6VarC11 = ir9.c(ox6Var3, 1.0f);
                boolean zListAttributeCollector$lambda$13 = ListAttributeCollector$lambda$3(h37Var);
                bj4VarO.K(497294500);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new oh4() { // from class: c96
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ListAttributeCollectorKt.ListAttributeCollector$lambda$10$lambda$9(h37Var, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                kr3.a(zListAttributeCollector$lambda$13, (oh4) objF3, ox6VarC11, gr1.b(1992435426, new AnonymousClass3(zIsFormDisabled11, i8, attributeData, h37Var12, submitted11, z6, h37Var, oh4Var3), bj4VarO), bj4VarO, 3120);
                z7 = z6;
                bj4Var = bj4VarO;
                oh4Var4 = oh4Var3;
                ox6Var2 = ox6Var3;
                z8 = z5;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: d96
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ListAttributeCollectorKt.ListAttributeCollector$lambda$11(ox6Var2, attributeData, z8, z7, oh4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        z4 = z2;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                oh4Var2 = oh4Var;
                if (bj4VarO.j(oh4Var2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i3 & 9363) == 9362) {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i10 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                c0187a = jt1.a.a;
                i8 = 1;
                if (i6 != 0) {
                    bj4VarO.K(497279521);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new vu5(i8);
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF4;
                } else {
                    oh4Var3 = oh4Var2;
                }
                boolean zIsFormDisabled12 = attributeData.isFormDisabled();
                boolean submitted12 = attributeData.getAttribute().getSubmitted();
                bj4VarO.K(497283745);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                bj4VarO.U(false);
                Object[] objArr12 = new Object[0];
                bj4VarO.K(497285974);
                zJ = bj4VarO.j(attributeData);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new xi3(i8, attributeData);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new xi3(i8, attributeData);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                h37 h37Var13 = (h37) mm8.d(objArr12, (mh4) objF2, bj4VarO, 0);
                if (!z5) {
                    i8 = 0;
                }
                ox6 ox6VarC12 = ir9.c(ox6Var3, 1.0f);
                boolean zListAttributeCollector$lambda$14 = ListAttributeCollector$lambda$3(h37Var);
                bj4VarO.K(497294500);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new oh4() { // from class: c96
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ListAttributeCollectorKt.ListAttributeCollector$lambda$10$lambda$9(h37Var, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                kr3.a(zListAttributeCollector$lambda$14, (oh4) objF3, ox6VarC12, gr1.b(1992435426, new AnonymousClass3(zIsFormDisabled12, i8, attributeData, h37Var13, submitted12, z6, h37Var, oh4Var3), bj4VarO), bj4VarO, 3120);
                z7 = z6;
                bj4Var = bj4VarO;
                oh4Var4 = oh4Var3;
                ox6Var2 = ox6Var3;
                z8 = z5;
            } else {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i10 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                c0187a = jt1.a.a;
                i8 = 1;
                if (i6 != 0) {
                    bj4VarO.K(497279521);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new vu5(i8);
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF4;
                } else {
                    oh4Var3 = oh4Var2;
                }
                boolean zIsFormDisabled13 = attributeData.isFormDisabled();
                boolean submitted13 = attributeData.getAttribute().getSubmitted();
                bj4VarO.K(497283745);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                bj4VarO.U(false);
                Object[] objArr13 = new Object[0];
                bj4VarO.K(497285974);
                zJ = bj4VarO.j(attributeData);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new xi3(i8, attributeData);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new xi3(i8, attributeData);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                h37 h37Var14 = (h37) mm8.d(objArr13, (mh4) objF2, bj4VarO, 0);
                if (!z5) {
                    i8 = 0;
                }
                ox6 ox6VarC13 = ir9.c(ox6Var3, 1.0f);
                boolean zListAttributeCollector$lambda$15 = ListAttributeCollector$lambda$3(h37Var);
                bj4VarO.K(497294500);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new oh4() { // from class: c96
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ListAttributeCollectorKt.ListAttributeCollector$lambda$10$lambda$9(h37Var, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                kr3.a(zListAttributeCollector$lambda$15, (oh4) objF3, ox6VarC13, gr1.b(1992435426, new AnonymousClass3(zIsFormDisabled13, i8, attributeData, h37Var14, submitted13, z6, h37Var, oh4Var3), bj4VarO), bj4VarO, 3120);
                z7 = z6;
                bj4Var = bj4VarO;
                oh4Var4 = oh4Var3;
                ox6Var2 = ox6Var3;
                z8 = z5;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: d96
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ListAttributeCollectorKt.ListAttributeCollector$lambda$11(ox6Var2, attributeData, z8, z7, oh4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        oh4Var2 = oh4Var;
        if ((i3 & 9363) == 9362) {
            if (i9 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i10 != 0) {
                z5 = false;
            } else {
                z5 = z3;
            }
            if (i4 != 0) {
                z6 = false;
            } else {
                z6 = z4;
            }
            c0187a = jt1.a.a;
            i8 = 1;
            if (i6 != 0) {
                bj4VarO.K(497279521);
                objF4 = bj4VarO.f();
                if (objF4 == c0187a) {
                    objF4 = new vu5(i8);
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                oh4Var3 = (oh4) objF4;
            } else {
                oh4Var3 = oh4Var2;
            }
            boolean zIsFormDisabled14 = attributeData.isFormDisabled();
            boolean submitted14 = attributeData.getAttribute().getSubmitted();
            bj4VarO.K(497283745);
            objF = bj4VarO.f();
            if (objF == c0187a) {
                objF = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF);
            }
            h37Var = (h37) objF;
            bj4VarO.U(false);
            Object[] objArr14 = new Object[0];
            bj4VarO.K(497285974);
            zJ = bj4VarO.j(attributeData);
            objF2 = bj4VarO.f();
            if (zJ) {
                objF2 = new xi3(i8, attributeData);
                bj4VarO.C(objF2);
            } else {
                objF2 = new xi3(i8, attributeData);
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            h37 h37Var15 = (h37) mm8.d(objArr14, (mh4) objF2, bj4VarO, 0);
            if (!z5) {
                i8 = 0;
            }
            ox6 ox6VarC14 = ir9.c(ox6Var3, 1.0f);
            boolean zListAttributeCollector$lambda$16 = ListAttributeCollector$lambda$3(h37Var);
            bj4VarO.K(497294500);
            objF3 = bj4VarO.f();
            if (objF3 == c0187a) {
                objF3 = new oh4() { // from class: c96
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return ListAttributeCollectorKt.ListAttributeCollector$lambda$10$lambda$9(h37Var, ((Boolean) obj).booleanValue());
                    }
                };
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            kr3.a(zListAttributeCollector$lambda$16, (oh4) objF3, ox6VarC14, gr1.b(1992435426, new AnonymousClass3(zIsFormDisabled14, i8, attributeData, h37Var15, submitted14, z6, h37Var, oh4Var3), bj4VarO), bj4VarO, 3120);
            z7 = z6;
            bj4Var = bj4VarO;
            oh4Var4 = oh4Var3;
            ox6Var2 = ox6Var3;
            z8 = z5;
        } else {
            if (i9 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i10 != 0) {
                z5 = false;
            } else {
                z5 = z3;
            }
            if (i4 != 0) {
                z6 = false;
            } else {
                z6 = z4;
            }
            c0187a = jt1.a.a;
            i8 = 1;
            if (i6 != 0) {
                bj4VarO.K(497279521);
                objF4 = bj4VarO.f();
                if (objF4 == c0187a) {
                    objF4 = new vu5(i8);
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                oh4Var3 = (oh4) objF4;
            } else {
                oh4Var3 = oh4Var2;
            }
            boolean zIsFormDisabled15 = attributeData.isFormDisabled();
            boolean submitted15 = attributeData.getAttribute().getSubmitted();
            bj4VarO.K(497283745);
            objF = bj4VarO.f();
            if (objF == c0187a) {
                objF = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF);
            }
            h37Var = (h37) objF;
            bj4VarO.U(false);
            Object[] objArr15 = new Object[0];
            bj4VarO.K(497285974);
            zJ = bj4VarO.j(attributeData);
            objF2 = bj4VarO.f();
            if (zJ) {
                objF2 = new xi3(i8, attributeData);
                bj4VarO.C(objF2);
            } else {
                objF2 = new xi3(i8, attributeData);
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            h37 h37Var16 = (h37) mm8.d(objArr15, (mh4) objF2, bj4VarO, 0);
            if (!z5) {
                i8 = 0;
            }
            ox6 ox6VarC15 = ir9.c(ox6Var3, 1.0f);
            boolean zListAttributeCollector$lambda$17 = ListAttributeCollector$lambda$3(h37Var);
            bj4VarO.K(497294500);
            objF3 = bj4VarO.f();
            if (objF3 == c0187a) {
                objF3 = new oh4() { // from class: c96
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return ListAttributeCollectorKt.ListAttributeCollector$lambda$10$lambda$9(h37Var, ((Boolean) obj).booleanValue());
                    }
                };
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            kr3.a(zListAttributeCollector$lambda$17, (oh4) objF3, ox6VarC15, gr1.b(1992435426, new AnonymousClass3(zIsFormDisabled15, i8, attributeData, h37Var16, submitted15, z6, h37Var, oh4Var3), bj4VarO), bj4VarO, 3120);
            z7 = z6;
            bj4Var = bj4VarO;
            oh4Var4 = oh4Var3;
            ox6Var2 = ox6Var3;
            z8 = z5;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: d96
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ListAttributeCollectorKt.ListAttributeCollector$lambda$11(ox6Var2, attributeData, z8, z7, oh4Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ListAttributeCollector$lambda$1$lambda$0(AttributeData attributeData) {
        attributeData.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ListAttributeCollector$lambda$10$lambda$9(h37 h37Var, boolean z) {
        ListAttributeCollector$lambda$4(h37Var, z);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ListAttributeCollector$lambda$11(ox6 ox6Var, AttributeData attributeData, boolean z, boolean z2, oh4 oh4Var, int i, int i2, jt1 jt1Var, int i3) {
        ListAttributeCollector(ox6Var, attributeData, z, z2, oh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ListAttributeCollector$lambda$3(h37<Boolean> h37Var) {
        return h37Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ListAttributeCollector$lambda$4(h37<Boolean> h37Var, boolean z) {
        h37Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h37 ListAttributeCollector$lambda$6$lambda$5(AttributeData attributeData) {
        String value = attributeData.getAttribute().getValue();
        if (value == null) {
            value = BuildConfig.FLAVOR;
        }
        return bl7.i(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ListAttributeCollector$lambda$7(h37<String> h37Var) {
        return h37Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ListAttributeCollector$lambda$8(h37<String> h37Var, String str) {
        h37Var.setValue(str);
    }

    @IntercomPreviews
    public static final void ListAttributePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1324269915);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m861getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new i12(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ListAttributePreview$lambda$12(int i, jt1 jt1Var, int i2) {
        ListAttributePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void SubmittedAndDisabledListAttributePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1340154819);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m867getLambda9$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new fd1(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SubmittedAndDisabledListAttributePreview$lambda$15(int i, jt1 jt1Var, int i2) {
        SubmittedAndDisabledListAttributePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void SubmittedListAttributePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-899805828);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m863getLambda5$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new op4(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SubmittedListAttributePreview$lambda$13(int i, jt1 jt1Var, int i2) {
        SubmittedListAttributePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$ListAttributeCollector$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass3 implements ei4<xq3, jt1, Integer, g2b> {
        final /* synthetic */ AttributeData $attributeData;
        final /* synthetic */ boolean $disabled;
        final /* synthetic */ h37<Boolean> $expanded$delegate;
        final /* synthetic */ boolean $loading;
        final /* synthetic */ oh4<AttributeData, g2b> $onSubmitAttribute;
        final /* synthetic */ boolean $showDropdownMenu;
        final /* synthetic */ boolean $submitted;
        final /* synthetic */ h37<String> $value$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(boolean z, boolean z2, AttributeData attributeData, h37<String> h37Var, boolean z3, boolean z4, h37<Boolean> h37Var2, oh4<? super AttributeData, g2b> oh4Var) {
            this.$disabled = z;
            this.$showDropdownMenu = z2;
            this.$attributeData = attributeData;
            this.$value$delegate = h37Var;
            this.$submitted = z3;
            this.$loading = z4;
            this.$expanded$delegate = h37Var2;
            this.$onSubmitAttribute = oh4Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$1$lambda$0(String str) {
            str.getClass();
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$3$lambda$2(h37 h37Var) {
            ListAttributeCollectorKt.ListAttributeCollector$lambda$4(h37Var, false);
            return g2b.a;
        }

        public final void invoke(xq3 xq3Var, jt1 jt1Var, int i) {
            int i2;
            xq3Var.getClass();
            if ((i & 6) == 0) {
                i2 = i | ((i & 8) == 0 ? jt1Var.J(xq3Var) : jt1Var.j(xq3Var) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            ox6 ox6VarE = xq3Var.e(ir9.d(ir9.c(ox6.a.t, 1.0f), 40.0f));
            String strListAttributeCollector$lambda$7 = ListAttributeCollectorKt.ListAttributeCollector$lambda$7(this.$value$delegate);
            boolean z = !this.$disabled;
            jt1Var.K(-742064896);
            Object objF = jt1Var.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = new c();
                jt1Var.C(objF);
            }
            jt1Var.B();
            ci4<jt1, Integer, g2b> ci4VarM859getLambda1$intercom_sdk_base_release = ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m859getLambda1$intercom_sdk_base_release();
            final boolean z2 = this.$submitted;
            final boolean z3 = this.$loading;
            IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strListAttributeCollector$lambda$7, (oh4) objF, ox6VarE, z, true, null, null, ci4VarM859getLambda1$intercom_sdk_base_release, null, gr1.b(-1903726860, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt.ListAttributeCollector.3.2
                public final void invoke(jt1 jt1Var2, int i3) {
                    if ((i3 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    ox6.a aVar = ox6.a.t;
                    ox6 ox6VarJ = ir9.j(eo7.m(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), 40.0f);
                    boolean z4 = z2;
                    boolean z5 = z3;
                    fl6 fl6VarD = dv0.d(di.a.e, false);
                    int iHashCode = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6 ox6VarC = it1.c(jt1Var2, ox6VarJ);
                    bt1.c.getClass();
                    qr5.a aVar2 = bt1.a.b;
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar2);
                    } else {
                        jt1Var2.z();
                    }
                    rd7.d(jt1Var2, bt1.a.f, fl6VarD);
                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(jt1Var2, bt1.a.h);
                    rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                    if (z4) {
                        jt1Var2.K(-1795451461);
                        m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), null, null, IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 56, 4);
                        jt1Var2.B();
                    } else if (z5) {
                        jt1Var2.K(175868510);
                        ae8.a(ir9.j(aVar, 20.0f), ah5.a(IntercomTheme.INSTANCE, jt1Var2, IntercomTheme.$stable), 3.0f, 0L, 0, 0.0f, jt1Var2, 390, 56);
                        jt1Var2.B();
                    } else {
                        jt1Var2.K(-1795433677);
                        m65.b(is7.a(R.drawable.intercom_list_arrow_down, jt1Var2, 0), null, null, 0L, jt1Var2, 56, 12);
                        jt1Var2.B();
                    }
                    jt1Var2.I();
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, jt1Var), false, null, null, null, true, 0, 0, null, null, null, null, jt1Var, 817913904, 24576, 0, 2080096);
            if (this.$showDropdownMenu) {
                boolean z4 = !this.$attributeData.isFormDisabled() && ListAttributeCollectorKt.ListAttributeCollector$lambda$3(this.$expanded$delegate);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i3 = IntercomTheme.$stable;
                long jA = zg5.a(intercomTheme, jt1Var, i3);
                b72 b72Var = intercomTheme.getShapes(jt1Var, i3).b;
                jt1Var.K(-742015054);
                final h37<Boolean> h37Var = this.$expanded$delegate;
                Object objF2 = jt1Var.f();
                if (objF2 == c0187a) {
                    objF2 = new mh4() { // from class: io.intercom.android.sdk.views.compose.d
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ListAttributeCollectorKt.AnonymousClass3.invoke$lambda$3$lambda$2(h37Var);
                        }
                    };
                    jt1Var.C(objF2);
                }
                jt1Var.B();
                xq3Var.a(z4, (mh4) objF2, null, null, false, b72Var, jA, 8.0f, gr1.b(-1185294213, new AnonymousClass4(this.$attributeData, this.$value$delegate, this.$onSubmitAttribute, this.$expanded$delegate), jt1Var), jt1Var, 100663344, 6 | ((i2 << 3) & 112));
            }
        }

        /* JADX INFO: renamed from: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$ListAttributeCollector$3$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class AnonymousClass4 implements ei4<bj1, jt1, Integer, g2b> {
            final /* synthetic */ AttributeData $attributeData;
            final /* synthetic */ h37<Boolean> $expanded$delegate;
            final /* synthetic */ oh4<AttributeData, g2b> $onSubmitAttribute;
            final /* synthetic */ h37<String> $value$delegate;

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass4(AttributeData attributeData, h37<String> h37Var, oh4<? super AttributeData, g2b> oh4Var, h37<Boolean> h37Var2) {
                this.$attributeData = attributeData;
                this.$value$delegate = h37Var;
                this.$onSubmitAttribute = oh4Var;
                this.$expanded$delegate = h37Var2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final g2b invoke$lambda$2$lambda$1$lambda$0(String str, oh4 oh4Var, AttributeData attributeData, h37 h37Var, h37 h37Var2) {
                ListAttributeCollectorKt.ListAttributeCollector$lambda$8(h37Var, str);
                ListAttributeCollectorKt.ListAttributeCollector$lambda$4(h37Var2, false);
                oh4Var.invoke(AttributeData.copy$default(attributeData, Attribute.copy$default(attributeData.getAttribute(), null, null, null, false, null, null, null, str, 127, null), null, false, 6, null));
                return g2b.a;
            }

            public final void invoke(bj1 bj1Var, jt1 jt1Var, int i) {
                bj1Var.getClass();
                if ((i & 17) == 16 && jt1Var.r()) {
                    jt1Var.u();
                    return;
                }
                List<String> options = this.$attributeData.getAttribute().getOptions();
                if (options == null) {
                    return;
                }
                final h37<String> h37Var = this.$value$delegate;
                final oh4<AttributeData, g2b> oh4Var = this.$onSubmitAttribute;
                final AttributeData attributeData = this.$attributeData;
                final h37<Boolean> h37Var2 = this.$expanded$delegate;
                for (final String str : options) {
                    fr1 fr1VarB = gr1.b(1941734396, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$ListAttributeCollector$3$4$1$1
                        public final void invoke(jt1 jt1Var2, int i2) {
                            if ((i2 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, jt1Var);
                    jt1Var.K(-1795404214);
                    boolean zJ = jt1Var.J(h37Var) | jt1Var.J(str) | jt1Var.J(oh4Var) | jt1Var.j(attributeData);
                    Object objF = jt1Var.f();
                    if (zJ || objF == jt1.a.a) {
                        Object obj = new mh4() { // from class: io.intercom.android.sdk.views.compose.e
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ListAttributeCollectorKt.AnonymousClass3.AnonymousClass4.invoke$lambda$2$lambda$1$lambda$0(str, oh4Var, attributeData, h37Var, h37Var2);
                            }
                        };
                        jt1Var.C(obj);
                        objF = obj;
                    }
                    jt1Var.B();
                    kp.b(fr1VarB, (mh4) objF, null, false, null, null, jt1Var, 6);
                    h37Var = h37Var;
                    oh4Var = oh4Var;
                    attributeData = attributeData;
                    h37Var2 = h37Var2;
                }
            }

            @Override // defpackage.ei4
            public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var, Integer num) {
                invoke(bj1Var, jt1Var, num.intValue());
                return g2b.a;
            }
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(xq3 xq3Var, jt1 jt1Var, Integer num) {
            invoke(xq3Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
