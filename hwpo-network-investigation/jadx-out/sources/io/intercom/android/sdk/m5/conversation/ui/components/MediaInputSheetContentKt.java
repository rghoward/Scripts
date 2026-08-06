package io.intercom.android.sdk.m5.conversation.ui.components;

import android.net.Uri;
import defpackage.aj1;
import defpackage.ao6;
import defpackage.aq1;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bq1;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cx8;
import defpackage.di;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.hf3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.l05;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ni5;
import defpackage.ny8;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.un6;
import defpackage.up1;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.xn6;
import defpackage.yi1;
import defpackage.zn6;
import defpackage.zw8;
import io.intercom.android.sdk.m5.conversation.states.InputTypeState;
import io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputType;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.preview.ui.MediaPickerButtonCTAStyle;
import io.intercom.android.sdk.m5.preview.ui.MediaPickerButtonKt;
import io.intercom.android.sdk.m5.preview.ui.MediaType;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MediaInputSheetContentKt {
    /* JADX WARN: Code duplicated, block: B:101:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:102:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:109:0x0207  */
    /* JADX WARN: Code duplicated, block: B:110:0x020a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0212 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0214  */
    /* JADX WARN: Code duplicated, block: B:117:0x0253  */
    /* JADX WARN: Code duplicated, block: B:118:0x0255  */
    /* JADX WARN: Code duplicated, block: B:121:0x025e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0263  */
    /* JADX WARN: Code duplicated, block: B:127:0x027c  */
    /* JADX WARN: Code duplicated, block: B:128:0x027e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0285 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0287  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:142:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:145:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:147:0x0300  */
    /* JADX WARN: Code duplicated, block: B:148:0x0302  */
    /* JADX WARN: Code duplicated, block: B:151:0x0309 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x030b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0328  */
    /* JADX WARN: Code duplicated, block: B:156:0x032a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0331 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x0333  */
    /* JADX WARN: Code duplicated, block: B:162:0x0357  */
    /* JADX WARN: Code duplicated, block: B:166:0x036b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0379  */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00de  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x0117  */
    /* JADX WARN: Code duplicated, block: B:73:0x0135  */
    /* JADX WARN: Code duplicated, block: B:74:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:0x013e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x0140  */
    /* JADX WARN: Code duplicated, block: B:81:0x0159  */
    /* JADX WARN: Code duplicated, block: B:82:0x015b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0162 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x0164  */
    /* JADX WARN: Code duplicated, block: B:88:0x0197  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x01c7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v1, types: [bj4, jt1] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2, types: [bj4] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [bj4] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r16v1, types: [jt1] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static final void MediaInputSheetContent(ox6 ox6Var, final oh4<? super List<? extends Uri>, g2b> oh4Var, final mh4<g2b> mh4Var, final oh4<? super String, g2b> oh4Var2, final InputTypeState inputTypeState, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        InputTypeState inputTypeState2;
        ox6 ox6Var3;
        int i4;
        aj1 aj1VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar;
        boolean mediaInputEnabled;
        jt1.a.C0187a c0187a;
        ?? r1;
        ?? r13;
        ?? r0;
        jt1.a.C0187a c0187a2;
        char c;
        ?? r6;
        boolean z;
        ?? r14;
        final ox6 ox6Var4;
        ?? r15;
        Object objF;
        ?? r16;
        Object objF2;
        int i5;
        ?? r17;
        Object objF3;
        int i6;
        ?? r18;
        Object objF4;
        int i7;
        ?? r19;
        Object objF5;
        boolean z2;
        Object objF6;
        int i8;
        int i9;
        Object objF7;
        int i10;
        Object objF8;
        boolean z3;
        Object objF9;
        boolean z4;
        Object objF10;
        ?? r110;
        xj8 xj8VarW;
        oh4Var.getClass();
        mh4Var.getClass();
        oh4Var2.getClass();
        inputTypeState.getClass();
        bj4 bj4VarO = jt1Var.o(-842940445);
        int i11 = i2 & 1;
        if (i11 != 0) {
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
            i3 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bj4VarO.j(oh4Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i2 & 16) == 0) {
            if ((i & 24576) == 0) {
                inputTypeState2 = inputTypeState;
                i3 |= bj4VarO.j(inputTypeState2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !bj4VarO.r()) {
                if (i11 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                i4 = 0;
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var3);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(-1878688057);
                bj4VarO.K(-1878689416);
                mediaInputEnabled = inputTypeState2.getMediaInputEnabled();
                c0187a = jt1.a.a;
                if (mediaInputEnabled) {
                    int availableMediaItems = inputTypeState2.getAvailableMediaItems();
                    MediaType mediaType = MediaType.ImageAndVideo;
                    Set<String> trustedFileExtensions = inputTypeState2.getTrustedFileExtensions();
                    MediaPickerButtonCTAStyle.TopBarButton topBarButton = MediaPickerButtonCTAStyle.TopBarButton.INSTANCE;
                    cx8 cx8VarA = zw8.a(6);
                    bj4VarO.K(2017634557);
                    if ((i3 & 112) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objF9 = bj4VarO.f();
                    if (z3 || objF9 == c0187a) {
                        objF9 = new xn6(oh4Var, i4);
                        bj4VarO.C(objF9);
                    }
                    oh4 oh4Var3 = (oh4) objF9;
                    bj4VarO.U(false);
                    bj4VarO.K(2017642552);
                    if ((i3 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objF10 = bj4VarO.f();
                    if (z4 || objF10 == c0187a) {
                        objF10 = new zn6(i4, oh4Var2);
                        bj4VarO.C(objF10);
                    }
                    bj4VarO.U(false);
                    r1 = 0;
                    MediaPickerButtonKt.MediaPickerButton(availableMediaItems, cx8VarA, mediaType, trustedFileExtensions, oh4Var3, topBarButton, false, (mh4) objF10, ComposableSingletons$MediaInputSheetContentKt.INSTANCE.m127getLambda1$intercom_sdk_base_release(), bj4VarO, 102433200, 0);
                    r13 = bj4VarO;
                } else {
                    r1 = 0;
                    r13 = bj4VarO;
                }
                r13.U(r1);
                r13.K(-1878658692);
                if (inputTypeState.getCameraInputEnabled()) {
                    CameraInputType cameraInputType = CameraInputType.PHOTO;
                    r13.K(2017660972);
                    i5 = i3 & 112;
                    if (i5 == 32) {
                        r17 = 1;
                    } else {
                        r17 = r1;
                    }
                    objF3 = r13.f();
                    if (r17 == 0 || objF3 == c0187a) {
                        objF3 = new ao6(r1, oh4Var);
                        r13.C(objF3);
                    }
                    oh4 oh4Var4 = (oh4) objF3;
                    r13.U(r1);
                    r13.K(2017665145);
                    i6 = i3 & 7168;
                    if (i6 == 2048) {
                        r18 = 1;
                    } else {
                        r18 = r1;
                    }
                    objF4 = r13.f();
                    if (r18 == 0 || objF4 == c0187a) {
                        objF4 = new aq1(2, oh4Var2);
                        r13.C(objF4);
                    }
                    mh4 mh4Var2 = (mh4) objF4;
                    r13.U(r1);
                    r13.K(2017669683);
                    i7 = i3 & 896;
                    if (i7 == 256) {
                        r19 = 1;
                    } else {
                        r19 = r1;
                    }
                    objF5 = r13.f();
                    if (r19 == 0 || objF5 == c0187a) {
                        objF5 = new bq1(3, mh4Var);
                        r13.C(objF5);
                    }
                    r13.U(r1);
                    ComposableSingletons$MediaInputSheetContentKt composableSingletons$MediaInputSheetContentKt = ComposableSingletons$MediaInputSheetContentKt.INSTANCE;
                    c = ' ';
                    CameraInputButtonKt.CameraInputButton(null, cameraInputType, oh4Var4, mh4Var2, (mh4) objF5, composableSingletons$MediaInputSheetContentKt.m128getLambda2$intercom_sdk_base_release(), r13, 196656, 1);
                    CameraInputType cameraInputType2 = CameraInputType.VIDEO;
                    r13.K(2017683980);
                    if (i5 == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF6 = r13.f();
                    if (!z2 || objF6 == c0187a) {
                        i8 = 1;
                        objF6 = new l05(i8, oh4Var);
                        r13.C(objF6);
                    } else {
                        i8 = 1;
                    }
                    oh4 oh4Var5 = (oh4) objF6;
                    r13.U(false);
                    r13.K(2017688153);
                    if (i6 == 2048) {
                        i9 = i8;
                    } else {
                        i9 = 0;
                    }
                    objF7 = r13.f();
                    if (i9 == 0 || objF7 == c0187a) {
                        objF7 = new mh4() { // from class: bo6
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$13$lambda$12(oh4Var2);
                            }
                        };
                        r13.C(objF7);
                    }
                    mh4 mh4Var3 = (mh4) objF7;
                    r13.U(false);
                    r13.K(2017692691);
                    if (i7 == 256) {
                        i10 = i8;
                    } else {
                        i10 = 0;
                    }
                    objF8 = r13.f();
                    if (i10 == 0 || objF8 == c0187a) {
                        objF8 = new ni5(i8, mh4Var);
                        r13.C(objF8);
                    }
                    mh4 mh4Var4 = (mh4) objF8;
                    r0 = 0;
                    r13.U(false);
                    r6 = i8;
                    c0187a2 = c0187a;
                    CameraInputButtonKt.CameraInputButton(null, cameraInputType2, oh4Var5, mh4Var3, mh4Var4, composableSingletons$MediaInputSheetContentKt.m129getLambda3$intercom_sdk_base_release(), r13, 196656, 1);
                } else {
                    r0 = r1;
                    c0187a2 = c0187a;
                    c = ' ';
                    r6 = 1;
                }
                r13.U(r0);
                r13.K(-1878611528);
                if (inputTypeState.getFileInputEnabled()) {
                    int availableMediaItems2 = inputTypeState.getAvailableMediaItems();
                    MediaType mediaType2 = MediaType.DocumentOnly;
                    Set<String> trustedFileExtensions2 = inputTypeState.getTrustedFileExtensions();
                    MediaPickerButtonCTAStyle.TopBarButton topBarButton2 = MediaPickerButtonCTAStyle.TopBarButton.INSTANCE;
                    cx8 cx8VarA2 = zw8.a(6);
                    r13.K(2017712381);
                    if ((i3 & 112) == c) {
                        r15 = r6;
                    } else {
                        r15 = 0;
                    }
                    objF = r13.f();
                    if (r15 == 0 || objF == c0187a2) {
                        objF = new oh4() { // from class: vn6
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$17$lambda$16(oh4Var, (List) obj);
                            }
                        };
                        r13.C(objF);
                    }
                    oh4 oh4Var6 = (oh4) objF;
                    r13.U(false);
                    r13.K(2017720375);
                    if ((i3 & 7168) == 2048) {
                        r16 = r6;
                    } else {
                        r16 = 0;
                    }
                    objF2 = r13.f();
                    if (r16 == 0 || objF2 == c0187a2) {
                        objF2 = new up1(2, oh4Var2);
                        r13.C(objF2);
                    }
                    mh4 mh4Var5 = (mh4) objF2;
                    z = false;
                    r13.U(false);
                    ?? r111 = r13;
                    MediaPickerButtonKt.MediaPickerButton(availableMediaItems2, cx8VarA2, mediaType2, trustedFileExtensions2, oh4Var6, topBarButton2, false, mh4Var5, ComposableSingletons$MediaInputSheetContentKt.INSTANCE.m130getLambda4$intercom_sdk_base_release(), r111, 102433200, 0);
                    r14 = r111;
                } else {
                    z = false;
                    r14 = r13;
                }
                r14.U(z);
                g2b g2bVar = g2b.a;
                r14.U(z);
                r14.U(r6);
                ox6Var4 = ox6Var3;
                r110 = r14;
            } else {
                bj4VarO.u();
                ox6Var4 = ox6Var2;
                r110 = bj4VarO;
            }
            xj8VarW = r110.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: yn6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return MediaInputSheetContentKt.MediaInputSheetContent$lambda$22(ox6Var4, oh4Var, mh4Var, oh4Var2, inputTypeState, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        inputTypeState2 = inputTypeState;
        if ((i3 & 9363) == 9362) {
            if (i11 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            i4 = 0;
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var3);
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
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(-1878688057);
            bj4VarO.K(-1878689416);
            mediaInputEnabled = inputTypeState2.getMediaInputEnabled();
            c0187a = jt1.a.a;
            if (mediaInputEnabled) {
                int availableMediaItems3 = inputTypeState2.getAvailableMediaItems();
                MediaType mediaType3 = MediaType.ImageAndVideo;
                Set<String> trustedFileExtensions3 = inputTypeState2.getTrustedFileExtensions();
                MediaPickerButtonCTAStyle.TopBarButton topBarButton3 = MediaPickerButtonCTAStyle.TopBarButton.INSTANCE;
                cx8 cx8VarA3 = zw8.a(6);
                bj4VarO.K(2017634557);
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objF9 = bj4VarO.f();
                if (z3) {
                    objF9 = new xn6(oh4Var, i4);
                    bj4VarO.C(objF9);
                } else {
                    objF9 = new xn6(oh4Var, i4);
                    bj4VarO.C(objF9);
                }
                oh4 oh4Var7 = (oh4) objF9;
                bj4VarO.U(false);
                bj4VarO.K(2017642552);
                if ((i3 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objF10 = bj4VarO.f();
                if (z4) {
                    objF10 = new zn6(i4, oh4Var2);
                    bj4VarO.C(objF10);
                } else {
                    objF10 = new zn6(i4, oh4Var2);
                    bj4VarO.C(objF10);
                }
                bj4VarO.U(false);
                r1 = 0;
                MediaPickerButtonKt.MediaPickerButton(availableMediaItems3, cx8VarA3, mediaType3, trustedFileExtensions3, oh4Var7, topBarButton3, false, (mh4) objF10, ComposableSingletons$MediaInputSheetContentKt.INSTANCE.m127getLambda1$intercom_sdk_base_release(), bj4VarO, 102433200, 0);
                r13 = bj4VarO;
            } else {
                r1 = 0;
                r13 = bj4VarO;
            }
            r13.U(r1);
            r13.K(-1878658692);
            if (inputTypeState.getCameraInputEnabled()) {
                CameraInputType cameraInputType3 = CameraInputType.PHOTO;
                r13.K(2017660972);
                i5 = i3 & 112;
                if (i5 == 32) {
                    r17 = 1;
                } else {
                    r17 = r1;
                }
                objF3 = r13.f();
                if (r17 == 0) {
                    objF3 = new ao6(r1, oh4Var);
                    r13.C(objF3);
                } else {
                    objF3 = new ao6(r1, oh4Var);
                    r13.C(objF3);
                }
                oh4 oh4Var8 = (oh4) objF3;
                r13.U(r1);
                r13.K(2017665145);
                i6 = i3 & 7168;
                if (i6 == 2048) {
                    r18 = 1;
                } else {
                    r18 = r1;
                }
                objF4 = r13.f();
                if (r18 == 0) {
                    objF4 = new aq1(2, oh4Var2);
                    r13.C(objF4);
                } else {
                    objF4 = new aq1(2, oh4Var2);
                    r13.C(objF4);
                }
                mh4 mh4Var6 = (mh4) objF4;
                r13.U(r1);
                r13.K(2017669683);
                i7 = i3 & 896;
                if (i7 == 256) {
                    r19 = 1;
                } else {
                    r19 = r1;
                }
                objF5 = r13.f();
                if (r19 == 0) {
                    objF5 = new bq1(3, mh4Var);
                    r13.C(objF5);
                } else {
                    objF5 = new bq1(3, mh4Var);
                    r13.C(objF5);
                }
                r13.U(r1);
                ComposableSingletons$MediaInputSheetContentKt composableSingletons$MediaInputSheetContentKt2 = ComposableSingletons$MediaInputSheetContentKt.INSTANCE;
                c = ' ';
                CameraInputButtonKt.CameraInputButton(null, cameraInputType3, oh4Var8, mh4Var6, (mh4) objF5, composableSingletons$MediaInputSheetContentKt2.m128getLambda2$intercom_sdk_base_release(), r13, 196656, 1);
                CameraInputType cameraInputType4 = CameraInputType.VIDEO;
                r13.K(2017683980);
                if (i5 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objF6 = r13.f();
                if (z2) {
                    i8 = 1;
                    objF6 = new l05(i8, oh4Var);
                    r13.C(objF6);
                } else {
                    i8 = 1;
                    objF6 = new l05(i8, oh4Var);
                    r13.C(objF6);
                }
                oh4 oh4Var9 = (oh4) objF6;
                r13.U(false);
                r13.K(2017688153);
                if (i6 == 2048) {
                    i9 = i8;
                } else {
                    i9 = 0;
                }
                objF7 = r13.f();
                if (i9 == 0) {
                    objF7 = new mh4() { // from class: bo6
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$13$lambda$12(oh4Var2);
                        }
                    };
                    r13.C(objF7);
                } else {
                    objF7 = new mh4() { // from class: bo6
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$13$lambda$12(oh4Var2);
                        }
                    };
                    r13.C(objF7);
                }
                mh4 mh4Var7 = (mh4) objF7;
                r13.U(false);
                r13.K(2017692691);
                if (i7 == 256) {
                    i10 = i8;
                } else {
                    i10 = 0;
                }
                objF8 = r13.f();
                if (i10 == 0) {
                    objF8 = new ni5(i8, mh4Var);
                    r13.C(objF8);
                } else {
                    objF8 = new ni5(i8, mh4Var);
                    r13.C(objF8);
                }
                mh4 mh4Var8 = (mh4) objF8;
                r0 = 0;
                r13.U(false);
                r6 = i8;
                c0187a2 = c0187a;
                CameraInputButtonKt.CameraInputButton(null, cameraInputType4, oh4Var9, mh4Var7, mh4Var8, composableSingletons$MediaInputSheetContentKt2.m129getLambda3$intercom_sdk_base_release(), r13, 196656, 1);
            } else {
                r0 = r1;
                c0187a2 = c0187a;
                c = ' ';
                r6 = 1;
            }
            r13.U(r0);
            r13.K(-1878611528);
            if (inputTypeState.getFileInputEnabled()) {
                int availableMediaItems4 = inputTypeState.getAvailableMediaItems();
                MediaType mediaType4 = MediaType.DocumentOnly;
                Set<String> trustedFileExtensions4 = inputTypeState.getTrustedFileExtensions();
                MediaPickerButtonCTAStyle.TopBarButton topBarButton4 = MediaPickerButtonCTAStyle.TopBarButton.INSTANCE;
                cx8 cx8VarA4 = zw8.a(6);
                r13.K(2017712381);
                if ((i3 & 112) == c) {
                    r15 = r6;
                } else {
                    r15 = 0;
                }
                objF = r13.f();
                if (r15 == 0) {
                    objF = new oh4() { // from class: vn6
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$17$lambda$16(oh4Var, (List) obj);
                        }
                    };
                    r13.C(objF);
                } else {
                    objF = new oh4() { // from class: vn6
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$17$lambda$16(oh4Var, (List) obj);
                        }
                    };
                    r13.C(objF);
                }
                oh4 oh4Var10 = (oh4) objF;
                r13.U(false);
                r13.K(2017720375);
                if ((i3 & 7168) == 2048) {
                    r16 = r6;
                } else {
                    r16 = 0;
                }
                objF2 = r13.f();
                if (r16 == 0) {
                    objF2 = new up1(2, oh4Var2);
                    r13.C(objF2);
                } else {
                    objF2 = new up1(2, oh4Var2);
                    r13.C(objF2);
                }
                mh4 mh4Var9 = (mh4) objF2;
                z = false;
                r13.U(false);
                ?? r112 = r13;
                MediaPickerButtonKt.MediaPickerButton(availableMediaItems4, cx8VarA4, mediaType4, trustedFileExtensions4, oh4Var10, topBarButton4, false, mh4Var9, ComposableSingletons$MediaInputSheetContentKt.INSTANCE.m130getLambda4$intercom_sdk_base_release(), r112, 102433200, 0);
                r14 = r112;
            } else {
                z = false;
                r14 = r13;
            }
            r14.U(z);
            g2b g2bVar2 = g2b.a;
            r14.U(z);
            r14.U(r6);
            ox6Var4 = ox6Var3;
            r110 = r14;
        } else {
            if (i11 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            i4 = 0;
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var3);
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
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(-1878688057);
            bj4VarO.K(-1878689416);
            mediaInputEnabled = inputTypeState2.getMediaInputEnabled();
            c0187a = jt1.a.a;
            if (mediaInputEnabled) {
                int availableMediaItems5 = inputTypeState2.getAvailableMediaItems();
                MediaType mediaType5 = MediaType.ImageAndVideo;
                Set<String> trustedFileExtensions5 = inputTypeState2.getTrustedFileExtensions();
                MediaPickerButtonCTAStyle.TopBarButton topBarButton5 = MediaPickerButtonCTAStyle.TopBarButton.INSTANCE;
                cx8 cx8VarA5 = zw8.a(6);
                bj4VarO.K(2017634557);
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objF9 = bj4VarO.f();
                if (z3) {
                    objF9 = new xn6(oh4Var, i4);
                    bj4VarO.C(objF9);
                } else {
                    objF9 = new xn6(oh4Var, i4);
                    bj4VarO.C(objF9);
                }
                oh4 oh4Var11 = (oh4) objF9;
                bj4VarO.U(false);
                bj4VarO.K(2017642552);
                if ((i3 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objF10 = bj4VarO.f();
                if (z4) {
                    objF10 = new zn6(i4, oh4Var2);
                    bj4VarO.C(objF10);
                } else {
                    objF10 = new zn6(i4, oh4Var2);
                    bj4VarO.C(objF10);
                }
                bj4VarO.U(false);
                r1 = 0;
                MediaPickerButtonKt.MediaPickerButton(availableMediaItems5, cx8VarA5, mediaType5, trustedFileExtensions5, oh4Var11, topBarButton5, false, (mh4) objF10, ComposableSingletons$MediaInputSheetContentKt.INSTANCE.m127getLambda1$intercom_sdk_base_release(), bj4VarO, 102433200, 0);
                r13 = bj4VarO;
            } else {
                r1 = 0;
                r13 = bj4VarO;
            }
            r13.U(r1);
            r13.K(-1878658692);
            if (inputTypeState.getCameraInputEnabled()) {
                CameraInputType cameraInputType5 = CameraInputType.PHOTO;
                r13.K(2017660972);
                i5 = i3 & 112;
                if (i5 == 32) {
                    r17 = 1;
                } else {
                    r17 = r1;
                }
                objF3 = r13.f();
                if (r17 == 0) {
                    objF3 = new ao6(r1, oh4Var);
                    r13.C(objF3);
                } else {
                    objF3 = new ao6(r1, oh4Var);
                    r13.C(objF3);
                }
                oh4 oh4Var12 = (oh4) objF3;
                r13.U(r1);
                r13.K(2017665145);
                i6 = i3 & 7168;
                if (i6 == 2048) {
                    r18 = 1;
                } else {
                    r18 = r1;
                }
                objF4 = r13.f();
                if (r18 == 0) {
                    objF4 = new aq1(2, oh4Var2);
                    r13.C(objF4);
                } else {
                    objF4 = new aq1(2, oh4Var2);
                    r13.C(objF4);
                }
                mh4 mh4Var10 = (mh4) objF4;
                r13.U(r1);
                r13.K(2017669683);
                i7 = i3 & 896;
                if (i7 == 256) {
                    r19 = 1;
                } else {
                    r19 = r1;
                }
                objF5 = r13.f();
                if (r19 == 0) {
                    objF5 = new bq1(3, mh4Var);
                    r13.C(objF5);
                } else {
                    objF5 = new bq1(3, mh4Var);
                    r13.C(objF5);
                }
                r13.U(r1);
                ComposableSingletons$MediaInputSheetContentKt composableSingletons$MediaInputSheetContentKt3 = ComposableSingletons$MediaInputSheetContentKt.INSTANCE;
                c = ' ';
                CameraInputButtonKt.CameraInputButton(null, cameraInputType5, oh4Var12, mh4Var10, (mh4) objF5, composableSingletons$MediaInputSheetContentKt3.m128getLambda2$intercom_sdk_base_release(), r13, 196656, 1);
                CameraInputType cameraInputType6 = CameraInputType.VIDEO;
                r13.K(2017683980);
                if (i5 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objF6 = r13.f();
                if (z2) {
                    i8 = 1;
                    objF6 = new l05(i8, oh4Var);
                    r13.C(objF6);
                } else {
                    i8 = 1;
                    objF6 = new l05(i8, oh4Var);
                    r13.C(objF6);
                }
                oh4 oh4Var13 = (oh4) objF6;
                r13.U(false);
                r13.K(2017688153);
                if (i6 == 2048) {
                    i9 = i8;
                } else {
                    i9 = 0;
                }
                objF7 = r13.f();
                if (i9 == 0) {
                    objF7 = new mh4() { // from class: bo6
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$13$lambda$12(oh4Var2);
                        }
                    };
                    r13.C(objF7);
                } else {
                    objF7 = new mh4() { // from class: bo6
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$13$lambda$12(oh4Var2);
                        }
                    };
                    r13.C(objF7);
                }
                mh4 mh4Var11 = (mh4) objF7;
                r13.U(false);
                r13.K(2017692691);
                if (i7 == 256) {
                    i10 = i8;
                } else {
                    i10 = 0;
                }
                objF8 = r13.f();
                if (i10 == 0) {
                    objF8 = new ni5(i8, mh4Var);
                    r13.C(objF8);
                } else {
                    objF8 = new ni5(i8, mh4Var);
                    r13.C(objF8);
                }
                mh4 mh4Var12 = (mh4) objF8;
                r0 = 0;
                r13.U(false);
                r6 = i8;
                c0187a2 = c0187a;
                CameraInputButtonKt.CameraInputButton(null, cameraInputType6, oh4Var13, mh4Var11, mh4Var12, composableSingletons$MediaInputSheetContentKt3.m129getLambda3$intercom_sdk_base_release(), r13, 196656, 1);
            } else {
                r0 = r1;
                c0187a2 = c0187a;
                c = ' ';
                r6 = 1;
            }
            r13.U(r0);
            r13.K(-1878611528);
            if (inputTypeState.getFileInputEnabled()) {
                int availableMediaItems6 = inputTypeState.getAvailableMediaItems();
                MediaType mediaType6 = MediaType.DocumentOnly;
                Set<String> trustedFileExtensions6 = inputTypeState.getTrustedFileExtensions();
                MediaPickerButtonCTAStyle.TopBarButton topBarButton6 = MediaPickerButtonCTAStyle.TopBarButton.INSTANCE;
                cx8 cx8VarA6 = zw8.a(6);
                r13.K(2017712381);
                if ((i3 & 112) == c) {
                    r15 = r6;
                } else {
                    r15 = 0;
                }
                objF = r13.f();
                if (r15 == 0) {
                    objF = new oh4() { // from class: vn6
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$17$lambda$16(oh4Var, (List) obj);
                        }
                    };
                    r13.C(objF);
                } else {
                    objF = new oh4() { // from class: vn6
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$17$lambda$16(oh4Var, (List) obj);
                        }
                    };
                    r13.C(objF);
                }
                oh4 oh4Var14 = (oh4) objF;
                r13.U(false);
                r13.K(2017720375);
                if ((i3 & 7168) == 2048) {
                    r16 = r6;
                } else {
                    r16 = 0;
                }
                objF2 = r13.f();
                if (r16 == 0) {
                    objF2 = new up1(2, oh4Var2);
                    r13.C(objF2);
                } else {
                    objF2 = new up1(2, oh4Var2);
                    r13.C(objF2);
                }
                mh4 mh4Var13 = (mh4) objF2;
                z = false;
                r13.U(false);
                ?? r113 = r13;
                MediaPickerButtonKt.MediaPickerButton(availableMediaItems6, cx8VarA6, mediaType6, trustedFileExtensions6, oh4Var14, topBarButton6, false, mh4Var13, ComposableSingletons$MediaInputSheetContentKt.INSTANCE.m130getLambda4$intercom_sdk_base_release(), r113, 102433200, 0);
                r14 = r113;
            } else {
                z = false;
                r14 = r13;
            }
            r14.U(z);
            g2b g2bVar3 = g2b.a;
            r14.U(z);
            r14.U(r6);
            ox6Var4 = ox6Var3;
            r110 = r14;
        }
        xj8VarW = r110.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: yn6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MediaInputSheetContentKt.MediaInputSheetContent$lambda$22(ox6Var4, oh4Var, mh4Var, oh4Var2, inputTypeState, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaInputSheetContent$lambda$21$lambda$20$lambda$1$lambda$0(oh4 oh4Var, List list) {
        list.getClass();
        oh4Var.invoke(list);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaInputSheetContent$lambda$21$lambda$20$lambda$11$lambda$10(oh4 oh4Var, Uri uri) {
        oh4Var.invoke(uri != null ? ws0.h(uri) : hf3.t);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaInputSheetContent$lambda$21$lambda$20$lambda$13$lambda$12(oh4 oh4Var) {
        oh4Var.invoke(MetricTracker.Object.CAMERA_INPUT);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaInputSheetContent$lambda$21$lambda$20$lambda$15$lambda$14(mh4 mh4Var) {
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaInputSheetContent$lambda$21$lambda$20$lambda$17$lambda$16(oh4 oh4Var, List list) {
        list.getClass();
        oh4Var.invoke(list);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaInputSheetContent$lambda$21$lambda$20$lambda$19$lambda$18(oh4 oh4Var) {
        oh4Var.invoke(MetricTracker.Object.FILE_INPUT);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaInputSheetContent$lambda$21$lambda$20$lambda$3$lambda$2(oh4 oh4Var) {
        oh4Var.invoke(MetricTracker.Object.IMAGE_INPUT);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaInputSheetContent$lambda$21$lambda$20$lambda$5$lambda$4(oh4 oh4Var, Uri uri) {
        oh4Var.invoke(uri != null ? ws0.h(uri) : hf3.t);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaInputSheetContent$lambda$21$lambda$20$lambda$7$lambda$6(oh4 oh4Var) {
        oh4Var.invoke(MetricTracker.Object.CAMERA_INPUT);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaInputSheetContent$lambda$21$lambda$20$lambda$9$lambda$8(mh4 mh4Var) {
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaInputSheetContent$lambda$22(ox6 ox6Var, oh4 oh4Var, mh4 mh4Var, oh4 oh4Var2, InputTypeState inputTypeState, int i, int i2, jt1 jt1Var, int i3) {
        MediaInputSheetContent(ox6Var, oh4Var, mh4Var, oh4Var2, inputTypeState, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaInputSheetContentItem(final String str, final int i, jt1 jt1Var, final int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(-181831684);
        if ((i2 & 6) == 0) {
            i3 = i2 | (bj4VarO.J(str) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.h(i) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarI = eo7.i(ir9.c(ir9.d(aVar, 56.0f), 1.0f), 16.0f);
            ny8 ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarI);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            m65.b(is7.a(i, bj4VarO, (i3 >> 3) & 14), null, ir9.j(aVar, 24.0f), 0L, bj4VarO, 440, 8);
            b47.b(bj4VarO, ir9.n(aVar, 8.0f));
            mia.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, i3 & 14, 0, 262142);
            bj4VarO = bj4VarO;
            bj4VarO.U(true);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: wn6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MediaInputSheetContentKt.MediaInputSheetContentItem$lambda$24(str, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaInputSheetContentItem$lambda$24(String str, int i, int i2, jt1 jt1Var, int i3) {
        MediaInputSheetContentItem(str, i, jt1Var, gz3.s(i2 | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void MediaInputSheetContentPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-375557009);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MediaInputSheetContentKt.INSTANCE.m132getLambda6$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new un6(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaInputSheetContentPreview$lambda$25(int i, jt1 jt1Var, int i2) {
        MediaInputSheetContentPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
