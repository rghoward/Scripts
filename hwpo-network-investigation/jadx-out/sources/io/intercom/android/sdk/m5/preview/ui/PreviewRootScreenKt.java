package io.intercom.android.sdk.m5.preview.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import defpackage.aa0;
import defpackage.aj1;
import defpackage.au3;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.c30;
import defpackage.c33;
import defpackage.ci4;
import defpackage.di;
import defpackage.dr7;
import defpackage.eh6;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fi4;
import defpackage.g2b;
import defpackage.go7;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.hf8;
import defpackage.hq7;
import defpackage.hr7;
import defpackage.ia;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.lb2;
import defpackage.ll8;
import defpackage.m78;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.mm8;
import defpackage.mn1;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.oy0;
import defpackage.ph1;
import defpackage.q39;
import defpackage.qhb;
import defpackage.qq7;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.qu1;
import defpackage.rd7;
import defpackage.t42;
import defpackage.t72;
import defpackage.t88;
import defpackage.t9;
import defpackage.thb;
import defpackage.tq5;
import defpackage.uh1;
import defpackage.vs2;
import defpackage.vz1;
import defpackage.w47;
import defpackage.wd3;
import defpackage.whb;
import defpackage.wt4;
import defpackage.xc6;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.yn5;
import defpackage.z2a;
import defpackage.z74;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.m5.preview.model.PreviewUiState;
import io.intercom.android.sdk.m5.preview.ui.PreviewRootScreenKt;
import io.intercom.android.sdk.m5.preview.viewmodel.PreviewViewModel;
import io.intercom.android.sdk.ui.IntercomPreviews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PreviewRootScreenKt {
    /* JADX WARN: Code duplicated, block: B:100:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:101:0x0170  */
    /* JADX WARN: Code duplicated, block: B:104:0x018d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x018f  */
    /* JADX WARN: Code duplicated, block: B:109:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x0129  */
    /* JADX WARN: Code duplicated, block: B:97:0x012f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void PreviewRootScreen(ox6 ox6Var, final IntercomPreviewArgs intercomPreviewArgs, PreviewViewModel previewViewModel, final oh4<? super List<? extends Uri>, g2b> oh4Var, final oh4<? super IntercomPreviewFile, g2b> oh4Var2, final oh4<? super List<? extends Uri>, g2b> oh4Var3, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        final PreviewViewModel previewViewModel2;
        oh4<? super List<? extends Uri>, g2b> oh4Var4;
        oh4<? super IntercomPreviewFile, g2b> oh4Var5;
        int i4;
        oh4<? super List<? extends Uri>, g2b> oh4Var6;
        int i5;
        ox6 ox6Var3;
        ox6 ox6Var4;
        String string;
        thb.c cVarFactory$intercom_sdk_base_release;
        whb whbVarA;
        lb2 defaultViewModelCreationExtras;
        final Context context;
        final PreviewUiState previewUiState;
        boolean zJ;
        Object objF;
        boolean zJ2;
        Object objF2;
        final PreviewViewModel previewViewModel3;
        xj8 xj8VarW;
        intercomPreviewArgs.getClass();
        oh4Var.getClass();
        oh4Var2.getClass();
        oh4Var3.getClass();
        bj4 bj4VarO = jt1Var.o(919809320);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
            i3 |= bj4VarO.j(intercomPreviewArgs) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                previewViewModel2 = previewViewModel;
                int i7 = bj4VarO.j(previewViewModel2) ? 256 : 128;
                i3 |= i7;
            } else {
                previewViewModel2 = previewViewModel;
            }
            i3 |= i7;
        } else {
            previewViewModel2 = previewViewModel;
        }
        if ((i2 & 8) == 0) {
            if ((i & 3072) == 0) {
                oh4Var4 = oh4Var;
                i3 |= bj4VarO.j(oh4Var4) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    oh4Var5 = oh4Var2;
                    if (bj4VarO.j(oh4Var5)) {
                        i4 = 16384;
                    } else {
                        i4 = 8192;
                    }
                    i3 |= i4;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                    oh4Var6 = oh4Var3;
                } else {
                    oh4Var6 = oh4Var3;
                    if ((i & 196608) == 0) {
                        if (bj4VarO.j(oh4Var6)) {
                            i5 = 131072;
                        } else {
                            i5 = 65536;
                        }
                        i3 |= i5;
                    }
                }
                if ((74899 & i3) == 74898 || !bj4VarO.r()) {
                    bj4VarO.v0();
                    if ((i & 1) != 0 || bj4VarO.c0()) {
                        if (i6 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if ((i2 & 4) != 0) {
                            string = UUID.randomUUID().toString();
                            cVarFactory$intercom_sdk_base_release = PreviewViewModel.Companion.factory$intercom_sdk_base_release(intercomPreviewArgs);
                            whbVarA = xc6.a(bj4VarO);
                            if (whbVarA == null) {
                                aa0.c("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            if (whbVarA instanceof wt4) {
                                defaultViewModelCreationExtras = ((wt4) whbVarA).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = lb2.a.b;
                            }
                            i3 &= -897;
                            ox6Var4 = ox6Var3;
                            previewViewModel2 = (PreviewViewModel) qhb.a(ll8.a(PreviewViewModel.class), whbVarA, string, cVarFactory$intercom_sdk_base_release, defaultViewModelCreationExtras, bj4VarO);
                        } else {
                            ox6Var4 = ox6Var3;
                        }
                    } else {
                        bj4VarO.u();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        ox6Var4 = ox6Var2;
                    }
                    bj4VarO.V();
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    previewUiState = (PreviewUiState) bl7.c(previewViewModel2.getState$intercom_sdk_base_release(), bj4VarO, 0).getValue();
                    String permissionDeniedText = intercomPreviewArgs.getDownloadState().getPermissionDeniedText();
                    bj4VarO.K(-301502125);
                    zJ = bj4VarO.j(previewViewModel2) | bj4VarO.j(previewUiState) | bj4VarO.j(context);
                    objF = bj4VarO.f();
                    jt1.a.C0187a c0187a = jt1.a.a;
                    if (zJ || objF == c0187a) {
                        objF = new mh4() { // from class: x88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return PreviewRootScreenKt.PreviewRootScreen$lambda$1$lambda$0(previewViewModel2, previewUiState, context);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    mh4 mh4Var = (mh4) objF;
                    bj4VarO.U(false);
                    bj4VarO.K(-301499250);
                    zJ2 = bj4VarO.j(previewViewModel2);
                    objF2 = bj4VarO.f();
                    if (zJ2 || objF2 == c0187a) {
                        objF2 = new PreviewRootScreenKt$PreviewRootScreen$2$1(previewViewModel2);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    PreviewRootScreenContent(ox6Var4, previewUiState, permissionDeniedText, oh4Var4, oh4Var5, oh4Var6, mh4Var, (oh4) ((yn5) objF2), bj4VarO, i3 & 523278, 0);
                    bj4VarO = bj4VarO;
                    ox6Var2 = ox6Var4;
                } else {
                    bj4VarO.u();
                }
                previewViewModel3 = previewViewModel2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: s88
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return PreviewRootScreenKt.PreviewRootScreen$lambda$3(ox6Var2, intercomPreviewArgs, previewViewModel3, oh4Var, oh4Var2, oh4Var3, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            oh4Var5 = oh4Var2;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
                oh4Var6 = oh4Var3;
            } else {
                oh4Var6 = oh4Var3;
                if ((i & 196608) == 0) {
                    if (bj4VarO.j(oh4Var6)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
            }
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        string = UUID.randomUUID().toString();
                        cVarFactory$intercom_sdk_base_release = PreviewViewModel.Companion.factory$intercom_sdk_base_release(intercomPreviewArgs);
                        whbVarA = xc6.a(bj4VarO);
                        if (whbVarA == null) {
                            aa0.c("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (whbVarA instanceof wt4) {
                            defaultViewModelCreationExtras = ((wt4) whbVarA).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = lb2.a.b;
                        }
                        i3 &= -897;
                        ox6Var4 = ox6Var3;
                        previewViewModel2 = (PreviewViewModel) qhb.a(ll8.a(PreviewViewModel.class), whbVarA, string, cVarFactory$intercom_sdk_base_release, defaultViewModelCreationExtras, bj4VarO);
                    } else {
                        ox6Var4 = ox6Var3;
                    }
                } else {
                    if (i6 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        string = UUID.randomUUID().toString();
                        cVarFactory$intercom_sdk_base_release = PreviewViewModel.Companion.factory$intercom_sdk_base_release(intercomPreviewArgs);
                        whbVarA = xc6.a(bj4VarO);
                        if (whbVarA == null) {
                            aa0.c("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (whbVarA instanceof wt4) {
                            defaultViewModelCreationExtras = ((wt4) whbVarA).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = lb2.a.b;
                        }
                        i3 &= -897;
                        ox6Var4 = ox6Var3;
                        previewViewModel2 = (PreviewViewModel) qhb.a(ll8.a(PreviewViewModel.class), whbVarA, string, cVarFactory$intercom_sdk_base_release, defaultViewModelCreationExtras, bj4VarO);
                    } else {
                        ox6Var4 = ox6Var3;
                    }
                }
                bj4VarO.V();
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                previewUiState = (PreviewUiState) bl7.c(previewViewModel2.getState$intercom_sdk_base_release(), bj4VarO, 0).getValue();
                String permissionDeniedText2 = intercomPreviewArgs.getDownloadState().getPermissionDeniedText();
                bj4VarO.K(-301502125);
                zJ = bj4VarO.j(previewViewModel2) | bj4VarO.j(previewUiState) | bj4VarO.j(context);
                objF = bj4VarO.f();
                jt1.a.C0187a c0187a2 = jt1.a.a;
                if (zJ) {
                    objF = new mh4() { // from class: x88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return PreviewRootScreenKt.PreviewRootScreen$lambda$1$lambda$0(previewViewModel2, previewUiState, context);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: x88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return PreviewRootScreenKt.PreviewRootScreen$lambda$1$lambda$0(previewViewModel2, previewUiState, context);
                        }
                    };
                    bj4VarO.C(objF);
                }
                mh4 mh4Var2 = (mh4) objF;
                bj4VarO.U(false);
                bj4VarO.K(-301499250);
                zJ2 = bj4VarO.j(previewViewModel2);
                objF2 = bj4VarO.f();
                if (zJ2) {
                    objF2 = new PreviewRootScreenKt$PreviewRootScreen$2$1(previewViewModel2);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new PreviewRootScreenKt$PreviewRootScreen$2$1(previewViewModel2);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                PreviewRootScreenContent(ox6Var4, previewUiState, permissionDeniedText2, oh4Var4, oh4Var5, oh4Var6, mh4Var2, (oh4) ((yn5) objF2), bj4VarO, i3 & 523278, 0);
                bj4VarO = bj4VarO;
                ox6Var2 = ox6Var4;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        string = UUID.randomUUID().toString();
                        cVarFactory$intercom_sdk_base_release = PreviewViewModel.Companion.factory$intercom_sdk_base_release(intercomPreviewArgs);
                        whbVarA = xc6.a(bj4VarO);
                        if (whbVarA == null) {
                            aa0.c("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (whbVarA instanceof wt4) {
                            defaultViewModelCreationExtras = ((wt4) whbVarA).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = lb2.a.b;
                        }
                        i3 &= -897;
                        ox6Var4 = ox6Var3;
                        previewViewModel2 = (PreviewViewModel) qhb.a(ll8.a(PreviewViewModel.class), whbVarA, string, cVarFactory$intercom_sdk_base_release, defaultViewModelCreationExtras, bj4VarO);
                    } else {
                        ox6Var4 = ox6Var3;
                    }
                } else {
                    if (i6 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        string = UUID.randomUUID().toString();
                        cVarFactory$intercom_sdk_base_release = PreviewViewModel.Companion.factory$intercom_sdk_base_release(intercomPreviewArgs);
                        whbVarA = xc6.a(bj4VarO);
                        if (whbVarA == null) {
                            aa0.c("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (whbVarA instanceof wt4) {
                            defaultViewModelCreationExtras = ((wt4) whbVarA).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = lb2.a.b;
                        }
                        i3 &= -897;
                        ox6Var4 = ox6Var3;
                        previewViewModel2 = (PreviewViewModel) qhb.a(ll8.a(PreviewViewModel.class), whbVarA, string, cVarFactory$intercom_sdk_base_release, defaultViewModelCreationExtras, bj4VarO);
                    } else {
                        ox6Var4 = ox6Var3;
                    }
                }
                bj4VarO.V();
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                previewUiState = (PreviewUiState) bl7.c(previewViewModel2.getState$intercom_sdk_base_release(), bj4VarO, 0).getValue();
                String permissionDeniedText3 = intercomPreviewArgs.getDownloadState().getPermissionDeniedText();
                bj4VarO.K(-301502125);
                zJ = bj4VarO.j(previewViewModel2) | bj4VarO.j(previewUiState) | bj4VarO.j(context);
                objF = bj4VarO.f();
                jt1.a.C0187a c0187a3 = jt1.a.a;
                if (zJ) {
                    objF = new mh4() { // from class: x88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return PreviewRootScreenKt.PreviewRootScreen$lambda$1$lambda$0(previewViewModel2, previewUiState, context);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: x88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return PreviewRootScreenKt.PreviewRootScreen$lambda$1$lambda$0(previewViewModel2, previewUiState, context);
                        }
                    };
                    bj4VarO.C(objF);
                }
                mh4 mh4Var3 = (mh4) objF;
                bj4VarO.U(false);
                bj4VarO.K(-301499250);
                zJ2 = bj4VarO.j(previewViewModel2);
                objF2 = bj4VarO.f();
                if (zJ2) {
                    objF2 = new PreviewRootScreenKt$PreviewRootScreen$2$1(previewViewModel2);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new PreviewRootScreenKt$PreviewRootScreen$2$1(previewViewModel2);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                PreviewRootScreenContent(ox6Var4, previewUiState, permissionDeniedText3, oh4Var4, oh4Var5, oh4Var6, mh4Var3, (oh4) ((yn5) objF2), bj4VarO, i3 & 523278, 0);
                bj4VarO = bj4VarO;
                ox6Var2 = ox6Var4;
            }
            previewViewModel3 = previewViewModel2;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: s88
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PreviewRootScreenKt.PreviewRootScreen$lambda$3(ox6Var2, intercomPreviewArgs, previewViewModel3, oh4Var, oh4Var2, oh4Var3, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        oh4Var4 = oh4Var;
        if ((i2 & 16) != 0) {
            if ((i & 24576) == 0) {
                oh4Var5 = oh4Var2;
                if (bj4VarO.j(oh4Var5)) {
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
                oh4Var6 = oh4Var3;
            } else {
                oh4Var6 = oh4Var3;
                if ((i & 196608) == 0) {
                    if (bj4VarO.j(oh4Var6)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
            }
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        string = UUID.randomUUID().toString();
                        cVarFactory$intercom_sdk_base_release = PreviewViewModel.Companion.factory$intercom_sdk_base_release(intercomPreviewArgs);
                        whbVarA = xc6.a(bj4VarO);
                        if (whbVarA == null) {
                            aa0.c("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (whbVarA instanceof wt4) {
                            defaultViewModelCreationExtras = ((wt4) whbVarA).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = lb2.a.b;
                        }
                        i3 &= -897;
                        ox6Var4 = ox6Var3;
                        previewViewModel2 = (PreviewViewModel) qhb.a(ll8.a(PreviewViewModel.class), whbVarA, string, cVarFactory$intercom_sdk_base_release, defaultViewModelCreationExtras, bj4VarO);
                    } else {
                        ox6Var4 = ox6Var3;
                    }
                } else {
                    if (i6 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        string = UUID.randomUUID().toString();
                        cVarFactory$intercom_sdk_base_release = PreviewViewModel.Companion.factory$intercom_sdk_base_release(intercomPreviewArgs);
                        whbVarA = xc6.a(bj4VarO);
                        if (whbVarA == null) {
                            aa0.c("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (whbVarA instanceof wt4) {
                            defaultViewModelCreationExtras = ((wt4) whbVarA).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = lb2.a.b;
                        }
                        i3 &= -897;
                        ox6Var4 = ox6Var3;
                        previewViewModel2 = (PreviewViewModel) qhb.a(ll8.a(PreviewViewModel.class), whbVarA, string, cVarFactory$intercom_sdk_base_release, defaultViewModelCreationExtras, bj4VarO);
                    } else {
                        ox6Var4 = ox6Var3;
                    }
                }
                bj4VarO.V();
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                previewUiState = (PreviewUiState) bl7.c(previewViewModel2.getState$intercom_sdk_base_release(), bj4VarO, 0).getValue();
                String permissionDeniedText4 = intercomPreviewArgs.getDownloadState().getPermissionDeniedText();
                bj4VarO.K(-301502125);
                zJ = bj4VarO.j(previewViewModel2) | bj4VarO.j(previewUiState) | bj4VarO.j(context);
                objF = bj4VarO.f();
                jt1.a.C0187a c0187a4 = jt1.a.a;
                if (zJ) {
                    objF = new mh4() { // from class: x88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return PreviewRootScreenKt.PreviewRootScreen$lambda$1$lambda$0(previewViewModel2, previewUiState, context);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: x88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return PreviewRootScreenKt.PreviewRootScreen$lambda$1$lambda$0(previewViewModel2, previewUiState, context);
                        }
                    };
                    bj4VarO.C(objF);
                }
                mh4 mh4Var4 = (mh4) objF;
                bj4VarO.U(false);
                bj4VarO.K(-301499250);
                zJ2 = bj4VarO.j(previewViewModel2);
                objF2 = bj4VarO.f();
                if (zJ2) {
                    objF2 = new PreviewRootScreenKt$PreviewRootScreen$2$1(previewViewModel2);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new PreviewRootScreenKt$PreviewRootScreen$2$1(previewViewModel2);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                PreviewRootScreenContent(ox6Var4, previewUiState, permissionDeniedText4, oh4Var4, oh4Var5, oh4Var6, mh4Var4, (oh4) ((yn5) objF2), bj4VarO, i3 & 523278, 0);
                bj4VarO = bj4VarO;
                ox6Var2 = ox6Var4;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        string = UUID.randomUUID().toString();
                        cVarFactory$intercom_sdk_base_release = PreviewViewModel.Companion.factory$intercom_sdk_base_release(intercomPreviewArgs);
                        whbVarA = xc6.a(bj4VarO);
                        if (whbVarA == null) {
                            aa0.c("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (whbVarA instanceof wt4) {
                            defaultViewModelCreationExtras = ((wt4) whbVarA).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = lb2.a.b;
                        }
                        i3 &= -897;
                        ox6Var4 = ox6Var3;
                        previewViewModel2 = (PreviewViewModel) qhb.a(ll8.a(PreviewViewModel.class), whbVarA, string, cVarFactory$intercom_sdk_base_release, defaultViewModelCreationExtras, bj4VarO);
                    } else {
                        ox6Var4 = ox6Var3;
                    }
                } else {
                    if (i6 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        string = UUID.randomUUID().toString();
                        cVarFactory$intercom_sdk_base_release = PreviewViewModel.Companion.factory$intercom_sdk_base_release(intercomPreviewArgs);
                        whbVarA = xc6.a(bj4VarO);
                        if (whbVarA == null) {
                            aa0.c("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        if (whbVarA instanceof wt4) {
                            defaultViewModelCreationExtras = ((wt4) whbVarA).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = lb2.a.b;
                        }
                        i3 &= -897;
                        ox6Var4 = ox6Var3;
                        previewViewModel2 = (PreviewViewModel) qhb.a(ll8.a(PreviewViewModel.class), whbVarA, string, cVarFactory$intercom_sdk_base_release, defaultViewModelCreationExtras, bj4VarO);
                    } else {
                        ox6Var4 = ox6Var3;
                    }
                }
                bj4VarO.V();
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                previewUiState = (PreviewUiState) bl7.c(previewViewModel2.getState$intercom_sdk_base_release(), bj4VarO, 0).getValue();
                String permissionDeniedText5 = intercomPreviewArgs.getDownloadState().getPermissionDeniedText();
                bj4VarO.K(-301502125);
                zJ = bj4VarO.j(previewViewModel2) | bj4VarO.j(previewUiState) | bj4VarO.j(context);
                objF = bj4VarO.f();
                jt1.a.C0187a c0187a5 = jt1.a.a;
                if (zJ) {
                    objF = new mh4() { // from class: x88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return PreviewRootScreenKt.PreviewRootScreen$lambda$1$lambda$0(previewViewModel2, previewUiState, context);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: x88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return PreviewRootScreenKt.PreviewRootScreen$lambda$1$lambda$0(previewViewModel2, previewUiState, context);
                        }
                    };
                    bj4VarO.C(objF);
                }
                mh4 mh4Var5 = (mh4) objF;
                bj4VarO.U(false);
                bj4VarO.K(-301499250);
                zJ2 = bj4VarO.j(previewViewModel2);
                objF2 = bj4VarO.f();
                if (zJ2) {
                    objF2 = new PreviewRootScreenKt$PreviewRootScreen$2$1(previewViewModel2);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new PreviewRootScreenKt$PreviewRootScreen$2$1(previewViewModel2);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                PreviewRootScreenContent(ox6Var4, previewUiState, permissionDeniedText5, oh4Var4, oh4Var5, oh4Var6, mh4Var5, (oh4) ((yn5) objF2), bj4VarO, i3 & 523278, 0);
                bj4VarO = bj4VarO;
                ox6Var2 = ox6Var4;
            }
            previewViewModel3 = previewViewModel2;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: s88
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PreviewRootScreenKt.PreviewRootScreen$lambda$3(ox6Var2, intercomPreviewArgs, previewViewModel3, oh4Var, oh4Var2, oh4Var3, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        oh4Var5 = oh4Var2;
        if ((i2 & 32) != 0) {
            i3 |= 196608;
            oh4Var6 = oh4Var3;
        } else {
            oh4Var6 = oh4Var3;
            if ((i & 196608) == 0) {
                if (bj4VarO.j(oh4Var6)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
        }
        if ((74899 & i3) == 74898) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    string = UUID.randomUUID().toString();
                    cVarFactory$intercom_sdk_base_release = PreviewViewModel.Companion.factory$intercom_sdk_base_release(intercomPreviewArgs);
                    whbVarA = xc6.a(bj4VarO);
                    if (whbVarA == null) {
                        aa0.c("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    if (whbVarA instanceof wt4) {
                        defaultViewModelCreationExtras = ((wt4) whbVarA).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = lb2.a.b;
                    }
                    i3 &= -897;
                    ox6Var4 = ox6Var3;
                    previewViewModel2 = (PreviewViewModel) qhb.a(ll8.a(PreviewViewModel.class), whbVarA, string, cVarFactory$intercom_sdk_base_release, defaultViewModelCreationExtras, bj4VarO);
                } else {
                    ox6Var4 = ox6Var3;
                }
            } else {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    string = UUID.randomUUID().toString();
                    cVarFactory$intercom_sdk_base_release = PreviewViewModel.Companion.factory$intercom_sdk_base_release(intercomPreviewArgs);
                    whbVarA = xc6.a(bj4VarO);
                    if (whbVarA == null) {
                        aa0.c("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    if (whbVarA instanceof wt4) {
                        defaultViewModelCreationExtras = ((wt4) whbVarA).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = lb2.a.b;
                    }
                    i3 &= -897;
                    ox6Var4 = ox6Var3;
                    previewViewModel2 = (PreviewViewModel) qhb.a(ll8.a(PreviewViewModel.class), whbVarA, string, cVarFactory$intercom_sdk_base_release, defaultViewModelCreationExtras, bj4VarO);
                } else {
                    ox6Var4 = ox6Var3;
                }
            }
            bj4VarO.V();
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            previewUiState = (PreviewUiState) bl7.c(previewViewModel2.getState$intercom_sdk_base_release(), bj4VarO, 0).getValue();
            String permissionDeniedText6 = intercomPreviewArgs.getDownloadState().getPermissionDeniedText();
            bj4VarO.K(-301502125);
            zJ = bj4VarO.j(previewViewModel2) | bj4VarO.j(previewUiState) | bj4VarO.j(context);
            objF = bj4VarO.f();
            jt1.a.C0187a c0187a6 = jt1.a.a;
            if (zJ) {
                objF = new mh4() { // from class: x88
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return PreviewRootScreenKt.PreviewRootScreen$lambda$1$lambda$0(previewViewModel2, previewUiState, context);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new mh4() { // from class: x88
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return PreviewRootScreenKt.PreviewRootScreen$lambda$1$lambda$0(previewViewModel2, previewUiState, context);
                    }
                };
                bj4VarO.C(objF);
            }
            mh4 mh4Var6 = (mh4) objF;
            bj4VarO.U(false);
            bj4VarO.K(-301499250);
            zJ2 = bj4VarO.j(previewViewModel2);
            objF2 = bj4VarO.f();
            if (zJ2) {
                objF2 = new PreviewRootScreenKt$PreviewRootScreen$2$1(previewViewModel2);
                bj4VarO.C(objF2);
            } else {
                objF2 = new PreviewRootScreenKt$PreviewRootScreen$2$1(previewViewModel2);
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            PreviewRootScreenContent(ox6Var4, previewUiState, permissionDeniedText6, oh4Var4, oh4Var5, oh4Var6, mh4Var6, (oh4) ((yn5) objF2), bj4VarO, i3 & 523278, 0);
            bj4VarO = bj4VarO;
            ox6Var2 = ox6Var4;
        } else {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    string = UUID.randomUUID().toString();
                    cVarFactory$intercom_sdk_base_release = PreviewViewModel.Companion.factory$intercom_sdk_base_release(intercomPreviewArgs);
                    whbVarA = xc6.a(bj4VarO);
                    if (whbVarA == null) {
                        aa0.c("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    if (whbVarA instanceof wt4) {
                        defaultViewModelCreationExtras = ((wt4) whbVarA).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = lb2.a.b;
                    }
                    i3 &= -897;
                    ox6Var4 = ox6Var3;
                    previewViewModel2 = (PreviewViewModel) qhb.a(ll8.a(PreviewViewModel.class), whbVarA, string, cVarFactory$intercom_sdk_base_release, defaultViewModelCreationExtras, bj4VarO);
                } else {
                    ox6Var4 = ox6Var3;
                }
            } else {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    string = UUID.randomUUID().toString();
                    cVarFactory$intercom_sdk_base_release = PreviewViewModel.Companion.factory$intercom_sdk_base_release(intercomPreviewArgs);
                    whbVarA = xc6.a(bj4VarO);
                    if (whbVarA == null) {
                        aa0.c("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    if (whbVarA instanceof wt4) {
                        defaultViewModelCreationExtras = ((wt4) whbVarA).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = lb2.a.b;
                    }
                    i3 &= -897;
                    ox6Var4 = ox6Var3;
                    previewViewModel2 = (PreviewViewModel) qhb.a(ll8.a(PreviewViewModel.class), whbVarA, string, cVarFactory$intercom_sdk_base_release, defaultViewModelCreationExtras, bj4VarO);
                } else {
                    ox6Var4 = ox6Var3;
                }
            }
            bj4VarO.V();
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            previewUiState = (PreviewUiState) bl7.c(previewViewModel2.getState$intercom_sdk_base_release(), bj4VarO, 0).getValue();
            String permissionDeniedText7 = intercomPreviewArgs.getDownloadState().getPermissionDeniedText();
            bj4VarO.K(-301502125);
            zJ = bj4VarO.j(previewViewModel2) | bj4VarO.j(previewUiState) | bj4VarO.j(context);
            objF = bj4VarO.f();
            jt1.a.C0187a c0187a7 = jt1.a.a;
            if (zJ) {
                objF = new mh4() { // from class: x88
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return PreviewRootScreenKt.PreviewRootScreen$lambda$1$lambda$0(previewViewModel2, previewUiState, context);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new mh4() { // from class: x88
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return PreviewRootScreenKt.PreviewRootScreen$lambda$1$lambda$0(previewViewModel2, previewUiState, context);
                    }
                };
                bj4VarO.C(objF);
            }
            mh4 mh4Var7 = (mh4) objF;
            bj4VarO.U(false);
            bj4VarO.K(-301499250);
            zJ2 = bj4VarO.j(previewViewModel2);
            objF2 = bj4VarO.f();
            if (zJ2) {
                objF2 = new PreviewRootScreenKt$PreviewRootScreen$2$1(previewViewModel2);
                bj4VarO.C(objF2);
            } else {
                objF2 = new PreviewRootScreenKt$PreviewRootScreen$2$1(previewViewModel2);
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            PreviewRootScreenContent(ox6Var4, previewUiState, permissionDeniedText7, oh4Var4, oh4Var5, oh4Var6, mh4Var7, (oh4) ((yn5) objF2), bj4VarO, i3 & 523278, 0);
            bj4VarO = bj4VarO;
            ox6Var2 = ox6Var4;
        }
        previewViewModel3 = previewViewModel2;
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: s88
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PreviewRootScreenKt.PreviewRootScreen$lambda$3(ox6Var2, intercomPreviewArgs, previewViewModel3, oh4Var, oh4Var2, oh4Var3, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewRootScreen$lambda$1$lambda$0(PreviewViewModel previewViewModel, PreviewUiState previewUiState, Context context) {
        previewViewModel.saveFile$intercom_sdk_base_release(previewUiState.getFiles().get(previewUiState.getCurrentPage()), context);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewRootScreen$lambda$3(ox6 ox6Var, IntercomPreviewArgs intercomPreviewArgs, PreviewViewModel previewViewModel, oh4 oh4Var, oh4 oh4Var2, oh4 oh4Var3, int i, int i2, jt1 jt1Var, int i3) {
        PreviewRootScreen(ox6Var, intercomPreviewArgs, previewViewModel, oh4Var, oh4Var2, oh4Var3, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0127  */
    /* JADX WARN: Code duplicated, block: B:103:0x0133  */
    /* JADX WARN: Code duplicated, block: B:105:0x0141  */
    /* JADX WARN: Code duplicated, block: B:107:0x0144  */
    /* JADX WARN: Code duplicated, block: B:109:0x0150  */
    /* JADX WARN: Code duplicated, block: B:111:0x015e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0161  */
    /* JADX WARN: Code duplicated, block: B:115:0x016d  */
    /* JADX WARN: Code duplicated, block: B:117:0x017b  */
    /* JADX WARN: Code duplicated, block: B:119:0x017e  */
    /* JADX WARN: Code duplicated, block: B:121:0x018a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0199  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:131:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:138:0x0210 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x0212  */
    /* JADX WARN: Code duplicated, block: B:142:0x023b  */
    /* JADX WARN: Code duplicated, block: B:143:0x023d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0249  */
    /* JADX WARN: Code duplicated, block: B:147:0x024b  */
    /* JADX WARN: Code duplicated, block: B:150:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x0255  */
    /* JADX WARN: Code duplicated, block: B:154:0x0278  */
    /* JADX WARN: Code duplicated, block: B:155:0x027a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x0284  */
    /* JADX WARN: Code duplicated, block: B:163:0x02de  */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0114  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119  */
    /* JADX WARN: Code duplicated, block: B:97:0x011d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0120  */
    private static final void PreviewRootScreenContent(ox6 ox6Var, final PreviewUiState previewUiState, String str, oh4<? super List<? extends Uri>, g2b> oh4Var, oh4<? super IntercomPreviewFile, g2b> oh4Var2, oh4<? super List<? extends Uri>, g2b> oh4Var3, mh4<g2b> mh4Var, oh4<? super Integer, g2b> oh4Var4, jt1 jt1Var, final int i, final int i2) {
        int i3;
        String str2;
        int i4;
        oh4<? super List<? extends Uri>, g2b> oh4Var5;
        int i5;
        int i6;
        oh4<? super IntercomPreviewFile, g2b> oh4Var6;
        int i7;
        int i8;
        oh4<? super List<? extends Uri>, g2b> oh4Var7;
        int i9;
        int i10;
        final mh4<g2b> mh4Var2;
        int i11;
        int i12;
        int i13;
        ox6 ox6Var2;
        final String str3;
        int i14;
        jt1.a.C0187a c0187a;
        int i15;
        oh4<? super List<? extends Uri>, g2b> oh4Var8;
        oh4<? super IntercomPreviewFile, g2b> oh4Var9;
        oh4<? super List<? extends Uri>, g2b> oh4Var10;
        oh4<? super Integer, g2b> oh4Var11;
        final Context context;
        Object objF;
        final int currentPage;
        boolean zJ;
        Object objF2;
        final mh4 mh4Var3;
        boolean zH;
        Object objF3;
        vs2 vs2Var;
        boolean z;
        boolean z2;
        boolean z3;
        Object objF4;
        boolean z4;
        boolean z5;
        Object objF5;
        bj4 bj4Var;
        final oh4<? super Integer, g2b> oh4Var12;
        final oh4<? super List<? extends Uri>, g2b> oh4Var13;
        final mh4<g2b> mh4Var4;
        final ox6 ox6Var3;
        final oh4<? super List<? extends Uri>, g2b> oh4Var14;
        final oh4<? super IntercomPreviewFile, g2b> oh4Var15;
        final String str4;
        Object objF6;
        Object objF7;
        Object objF8;
        Object objF9;
        Object objF10;
        xj8 xj8VarW;
        bj4 bj4VarO = jt1Var.o(-1316795838);
        int i16 = i2 & 1;
        if (i16 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(previewUiState) ? 32 : 16;
        }
        int i17 = i2 & 4;
        if (i17 == 0) {
            if ((i & 384) == 0) {
                str2 = str;
                i3 |= bj4VarO.J(str2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    oh4Var5 = oh4Var;
                    if (bj4VarO.j(oh4Var5)) {
                        i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        oh4Var6 = oh4Var2;
                        if (bj4VarO.j(oh4Var6)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            oh4Var7 = oh4Var3;
                            if (bj4VarO.j(oh4Var7)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 64;
                        if (i10 != 0) {
                            i3 |= 1572864;
                            mh4Var2 = mh4Var;
                        } else {
                            mh4Var2 = mh4Var;
                            if ((i & 1572864) == 0) {
                                if (bj4VarO.j(mh4Var2)) {
                                    i11 = 1048576;
                                } else {
                                    i11 = 524288;
                                }
                                i3 |= i11;
                            }
                        }
                        i12 = i2 & 128;
                        if (i12 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            if (bj4VarO.j(oh4Var4)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i3 |= i13;
                        }
                        if ((i3 & 4793491) == 4793490 || !bj4VarO.r()) {
                            if (i16 != 0) {
                                ox6Var2 = ox6.a.t;
                            } else {
                                ox6Var2 = ox6Var;
                            }
                            if (i17 != 0) {
                                str3 = BuildConfig.FLAVOR;
                            } else {
                                str3 = str2;
                            }
                            i14 = 0;
                            c0187a = jt1.a.a;
                            i15 = 1;
                            if (i4 != 0) {
                                bj4VarO.K(-404731513);
                                objF10 = bj4VarO.f();
                                if (objF10 == c0187a) {
                                    objF10 = new t42(i15);
                                    bj4VarO.C(objF10);
                                }
                                oh4Var8 = (oh4) objF10;
                                bj4VarO.U(false);
                            } else {
                                oh4Var8 = oh4Var5;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-404729561);
                                objF9 = bj4VarO.f();
                                if (objF9 == c0187a) {
                                    objF9 = new w47(i15);
                                    bj4VarO.C(objF9);
                                }
                                oh4Var9 = (oh4) objF9;
                                bj4VarO.U(false);
                            } else {
                                oh4Var9 = oh4Var6;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-404727993);
                                objF8 = bj4VarO.f();
                                if (objF8 == c0187a) {
                                    objF8 = new z74(i15);
                                    bj4VarO.C(objF8);
                                }
                                oh4Var10 = (oh4) objF8;
                                bj4VarO.U(false);
                            } else {
                                oh4Var10 = oh4Var7;
                            }
                            if (i10 != 0) {
                                bj4VarO.K(-404726777);
                                objF7 = bj4VarO.f();
                                if (objF7 == c0187a) {
                                    objF7 = new t88(i14);
                                    bj4VarO.C(objF7);
                                }
                                mh4Var2 = (mh4) objF7;
                                bj4VarO.U(false);
                            }
                            if (i12 != 0) {
                                bj4VarO.K(-404725465);
                                objF6 = bj4VarO.f();
                                if (objF6 == c0187a) {
                                    objF6 = new mn1(3);
                                    bj4VarO.C(objF6);
                                }
                                oh4Var11 = (oh4) objF6;
                                bj4VarO.U(false);
                            } else {
                                oh4Var11 = oh4Var4;
                            }
                            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                c33 c33Var = wd3.a;
                                objF = m78.a(bj4VarO.x(), bj4VarO);
                            }
                            t72 t72Var = (t72) objF;
                            currentPage = previewUiState.getCurrentPage();
                            bj4VarO.K(-404718523);
                            zJ = bj4VarO.j(previewUiState);
                            objF2 = bj4VarO.f();
                            if (zJ || objF2 == c0187a) {
                                objF2 = new mh4() { // from class: u88
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                                    }
                                };
                                bj4VarO.C(objF2);
                            }
                            mh4Var3 = (mh4) objF2;
                            bj4VarO.U(false);
                            hr7.b bVar = hr7.a;
                            oh4<? super List<? extends Uri>, g2b> oh4Var16 = oh4Var8;
                            Object[] objArr = new Object[0];
                            au3 au3Var = vs2.G;
                            zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                            oh4<? super IntercomPreviewFile, g2b> oh4Var17 = oh4Var9;
                            objF3 = bj4VarO.f();
                            if (zH || objF3 == c0187a) {
                                objF3 = new mh4() { // from class: fr7
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return new vs2(currentPage, 0.0f, mh4Var3);
                                    }
                                };
                                bj4VarO.C(objF3);
                            }
                            vs2Var = (vs2) mm8.e(objArr, au3Var, (mh4) objF3, bj4VarO, 0);
                            vs2Var.F.setValue(mh4Var3);
                            t9 t9Var = new t9();
                            bj4VarO.K(-404713349);
                            if ((3670016 & i3) == 1048576) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean zJ2 = z | bj4VarO.j(context);
                            if ((i3 & 896) == 256) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            z3 = zJ2 | z2;
                            objF4 = bj4VarO.f();
                            if (z3 || objF4 == c0187a) {
                                objF4 = new oh4() { // from class: v88
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                                    }
                                };
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            eh6 eh6VarF = ia.f(t9Var, (oh4) objF4, bj4VarO);
                            bj4VarO.K(-404705280);
                            boolean zJ3 = bj4VarO.J(vs2Var);
                            if ((29360128 & i3) == 8388608) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            z5 = zJ3 | z4;
                            objF5 = bj4VarO.f();
                            if (z5 || objF5 == c0187a) {
                                objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                                bj4VarO.C(objF5);
                            }
                            bj4VarO.U(false);
                            wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                            ox6 ox6Var4 = ox6Var2;
                            oh4<? super List<? extends Uri>, g2b> oh4Var18 = oh4Var10;
                            bj4Var = bj4VarO;
                            q39.a(ox6Var4, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var16, oh4Var17, oh4Var18, mh4Var2, context, eh6VarF, vs2Var, t72Var), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                            oh4Var12 = oh4Var11;
                            oh4Var13 = oh4Var18;
                            mh4Var4 = mh4Var2;
                            ox6Var3 = ox6Var4;
                            oh4Var14 = oh4Var16;
                            oh4Var15 = oh4Var17;
                            str4 = str3;
                        } else {
                            bj4VarO.u();
                            ox6Var3 = ox6Var;
                            mh4Var4 = mh4Var2;
                            str4 = str2;
                            oh4Var14 = oh4Var5;
                            bj4Var = bj4VarO;
                            oh4Var15 = oh4Var6;
                            oh4Var13 = oh4Var7;
                            oh4Var12 = oh4Var4;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: w88
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return PreviewRootScreenKt.PreviewRootScreenContent$lambda$19(ox6Var3, previewUiState, str4, oh4Var14, oh4Var15, oh4Var13, mh4Var4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    oh4Var7 = oh4Var3;
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                        mh4Var2 = mh4Var;
                    } else {
                        mh4Var2 = mh4Var;
                        if ((i & 1572864) == 0) {
                            if (bj4VarO.j(mh4Var2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (bj4VarO.j(oh4Var4)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        if (i16 != 0) {
                            ox6Var2 = ox6.a.t;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i17 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        } else {
                            str3 = str2;
                        }
                        i14 = 0;
                        c0187a = jt1.a.a;
                        i15 = 1;
                        if (i4 != 0) {
                            bj4VarO.K(-404731513);
                            objF10 = bj4VarO.f();
                            if (objF10 == c0187a) {
                                objF10 = new t42(i15);
                                bj4VarO.C(objF10);
                            }
                            oh4Var8 = (oh4) objF10;
                            bj4VarO.U(false);
                        } else {
                            oh4Var8 = oh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-404729561);
                            objF9 = bj4VarO.f();
                            if (objF9 == c0187a) {
                                objF9 = new w47(i15);
                                bj4VarO.C(objF9);
                            }
                            oh4Var9 = (oh4) objF9;
                            bj4VarO.U(false);
                        } else {
                            oh4Var9 = oh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-404727993);
                            objF8 = bj4VarO.f();
                            if (objF8 == c0187a) {
                                objF8 = new z74(i15);
                                bj4VarO.C(objF8);
                            }
                            oh4Var10 = (oh4) objF8;
                            bj4VarO.U(false);
                        } else {
                            oh4Var10 = oh4Var7;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-404726777);
                            objF7 = bj4VarO.f();
                            if (objF7 == c0187a) {
                                objF7 = new t88(i14);
                                bj4VarO.C(objF7);
                            }
                            mh4Var2 = (mh4) objF7;
                            bj4VarO.U(false);
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-404725465);
                            objF6 = bj4VarO.f();
                            if (objF6 == c0187a) {
                                objF6 = new mn1(3);
                                bj4VarO.C(objF6);
                            }
                            oh4Var11 = (oh4) objF6;
                            bj4VarO.U(false);
                        } else {
                            oh4Var11 = oh4Var4;
                        }
                        context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var2 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72 t72Var2 = (t72) objF;
                        currentPage = previewUiState.getCurrentPage();
                        bj4VarO.K(-404718523);
                        zJ = bj4VarO.j(previewUiState);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: u88
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: u88
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var3 = (mh4) objF2;
                        bj4VarO.U(false);
                        hr7.b bVar2 = hr7.a;
                        oh4<? super List<? extends Uri>, g2b> oh4Var19 = oh4Var8;
                        Object[] objArr2 = new Object[0];
                        au3 au3Var2 = vs2.G;
                        zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                        oh4<? super IntercomPreviewFile, g2b> oh4Var110 = oh4Var9;
                        objF3 = bj4VarO.f();
                        if (zH) {
                            objF3 = new mh4() { // from class: fr7
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return new vs2(currentPage, 0.0f, mh4Var3);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new mh4() { // from class: fr7
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return new vs2(currentPage, 0.0f, mh4Var3);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        vs2Var = (vs2) mm8.e(objArr2, au3Var2, (mh4) objF3, bj4VarO, 0);
                        vs2Var.F.setValue(mh4Var3);
                        t9 t9Var2 = new t9();
                        bj4VarO.K(-404713349);
                        if ((3670016 & i3) == 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean zJ4 = z | bj4VarO.j(context);
                        if ((i3 & 896) == 256) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = zJ4 | z2;
                        objF4 = bj4VarO.f();
                        if (z3) {
                            objF4 = new oh4() { // from class: v88
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                                }
                            };
                            bj4VarO.C(objF4);
                        } else {
                            objF4 = new oh4() { // from class: v88
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                                }
                            };
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        eh6 eh6VarF2 = ia.f(t9Var2, (oh4) objF4, bj4VarO);
                        bj4VarO.K(-404705280);
                        boolean zJ5 = bj4VarO.J(vs2Var);
                        if ((29360128 & i3) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = zJ5 | z4;
                        objF5 = bj4VarO.f();
                        if (z5) {
                            objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                            bj4VarO.C(objF5);
                        } else {
                            objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                        ox6 ox6Var5 = ox6Var2;
                        oh4<? super List<? extends Uri>, g2b> oh4Var111 = oh4Var10;
                        bj4Var = bj4VarO;
                        q39.a(ox6Var5, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var19, oh4Var110, oh4Var111, mh4Var2, context, eh6VarF2, vs2Var, t72Var2), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                        oh4Var12 = oh4Var11;
                        oh4Var13 = oh4Var111;
                        mh4Var4 = mh4Var2;
                        ox6Var3 = ox6Var5;
                        oh4Var14 = oh4Var19;
                        oh4Var15 = oh4Var110;
                        str4 = str3;
                    } else {
                        if (i16 != 0) {
                            ox6Var2 = ox6.a.t;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i17 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        } else {
                            str3 = str2;
                        }
                        i14 = 0;
                        c0187a = jt1.a.a;
                        i15 = 1;
                        if (i4 != 0) {
                            bj4VarO.K(-404731513);
                            objF10 = bj4VarO.f();
                            if (objF10 == c0187a) {
                                objF10 = new t42(i15);
                                bj4VarO.C(objF10);
                            }
                            oh4Var8 = (oh4) objF10;
                            bj4VarO.U(false);
                        } else {
                            oh4Var8 = oh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-404729561);
                            objF9 = bj4VarO.f();
                            if (objF9 == c0187a) {
                                objF9 = new w47(i15);
                                bj4VarO.C(objF9);
                            }
                            oh4Var9 = (oh4) objF9;
                            bj4VarO.U(false);
                        } else {
                            oh4Var9 = oh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-404727993);
                            objF8 = bj4VarO.f();
                            if (objF8 == c0187a) {
                                objF8 = new z74(i15);
                                bj4VarO.C(objF8);
                            }
                            oh4Var10 = (oh4) objF8;
                            bj4VarO.U(false);
                        } else {
                            oh4Var10 = oh4Var7;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-404726777);
                            objF7 = bj4VarO.f();
                            if (objF7 == c0187a) {
                                objF7 = new t88(i14);
                                bj4VarO.C(objF7);
                            }
                            mh4Var2 = (mh4) objF7;
                            bj4VarO.U(false);
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-404725465);
                            objF6 = bj4VarO.f();
                            if (objF6 == c0187a) {
                                objF6 = new mn1(3);
                                bj4VarO.C(objF6);
                            }
                            oh4Var11 = (oh4) objF6;
                            bj4VarO.U(false);
                        } else {
                            oh4Var11 = oh4Var4;
                        }
                        context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var3 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72 t72Var3 = (t72) objF;
                        currentPage = previewUiState.getCurrentPage();
                        bj4VarO.K(-404718523);
                        zJ = bj4VarO.j(previewUiState);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: u88
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: u88
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var3 = (mh4) objF2;
                        bj4VarO.U(false);
                        hr7.b bVar3 = hr7.a;
                        oh4<? super List<? extends Uri>, g2b> oh4Var112 = oh4Var8;
                        Object[] objArr3 = new Object[0];
                        au3 au3Var3 = vs2.G;
                        zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                        oh4<? super IntercomPreviewFile, g2b> oh4Var113 = oh4Var9;
                        objF3 = bj4VarO.f();
                        if (zH) {
                            objF3 = new mh4() { // from class: fr7
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return new vs2(currentPage, 0.0f, mh4Var3);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new mh4() { // from class: fr7
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return new vs2(currentPage, 0.0f, mh4Var3);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        vs2Var = (vs2) mm8.e(objArr3, au3Var3, (mh4) objF3, bj4VarO, 0);
                        vs2Var.F.setValue(mh4Var3);
                        t9 t9Var3 = new t9();
                        bj4VarO.K(-404713349);
                        if ((3670016 & i3) == 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean zJ6 = z | bj4VarO.j(context);
                        if ((i3 & 896) == 256) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = zJ6 | z2;
                        objF4 = bj4VarO.f();
                        if (z3) {
                            objF4 = new oh4() { // from class: v88
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                                }
                            };
                            bj4VarO.C(objF4);
                        } else {
                            objF4 = new oh4() { // from class: v88
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                                }
                            };
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        eh6 eh6VarF3 = ia.f(t9Var3, (oh4) objF4, bj4VarO);
                        bj4VarO.K(-404705280);
                        boolean zJ7 = bj4VarO.J(vs2Var);
                        if ((29360128 & i3) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = zJ7 | z4;
                        objF5 = bj4VarO.f();
                        if (z5) {
                            objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                            bj4VarO.C(objF5);
                        } else {
                            objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                        ox6 ox6Var6 = ox6Var2;
                        oh4<? super List<? extends Uri>, g2b> oh4Var114 = oh4Var10;
                        bj4Var = bj4VarO;
                        q39.a(ox6Var6, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var112, oh4Var113, oh4Var114, mh4Var2, context, eh6VarF3, vs2Var, t72Var3), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                        oh4Var12 = oh4Var11;
                        oh4Var13 = oh4Var114;
                        mh4Var4 = mh4Var2;
                        ox6Var3 = ox6Var6;
                        oh4Var14 = oh4Var112;
                        oh4Var15 = oh4Var113;
                        str4 = str3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: w88
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$19(ox6Var3, previewUiState, str4, oh4Var14, oh4Var15, oh4Var13, mh4Var4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                oh4Var6 = oh4Var2;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        oh4Var7 = oh4Var3;
                        if (bj4VarO.j(oh4Var7)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                        mh4Var2 = mh4Var;
                    } else {
                        mh4Var2 = mh4Var;
                        if ((i & 1572864) == 0) {
                            if (bj4VarO.j(mh4Var2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (bj4VarO.j(oh4Var4)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        if (i16 != 0) {
                            ox6Var2 = ox6.a.t;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i17 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        } else {
                            str3 = str2;
                        }
                        i14 = 0;
                        c0187a = jt1.a.a;
                        i15 = 1;
                        if (i4 != 0) {
                            bj4VarO.K(-404731513);
                            objF10 = bj4VarO.f();
                            if (objF10 == c0187a) {
                                objF10 = new t42(i15);
                                bj4VarO.C(objF10);
                            }
                            oh4Var8 = (oh4) objF10;
                            bj4VarO.U(false);
                        } else {
                            oh4Var8 = oh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-404729561);
                            objF9 = bj4VarO.f();
                            if (objF9 == c0187a) {
                                objF9 = new w47(i15);
                                bj4VarO.C(objF9);
                            }
                            oh4Var9 = (oh4) objF9;
                            bj4VarO.U(false);
                        } else {
                            oh4Var9 = oh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-404727993);
                            objF8 = bj4VarO.f();
                            if (objF8 == c0187a) {
                                objF8 = new z74(i15);
                                bj4VarO.C(objF8);
                            }
                            oh4Var10 = (oh4) objF8;
                            bj4VarO.U(false);
                        } else {
                            oh4Var10 = oh4Var7;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-404726777);
                            objF7 = bj4VarO.f();
                            if (objF7 == c0187a) {
                                objF7 = new t88(i14);
                                bj4VarO.C(objF7);
                            }
                            mh4Var2 = (mh4) objF7;
                            bj4VarO.U(false);
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-404725465);
                            objF6 = bj4VarO.f();
                            if (objF6 == c0187a) {
                                objF6 = new mn1(3);
                                bj4VarO.C(objF6);
                            }
                            oh4Var11 = (oh4) objF6;
                            bj4VarO.U(false);
                        } else {
                            oh4Var11 = oh4Var4;
                        }
                        context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var4 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72 t72Var4 = (t72) objF;
                        currentPage = previewUiState.getCurrentPage();
                        bj4VarO.K(-404718523);
                        zJ = bj4VarO.j(previewUiState);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: u88
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: u88
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var3 = (mh4) objF2;
                        bj4VarO.U(false);
                        hr7.b bVar4 = hr7.a;
                        oh4<? super List<? extends Uri>, g2b> oh4Var115 = oh4Var8;
                        Object[] objArr4 = new Object[0];
                        au3 au3Var4 = vs2.G;
                        zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                        oh4<? super IntercomPreviewFile, g2b> oh4Var116 = oh4Var9;
                        objF3 = bj4VarO.f();
                        if (zH) {
                            objF3 = new mh4() { // from class: fr7
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return new vs2(currentPage, 0.0f, mh4Var3);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new mh4() { // from class: fr7
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return new vs2(currentPage, 0.0f, mh4Var3);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        vs2Var = (vs2) mm8.e(objArr4, au3Var4, (mh4) objF3, bj4VarO, 0);
                        vs2Var.F.setValue(mh4Var3);
                        t9 t9Var4 = new t9();
                        bj4VarO.K(-404713349);
                        if ((3670016 & i3) == 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean zJ8 = z | bj4VarO.j(context);
                        if ((i3 & 896) == 256) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = zJ8 | z2;
                        objF4 = bj4VarO.f();
                        if (z3) {
                            objF4 = new oh4() { // from class: v88
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                                }
                            };
                            bj4VarO.C(objF4);
                        } else {
                            objF4 = new oh4() { // from class: v88
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                                }
                            };
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        eh6 eh6VarF4 = ia.f(t9Var4, (oh4) objF4, bj4VarO);
                        bj4VarO.K(-404705280);
                        boolean zJ9 = bj4VarO.J(vs2Var);
                        if ((29360128 & i3) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = zJ9 | z4;
                        objF5 = bj4VarO.f();
                        if (z5) {
                            objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                            bj4VarO.C(objF5);
                        } else {
                            objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                        ox6 ox6Var7 = ox6Var2;
                        oh4<? super List<? extends Uri>, g2b> oh4Var117 = oh4Var10;
                        bj4Var = bj4VarO;
                        q39.a(ox6Var7, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var115, oh4Var116, oh4Var117, mh4Var2, context, eh6VarF4, vs2Var, t72Var4), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                        oh4Var12 = oh4Var11;
                        oh4Var13 = oh4Var117;
                        mh4Var4 = mh4Var2;
                        ox6Var3 = ox6Var7;
                        oh4Var14 = oh4Var115;
                        oh4Var15 = oh4Var116;
                        str4 = str3;
                    } else {
                        if (i16 != 0) {
                            ox6Var2 = ox6.a.t;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i17 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        } else {
                            str3 = str2;
                        }
                        i14 = 0;
                        c0187a = jt1.a.a;
                        i15 = 1;
                        if (i4 != 0) {
                            bj4VarO.K(-404731513);
                            objF10 = bj4VarO.f();
                            if (objF10 == c0187a) {
                                objF10 = new t42(i15);
                                bj4VarO.C(objF10);
                            }
                            oh4Var8 = (oh4) objF10;
                            bj4VarO.U(false);
                        } else {
                            oh4Var8 = oh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-404729561);
                            objF9 = bj4VarO.f();
                            if (objF9 == c0187a) {
                                objF9 = new w47(i15);
                                bj4VarO.C(objF9);
                            }
                            oh4Var9 = (oh4) objF9;
                            bj4VarO.U(false);
                        } else {
                            oh4Var9 = oh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-404727993);
                            objF8 = bj4VarO.f();
                            if (objF8 == c0187a) {
                                objF8 = new z74(i15);
                                bj4VarO.C(objF8);
                            }
                            oh4Var10 = (oh4) objF8;
                            bj4VarO.U(false);
                        } else {
                            oh4Var10 = oh4Var7;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-404726777);
                            objF7 = bj4VarO.f();
                            if (objF7 == c0187a) {
                                objF7 = new t88(i14);
                                bj4VarO.C(objF7);
                            }
                            mh4Var2 = (mh4) objF7;
                            bj4VarO.U(false);
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-404725465);
                            objF6 = bj4VarO.f();
                            if (objF6 == c0187a) {
                                objF6 = new mn1(3);
                                bj4VarO.C(objF6);
                            }
                            oh4Var11 = (oh4) objF6;
                            bj4VarO.U(false);
                        } else {
                            oh4Var11 = oh4Var4;
                        }
                        context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var5 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72 t72Var5 = (t72) objF;
                        currentPage = previewUiState.getCurrentPage();
                        bj4VarO.K(-404718523);
                        zJ = bj4VarO.j(previewUiState);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: u88
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: u88
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var3 = (mh4) objF2;
                        bj4VarO.U(false);
                        hr7.b bVar5 = hr7.a;
                        oh4<? super List<? extends Uri>, g2b> oh4Var118 = oh4Var8;
                        Object[] objArr5 = new Object[0];
                        au3 au3Var5 = vs2.G;
                        zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                        oh4<? super IntercomPreviewFile, g2b> oh4Var119 = oh4Var9;
                        objF3 = bj4VarO.f();
                        if (zH) {
                            objF3 = new mh4() { // from class: fr7
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return new vs2(currentPage, 0.0f, mh4Var3);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new mh4() { // from class: fr7
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return new vs2(currentPage, 0.0f, mh4Var3);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        vs2Var = (vs2) mm8.e(objArr5, au3Var5, (mh4) objF3, bj4VarO, 0);
                        vs2Var.F.setValue(mh4Var3);
                        t9 t9Var5 = new t9();
                        bj4VarO.K(-404713349);
                        if ((3670016 & i3) == 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean zJ10 = z | bj4VarO.j(context);
                        if ((i3 & 896) == 256) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = zJ10 | z2;
                        objF4 = bj4VarO.f();
                        if (z3) {
                            objF4 = new oh4() { // from class: v88
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                                }
                            };
                            bj4VarO.C(objF4);
                        } else {
                            objF4 = new oh4() { // from class: v88
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                                }
                            };
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        eh6 eh6VarF5 = ia.f(t9Var5, (oh4) objF4, bj4VarO);
                        bj4VarO.K(-404705280);
                        boolean zJ11 = bj4VarO.J(vs2Var);
                        if ((29360128 & i3) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = zJ11 | z4;
                        objF5 = bj4VarO.f();
                        if (z5) {
                            objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                            bj4VarO.C(objF5);
                        } else {
                            objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                        ox6 ox6Var8 = ox6Var2;
                        oh4<? super List<? extends Uri>, g2b> oh4Var1110 = oh4Var10;
                        bj4Var = bj4VarO;
                        q39.a(ox6Var8, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var118, oh4Var119, oh4Var1110, mh4Var2, context, eh6VarF5, vs2Var, t72Var5), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                        oh4Var12 = oh4Var11;
                        oh4Var13 = oh4Var1110;
                        mh4Var4 = mh4Var2;
                        ox6Var3 = ox6Var8;
                        oh4Var14 = oh4Var118;
                        oh4Var15 = oh4Var119;
                        str4 = str3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: w88
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$19(ox6Var3, previewUiState, str4, oh4Var14, oh4Var15, oh4Var13, mh4Var4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                oh4Var7 = oh4Var3;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    mh4Var2 = mh4Var;
                } else {
                    mh4Var2 = mh4Var;
                    if ((i & 1572864) == 0) {
                        if (bj4VarO.j(mh4Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (bj4VarO.j(oh4Var4)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i16 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i17 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    } else {
                        str3 = str2;
                    }
                    i14 = 0;
                    c0187a = jt1.a.a;
                    i15 = 1;
                    if (i4 != 0) {
                        bj4VarO.K(-404731513);
                        objF10 = bj4VarO.f();
                        if (objF10 == c0187a) {
                            objF10 = new t42(i15);
                            bj4VarO.C(objF10);
                        }
                        oh4Var8 = (oh4) objF10;
                        bj4VarO.U(false);
                    } else {
                        oh4Var8 = oh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-404729561);
                        objF9 = bj4VarO.f();
                        if (objF9 == c0187a) {
                            objF9 = new w47(i15);
                            bj4VarO.C(objF9);
                        }
                        oh4Var9 = (oh4) objF9;
                        bj4VarO.U(false);
                    } else {
                        oh4Var9 = oh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-404727993);
                        objF8 = bj4VarO.f();
                        if (objF8 == c0187a) {
                            objF8 = new z74(i15);
                            bj4VarO.C(objF8);
                        }
                        oh4Var10 = (oh4) objF8;
                        bj4VarO.U(false);
                    } else {
                        oh4Var10 = oh4Var7;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-404726777);
                        objF7 = bj4VarO.f();
                        if (objF7 == c0187a) {
                            objF7 = new t88(i14);
                            bj4VarO.C(objF7);
                        }
                        mh4Var2 = (mh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-404725465);
                        objF6 = bj4VarO.f();
                        if (objF6 == c0187a) {
                            objF6 = new mn1(3);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    } else {
                        oh4Var11 = oh4Var4;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var6 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72 t72Var6 = (t72) objF;
                    currentPage = previewUiState.getCurrentPage();
                    bj4VarO.K(-404718523);
                    zJ = bj4VarO.j(previewUiState);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var3 = (mh4) objF2;
                    bj4VarO.U(false);
                    hr7.b bVar6 = hr7.a;
                    oh4<? super List<? extends Uri>, g2b> oh4Var1111 = oh4Var8;
                    Object[] objArr6 = new Object[0];
                    au3 au3Var6 = vs2.G;
                    zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                    oh4<? super IntercomPreviewFile, g2b> oh4Var1112 = oh4Var9;
                    objF3 = bj4VarO.f();
                    if (zH) {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    vs2Var = (vs2) mm8.e(objArr6, au3Var6, (mh4) objF3, bj4VarO, 0);
                    vs2Var.F.setValue(mh4Var3);
                    t9 t9Var6 = new t9();
                    bj4VarO.K(-404713349);
                    if ((3670016 & i3) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zJ12 = z | bj4VarO.j(context);
                    if ((i3 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = zJ12 | z2;
                    objF4 = bj4VarO.f();
                    if (z3) {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    eh6 eh6VarF6 = ia.f(t9Var6, (oh4) objF4, bj4VarO);
                    bj4VarO.K(-404705280);
                    boolean zJ13 = bj4VarO.J(vs2Var);
                    if ((29360128 & i3) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zJ13 | z4;
                    objF5 = bj4VarO.f();
                    if (z5) {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    } else {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                    ox6 ox6Var9 = ox6Var2;
                    oh4<? super List<? extends Uri>, g2b> oh4Var1113 = oh4Var10;
                    bj4Var = bj4VarO;
                    q39.a(ox6Var9, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var1111, oh4Var1112, oh4Var1113, mh4Var2, context, eh6VarF6, vs2Var, t72Var6), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                    oh4Var12 = oh4Var11;
                    oh4Var13 = oh4Var1113;
                    mh4Var4 = mh4Var2;
                    ox6Var3 = ox6Var9;
                    oh4Var14 = oh4Var1111;
                    oh4Var15 = oh4Var1112;
                    str4 = str3;
                } else {
                    if (i16 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i17 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    } else {
                        str3 = str2;
                    }
                    i14 = 0;
                    c0187a = jt1.a.a;
                    i15 = 1;
                    if (i4 != 0) {
                        bj4VarO.K(-404731513);
                        objF10 = bj4VarO.f();
                        if (objF10 == c0187a) {
                            objF10 = new t42(i15);
                            bj4VarO.C(objF10);
                        }
                        oh4Var8 = (oh4) objF10;
                        bj4VarO.U(false);
                    } else {
                        oh4Var8 = oh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-404729561);
                        objF9 = bj4VarO.f();
                        if (objF9 == c0187a) {
                            objF9 = new w47(i15);
                            bj4VarO.C(objF9);
                        }
                        oh4Var9 = (oh4) objF9;
                        bj4VarO.U(false);
                    } else {
                        oh4Var9 = oh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-404727993);
                        objF8 = bj4VarO.f();
                        if (objF8 == c0187a) {
                            objF8 = new z74(i15);
                            bj4VarO.C(objF8);
                        }
                        oh4Var10 = (oh4) objF8;
                        bj4VarO.U(false);
                    } else {
                        oh4Var10 = oh4Var7;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-404726777);
                        objF7 = bj4VarO.f();
                        if (objF7 == c0187a) {
                            objF7 = new t88(i14);
                            bj4VarO.C(objF7);
                        }
                        mh4Var2 = (mh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-404725465);
                        objF6 = bj4VarO.f();
                        if (objF6 == c0187a) {
                            objF6 = new mn1(3);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    } else {
                        oh4Var11 = oh4Var4;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var7 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72 t72Var7 = (t72) objF;
                    currentPage = previewUiState.getCurrentPage();
                    bj4VarO.K(-404718523);
                    zJ = bj4VarO.j(previewUiState);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var3 = (mh4) objF2;
                    bj4VarO.U(false);
                    hr7.b bVar7 = hr7.a;
                    oh4<? super List<? extends Uri>, g2b> oh4Var1114 = oh4Var8;
                    Object[] objArr7 = new Object[0];
                    au3 au3Var7 = vs2.G;
                    zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                    oh4<? super IntercomPreviewFile, g2b> oh4Var1115 = oh4Var9;
                    objF3 = bj4VarO.f();
                    if (zH) {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    vs2Var = (vs2) mm8.e(objArr7, au3Var7, (mh4) objF3, bj4VarO, 0);
                    vs2Var.F.setValue(mh4Var3);
                    t9 t9Var7 = new t9();
                    bj4VarO.K(-404713349);
                    if ((3670016 & i3) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zJ14 = z | bj4VarO.j(context);
                    if ((i3 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = zJ14 | z2;
                    objF4 = bj4VarO.f();
                    if (z3) {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    eh6 eh6VarF7 = ia.f(t9Var7, (oh4) objF4, bj4VarO);
                    bj4VarO.K(-404705280);
                    boolean zJ15 = bj4VarO.J(vs2Var);
                    if ((29360128 & i3) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zJ15 | z4;
                    objF5 = bj4VarO.f();
                    if (z5) {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    } else {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                    ox6 ox6Var10 = ox6Var2;
                    oh4<? super List<? extends Uri>, g2b> oh4Var1116 = oh4Var10;
                    bj4Var = bj4VarO;
                    q39.a(ox6Var10, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var1114, oh4Var1115, oh4Var1116, mh4Var2, context, eh6VarF7, vs2Var, t72Var7), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                    oh4Var12 = oh4Var11;
                    oh4Var13 = oh4Var1116;
                    mh4Var4 = mh4Var2;
                    ox6Var3 = ox6Var10;
                    oh4Var14 = oh4Var1114;
                    oh4Var15 = oh4Var1115;
                    str4 = str3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: w88
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$19(ox6Var3, previewUiState, str4, oh4Var14, oh4Var15, oh4Var13, mh4Var4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            oh4Var5 = oh4Var;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    oh4Var6 = oh4Var2;
                    if (bj4VarO.j(oh4Var6)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        oh4Var7 = oh4Var3;
                        if (bj4VarO.j(oh4Var7)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                        mh4Var2 = mh4Var;
                    } else {
                        mh4Var2 = mh4Var;
                        if ((i & 1572864) == 0) {
                            if (bj4VarO.j(mh4Var2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (bj4VarO.j(oh4Var4)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        if (i16 != 0) {
                            ox6Var2 = ox6.a.t;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i17 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        } else {
                            str3 = str2;
                        }
                        i14 = 0;
                        c0187a = jt1.a.a;
                        i15 = 1;
                        if (i4 != 0) {
                            bj4VarO.K(-404731513);
                            objF10 = bj4VarO.f();
                            if (objF10 == c0187a) {
                                objF10 = new t42(i15);
                                bj4VarO.C(objF10);
                            }
                            oh4Var8 = (oh4) objF10;
                            bj4VarO.U(false);
                        } else {
                            oh4Var8 = oh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-404729561);
                            objF9 = bj4VarO.f();
                            if (objF9 == c0187a) {
                                objF9 = new w47(i15);
                                bj4VarO.C(objF9);
                            }
                            oh4Var9 = (oh4) objF9;
                            bj4VarO.U(false);
                        } else {
                            oh4Var9 = oh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-404727993);
                            objF8 = bj4VarO.f();
                            if (objF8 == c0187a) {
                                objF8 = new z74(i15);
                                bj4VarO.C(objF8);
                            }
                            oh4Var10 = (oh4) objF8;
                            bj4VarO.U(false);
                        } else {
                            oh4Var10 = oh4Var7;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-404726777);
                            objF7 = bj4VarO.f();
                            if (objF7 == c0187a) {
                                objF7 = new t88(i14);
                                bj4VarO.C(objF7);
                            }
                            mh4Var2 = (mh4) objF7;
                            bj4VarO.U(false);
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-404725465);
                            objF6 = bj4VarO.f();
                            if (objF6 == c0187a) {
                                objF6 = new mn1(3);
                                bj4VarO.C(objF6);
                            }
                            oh4Var11 = (oh4) objF6;
                            bj4VarO.U(false);
                        } else {
                            oh4Var11 = oh4Var4;
                        }
                        context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var8 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72 t72Var8 = (t72) objF;
                        currentPage = previewUiState.getCurrentPage();
                        bj4VarO.K(-404718523);
                        zJ = bj4VarO.j(previewUiState);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: u88
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: u88
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var3 = (mh4) objF2;
                        bj4VarO.U(false);
                        hr7.b bVar8 = hr7.a;
                        oh4<? super List<? extends Uri>, g2b> oh4Var1117 = oh4Var8;
                        Object[] objArr8 = new Object[0];
                        au3 au3Var8 = vs2.G;
                        zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                        oh4<? super IntercomPreviewFile, g2b> oh4Var1118 = oh4Var9;
                        objF3 = bj4VarO.f();
                        if (zH) {
                            objF3 = new mh4() { // from class: fr7
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return new vs2(currentPage, 0.0f, mh4Var3);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new mh4() { // from class: fr7
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return new vs2(currentPage, 0.0f, mh4Var3);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        vs2Var = (vs2) mm8.e(objArr8, au3Var8, (mh4) objF3, bj4VarO, 0);
                        vs2Var.F.setValue(mh4Var3);
                        t9 t9Var8 = new t9();
                        bj4VarO.K(-404713349);
                        if ((3670016 & i3) == 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean zJ16 = z | bj4VarO.j(context);
                        if ((i3 & 896) == 256) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = zJ16 | z2;
                        objF4 = bj4VarO.f();
                        if (z3) {
                            objF4 = new oh4() { // from class: v88
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                                }
                            };
                            bj4VarO.C(objF4);
                        } else {
                            objF4 = new oh4() { // from class: v88
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                                }
                            };
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        eh6 eh6VarF8 = ia.f(t9Var8, (oh4) objF4, bj4VarO);
                        bj4VarO.K(-404705280);
                        boolean zJ17 = bj4VarO.J(vs2Var);
                        if ((29360128 & i3) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = zJ17 | z4;
                        objF5 = bj4VarO.f();
                        if (z5) {
                            objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                            bj4VarO.C(objF5);
                        } else {
                            objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                        ox6 ox6Var11 = ox6Var2;
                        oh4<? super List<? extends Uri>, g2b> oh4Var1119 = oh4Var10;
                        bj4Var = bj4VarO;
                        q39.a(ox6Var11, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var1117, oh4Var1118, oh4Var1119, mh4Var2, context, eh6VarF8, vs2Var, t72Var8), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                        oh4Var12 = oh4Var11;
                        oh4Var13 = oh4Var1119;
                        mh4Var4 = mh4Var2;
                        ox6Var3 = ox6Var11;
                        oh4Var14 = oh4Var1117;
                        oh4Var15 = oh4Var1118;
                        str4 = str3;
                    } else {
                        if (i16 != 0) {
                            ox6Var2 = ox6.a.t;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i17 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        } else {
                            str3 = str2;
                        }
                        i14 = 0;
                        c0187a = jt1.a.a;
                        i15 = 1;
                        if (i4 != 0) {
                            bj4VarO.K(-404731513);
                            objF10 = bj4VarO.f();
                            if (objF10 == c0187a) {
                                objF10 = new t42(i15);
                                bj4VarO.C(objF10);
                            }
                            oh4Var8 = (oh4) objF10;
                            bj4VarO.U(false);
                        } else {
                            oh4Var8 = oh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-404729561);
                            objF9 = bj4VarO.f();
                            if (objF9 == c0187a) {
                                objF9 = new w47(i15);
                                bj4VarO.C(objF9);
                            }
                            oh4Var9 = (oh4) objF9;
                            bj4VarO.U(false);
                        } else {
                            oh4Var9 = oh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-404727993);
                            objF8 = bj4VarO.f();
                            if (objF8 == c0187a) {
                                objF8 = new z74(i15);
                                bj4VarO.C(objF8);
                            }
                            oh4Var10 = (oh4) objF8;
                            bj4VarO.U(false);
                        } else {
                            oh4Var10 = oh4Var7;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-404726777);
                            objF7 = bj4VarO.f();
                            if (objF7 == c0187a) {
                                objF7 = new t88(i14);
                                bj4VarO.C(objF7);
                            }
                            mh4Var2 = (mh4) objF7;
                            bj4VarO.U(false);
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-404725465);
                            objF6 = bj4VarO.f();
                            if (objF6 == c0187a) {
                                objF6 = new mn1(3);
                                bj4VarO.C(objF6);
                            }
                            oh4Var11 = (oh4) objF6;
                            bj4VarO.U(false);
                        } else {
                            oh4Var11 = oh4Var4;
                        }
                        context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var9 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72 t72Var9 = (t72) objF;
                        currentPage = previewUiState.getCurrentPage();
                        bj4VarO.K(-404718523);
                        zJ = bj4VarO.j(previewUiState);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: u88
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: u88
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var3 = (mh4) objF2;
                        bj4VarO.U(false);
                        hr7.b bVar9 = hr7.a;
                        oh4<? super List<? extends Uri>, g2b> oh4Var11110 = oh4Var8;
                        Object[] objArr9 = new Object[0];
                        au3 au3Var9 = vs2.G;
                        zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                        oh4<? super IntercomPreviewFile, g2b> oh4Var11111 = oh4Var9;
                        objF3 = bj4VarO.f();
                        if (zH) {
                            objF3 = new mh4() { // from class: fr7
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return new vs2(currentPage, 0.0f, mh4Var3);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new mh4() { // from class: fr7
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return new vs2(currentPage, 0.0f, mh4Var3);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        vs2Var = (vs2) mm8.e(objArr9, au3Var9, (mh4) objF3, bj4VarO, 0);
                        vs2Var.F.setValue(mh4Var3);
                        t9 t9Var9 = new t9();
                        bj4VarO.K(-404713349);
                        if ((3670016 & i3) == 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean zJ18 = z | bj4VarO.j(context);
                        if ((i3 & 896) == 256) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = zJ18 | z2;
                        objF4 = bj4VarO.f();
                        if (z3) {
                            objF4 = new oh4() { // from class: v88
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                                }
                            };
                            bj4VarO.C(objF4);
                        } else {
                            objF4 = new oh4() { // from class: v88
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                                }
                            };
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        eh6 eh6VarF9 = ia.f(t9Var9, (oh4) objF4, bj4VarO);
                        bj4VarO.K(-404705280);
                        boolean zJ19 = bj4VarO.J(vs2Var);
                        if ((29360128 & i3) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = zJ19 | z4;
                        objF5 = bj4VarO.f();
                        if (z5) {
                            objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                            bj4VarO.C(objF5);
                        } else {
                            objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                        ox6 ox6Var12 = ox6Var2;
                        oh4<? super List<? extends Uri>, g2b> oh4Var11112 = oh4Var10;
                        bj4Var = bj4VarO;
                        q39.a(ox6Var12, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var11110, oh4Var11111, oh4Var11112, mh4Var2, context, eh6VarF9, vs2Var, t72Var9), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                        oh4Var12 = oh4Var11;
                        oh4Var13 = oh4Var11112;
                        mh4Var4 = mh4Var2;
                        ox6Var3 = ox6Var12;
                        oh4Var14 = oh4Var11110;
                        oh4Var15 = oh4Var11111;
                        str4 = str3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: w88
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$19(ox6Var3, previewUiState, str4, oh4Var14, oh4Var15, oh4Var13, mh4Var4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                oh4Var7 = oh4Var3;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    mh4Var2 = mh4Var;
                } else {
                    mh4Var2 = mh4Var;
                    if ((i & 1572864) == 0) {
                        if (bj4VarO.j(mh4Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (bj4VarO.j(oh4Var4)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i16 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i17 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    } else {
                        str3 = str2;
                    }
                    i14 = 0;
                    c0187a = jt1.a.a;
                    i15 = 1;
                    if (i4 != 0) {
                        bj4VarO.K(-404731513);
                        objF10 = bj4VarO.f();
                        if (objF10 == c0187a) {
                            objF10 = new t42(i15);
                            bj4VarO.C(objF10);
                        }
                        oh4Var8 = (oh4) objF10;
                        bj4VarO.U(false);
                    } else {
                        oh4Var8 = oh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-404729561);
                        objF9 = bj4VarO.f();
                        if (objF9 == c0187a) {
                            objF9 = new w47(i15);
                            bj4VarO.C(objF9);
                        }
                        oh4Var9 = (oh4) objF9;
                        bj4VarO.U(false);
                    } else {
                        oh4Var9 = oh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-404727993);
                        objF8 = bj4VarO.f();
                        if (objF8 == c0187a) {
                            objF8 = new z74(i15);
                            bj4VarO.C(objF8);
                        }
                        oh4Var10 = (oh4) objF8;
                        bj4VarO.U(false);
                    } else {
                        oh4Var10 = oh4Var7;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-404726777);
                        objF7 = bj4VarO.f();
                        if (objF7 == c0187a) {
                            objF7 = new t88(i14);
                            bj4VarO.C(objF7);
                        }
                        mh4Var2 = (mh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-404725465);
                        objF6 = bj4VarO.f();
                        if (objF6 == c0187a) {
                            objF6 = new mn1(3);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    } else {
                        oh4Var11 = oh4Var4;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var10 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72 t72Var10 = (t72) objF;
                    currentPage = previewUiState.getCurrentPage();
                    bj4VarO.K(-404718523);
                    zJ = bj4VarO.j(previewUiState);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var3 = (mh4) objF2;
                    bj4VarO.U(false);
                    hr7.b bVar10 = hr7.a;
                    oh4<? super List<? extends Uri>, g2b> oh4Var11113 = oh4Var8;
                    Object[] objArr10 = new Object[0];
                    au3 au3Var10 = vs2.G;
                    zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                    oh4<? super IntercomPreviewFile, g2b> oh4Var11114 = oh4Var9;
                    objF3 = bj4VarO.f();
                    if (zH) {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    vs2Var = (vs2) mm8.e(objArr10, au3Var10, (mh4) objF3, bj4VarO, 0);
                    vs2Var.F.setValue(mh4Var3);
                    t9 t9Var10 = new t9();
                    bj4VarO.K(-404713349);
                    if ((3670016 & i3) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zJ110 = z | bj4VarO.j(context);
                    if ((i3 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = zJ110 | z2;
                    objF4 = bj4VarO.f();
                    if (z3) {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    eh6 eh6VarF10 = ia.f(t9Var10, (oh4) objF4, bj4VarO);
                    bj4VarO.K(-404705280);
                    boolean zJ111 = bj4VarO.J(vs2Var);
                    if ((29360128 & i3) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zJ111 | z4;
                    objF5 = bj4VarO.f();
                    if (z5) {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    } else {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                    ox6 ox6Var13 = ox6Var2;
                    oh4<? super List<? extends Uri>, g2b> oh4Var11115 = oh4Var10;
                    bj4Var = bj4VarO;
                    q39.a(ox6Var13, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var11113, oh4Var11114, oh4Var11115, mh4Var2, context, eh6VarF10, vs2Var, t72Var10), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                    oh4Var12 = oh4Var11;
                    oh4Var13 = oh4Var11115;
                    mh4Var4 = mh4Var2;
                    ox6Var3 = ox6Var13;
                    oh4Var14 = oh4Var11113;
                    oh4Var15 = oh4Var11114;
                    str4 = str3;
                } else {
                    if (i16 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i17 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    } else {
                        str3 = str2;
                    }
                    i14 = 0;
                    c0187a = jt1.a.a;
                    i15 = 1;
                    if (i4 != 0) {
                        bj4VarO.K(-404731513);
                        objF10 = bj4VarO.f();
                        if (objF10 == c0187a) {
                            objF10 = new t42(i15);
                            bj4VarO.C(objF10);
                        }
                        oh4Var8 = (oh4) objF10;
                        bj4VarO.U(false);
                    } else {
                        oh4Var8 = oh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-404729561);
                        objF9 = bj4VarO.f();
                        if (objF9 == c0187a) {
                            objF9 = new w47(i15);
                            bj4VarO.C(objF9);
                        }
                        oh4Var9 = (oh4) objF9;
                        bj4VarO.U(false);
                    } else {
                        oh4Var9 = oh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-404727993);
                        objF8 = bj4VarO.f();
                        if (objF8 == c0187a) {
                            objF8 = new z74(i15);
                            bj4VarO.C(objF8);
                        }
                        oh4Var10 = (oh4) objF8;
                        bj4VarO.U(false);
                    } else {
                        oh4Var10 = oh4Var7;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-404726777);
                        objF7 = bj4VarO.f();
                        if (objF7 == c0187a) {
                            objF7 = new t88(i14);
                            bj4VarO.C(objF7);
                        }
                        mh4Var2 = (mh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-404725465);
                        objF6 = bj4VarO.f();
                        if (objF6 == c0187a) {
                            objF6 = new mn1(3);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    } else {
                        oh4Var11 = oh4Var4;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var11 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72 t72Var11 = (t72) objF;
                    currentPage = previewUiState.getCurrentPage();
                    bj4VarO.K(-404718523);
                    zJ = bj4VarO.j(previewUiState);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var3 = (mh4) objF2;
                    bj4VarO.U(false);
                    hr7.b bVar11 = hr7.a;
                    oh4<? super List<? extends Uri>, g2b> oh4Var11116 = oh4Var8;
                    Object[] objArr11 = new Object[0];
                    au3 au3Var11 = vs2.G;
                    zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                    oh4<? super IntercomPreviewFile, g2b> oh4Var11117 = oh4Var9;
                    objF3 = bj4VarO.f();
                    if (zH) {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    vs2Var = (vs2) mm8.e(objArr11, au3Var11, (mh4) objF3, bj4VarO, 0);
                    vs2Var.F.setValue(mh4Var3);
                    t9 t9Var11 = new t9();
                    bj4VarO.K(-404713349);
                    if ((3670016 & i3) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zJ112 = z | bj4VarO.j(context);
                    if ((i3 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = zJ112 | z2;
                    objF4 = bj4VarO.f();
                    if (z3) {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    eh6 eh6VarF11 = ia.f(t9Var11, (oh4) objF4, bj4VarO);
                    bj4VarO.K(-404705280);
                    boolean zJ113 = bj4VarO.J(vs2Var);
                    if ((29360128 & i3) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zJ113 | z4;
                    objF5 = bj4VarO.f();
                    if (z5) {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    } else {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                    ox6 ox6Var14 = ox6Var2;
                    oh4<? super List<? extends Uri>, g2b> oh4Var11118 = oh4Var10;
                    bj4Var = bj4VarO;
                    q39.a(ox6Var14, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var11116, oh4Var11117, oh4Var11118, mh4Var2, context, eh6VarF11, vs2Var, t72Var11), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                    oh4Var12 = oh4Var11;
                    oh4Var13 = oh4Var11118;
                    mh4Var4 = mh4Var2;
                    ox6Var3 = ox6Var14;
                    oh4Var14 = oh4Var11116;
                    oh4Var15 = oh4Var11117;
                    str4 = str3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: w88
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$19(ox6Var3, previewUiState, str4, oh4Var14, oh4Var15, oh4Var13, mh4Var4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            oh4Var6 = oh4Var2;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    oh4Var7 = oh4Var3;
                    if (bj4VarO.j(oh4Var7)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    mh4Var2 = mh4Var;
                } else {
                    mh4Var2 = mh4Var;
                    if ((i & 1572864) == 0) {
                        if (bj4VarO.j(mh4Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (bj4VarO.j(oh4Var4)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i16 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i17 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    } else {
                        str3 = str2;
                    }
                    i14 = 0;
                    c0187a = jt1.a.a;
                    i15 = 1;
                    if (i4 != 0) {
                        bj4VarO.K(-404731513);
                        objF10 = bj4VarO.f();
                        if (objF10 == c0187a) {
                            objF10 = new t42(i15);
                            bj4VarO.C(objF10);
                        }
                        oh4Var8 = (oh4) objF10;
                        bj4VarO.U(false);
                    } else {
                        oh4Var8 = oh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-404729561);
                        objF9 = bj4VarO.f();
                        if (objF9 == c0187a) {
                            objF9 = new w47(i15);
                            bj4VarO.C(objF9);
                        }
                        oh4Var9 = (oh4) objF9;
                        bj4VarO.U(false);
                    } else {
                        oh4Var9 = oh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-404727993);
                        objF8 = bj4VarO.f();
                        if (objF8 == c0187a) {
                            objF8 = new z74(i15);
                            bj4VarO.C(objF8);
                        }
                        oh4Var10 = (oh4) objF8;
                        bj4VarO.U(false);
                    } else {
                        oh4Var10 = oh4Var7;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-404726777);
                        objF7 = bj4VarO.f();
                        if (objF7 == c0187a) {
                            objF7 = new t88(i14);
                            bj4VarO.C(objF7);
                        }
                        mh4Var2 = (mh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-404725465);
                        objF6 = bj4VarO.f();
                        if (objF6 == c0187a) {
                            objF6 = new mn1(3);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    } else {
                        oh4Var11 = oh4Var4;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var12 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72 t72Var12 = (t72) objF;
                    currentPage = previewUiState.getCurrentPage();
                    bj4VarO.K(-404718523);
                    zJ = bj4VarO.j(previewUiState);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var3 = (mh4) objF2;
                    bj4VarO.U(false);
                    hr7.b bVar12 = hr7.a;
                    oh4<? super List<? extends Uri>, g2b> oh4Var11119 = oh4Var8;
                    Object[] objArr12 = new Object[0];
                    au3 au3Var12 = vs2.G;
                    zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                    oh4<? super IntercomPreviewFile, g2b> oh4Var111110 = oh4Var9;
                    objF3 = bj4VarO.f();
                    if (zH) {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    vs2Var = (vs2) mm8.e(objArr12, au3Var12, (mh4) objF3, bj4VarO, 0);
                    vs2Var.F.setValue(mh4Var3);
                    t9 t9Var12 = new t9();
                    bj4VarO.K(-404713349);
                    if ((3670016 & i3) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zJ114 = z | bj4VarO.j(context);
                    if ((i3 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = zJ114 | z2;
                    objF4 = bj4VarO.f();
                    if (z3) {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    eh6 eh6VarF12 = ia.f(t9Var12, (oh4) objF4, bj4VarO);
                    bj4VarO.K(-404705280);
                    boolean zJ115 = bj4VarO.J(vs2Var);
                    if ((29360128 & i3) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zJ115 | z4;
                    objF5 = bj4VarO.f();
                    if (z5) {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    } else {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                    ox6 ox6Var15 = ox6Var2;
                    oh4<? super List<? extends Uri>, g2b> oh4Var111111 = oh4Var10;
                    bj4Var = bj4VarO;
                    q39.a(ox6Var15, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var11119, oh4Var111110, oh4Var111111, mh4Var2, context, eh6VarF12, vs2Var, t72Var12), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                    oh4Var12 = oh4Var11;
                    oh4Var13 = oh4Var111111;
                    mh4Var4 = mh4Var2;
                    ox6Var3 = ox6Var15;
                    oh4Var14 = oh4Var11119;
                    oh4Var15 = oh4Var111110;
                    str4 = str3;
                } else {
                    if (i16 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i17 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    } else {
                        str3 = str2;
                    }
                    i14 = 0;
                    c0187a = jt1.a.a;
                    i15 = 1;
                    if (i4 != 0) {
                        bj4VarO.K(-404731513);
                        objF10 = bj4VarO.f();
                        if (objF10 == c0187a) {
                            objF10 = new t42(i15);
                            bj4VarO.C(objF10);
                        }
                        oh4Var8 = (oh4) objF10;
                        bj4VarO.U(false);
                    } else {
                        oh4Var8 = oh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-404729561);
                        objF9 = bj4VarO.f();
                        if (objF9 == c0187a) {
                            objF9 = new w47(i15);
                            bj4VarO.C(objF9);
                        }
                        oh4Var9 = (oh4) objF9;
                        bj4VarO.U(false);
                    } else {
                        oh4Var9 = oh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-404727993);
                        objF8 = bj4VarO.f();
                        if (objF8 == c0187a) {
                            objF8 = new z74(i15);
                            bj4VarO.C(objF8);
                        }
                        oh4Var10 = (oh4) objF8;
                        bj4VarO.U(false);
                    } else {
                        oh4Var10 = oh4Var7;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-404726777);
                        objF7 = bj4VarO.f();
                        if (objF7 == c0187a) {
                            objF7 = new t88(i14);
                            bj4VarO.C(objF7);
                        }
                        mh4Var2 = (mh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-404725465);
                        objF6 = bj4VarO.f();
                        if (objF6 == c0187a) {
                            objF6 = new mn1(3);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    } else {
                        oh4Var11 = oh4Var4;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var13 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72 t72Var13 = (t72) objF;
                    currentPage = previewUiState.getCurrentPage();
                    bj4VarO.K(-404718523);
                    zJ = bj4VarO.j(previewUiState);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var3 = (mh4) objF2;
                    bj4VarO.U(false);
                    hr7.b bVar13 = hr7.a;
                    oh4<? super List<? extends Uri>, g2b> oh4Var111112 = oh4Var8;
                    Object[] objArr13 = new Object[0];
                    au3 au3Var13 = vs2.G;
                    zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                    oh4<? super IntercomPreviewFile, g2b> oh4Var111113 = oh4Var9;
                    objF3 = bj4VarO.f();
                    if (zH) {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    vs2Var = (vs2) mm8.e(objArr13, au3Var13, (mh4) objF3, bj4VarO, 0);
                    vs2Var.F.setValue(mh4Var3);
                    t9 t9Var13 = new t9();
                    bj4VarO.K(-404713349);
                    if ((3670016 & i3) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zJ116 = z | bj4VarO.j(context);
                    if ((i3 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = zJ116 | z2;
                    objF4 = bj4VarO.f();
                    if (z3) {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    eh6 eh6VarF13 = ia.f(t9Var13, (oh4) objF4, bj4VarO);
                    bj4VarO.K(-404705280);
                    boolean zJ117 = bj4VarO.J(vs2Var);
                    if ((29360128 & i3) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zJ117 | z4;
                    objF5 = bj4VarO.f();
                    if (z5) {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    } else {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                    ox6 ox6Var16 = ox6Var2;
                    oh4<? super List<? extends Uri>, g2b> oh4Var111114 = oh4Var10;
                    bj4Var = bj4VarO;
                    q39.a(ox6Var16, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var111112, oh4Var111113, oh4Var111114, mh4Var2, context, eh6VarF13, vs2Var, t72Var13), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                    oh4Var12 = oh4Var11;
                    oh4Var13 = oh4Var111114;
                    mh4Var4 = mh4Var2;
                    ox6Var3 = ox6Var16;
                    oh4Var14 = oh4Var111112;
                    oh4Var15 = oh4Var111113;
                    str4 = str3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: w88
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$19(ox6Var3, previewUiState, str4, oh4Var14, oh4Var15, oh4Var13, mh4Var4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            oh4Var7 = oh4Var3;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                mh4Var2 = mh4Var;
            } else {
                mh4Var2 = mh4Var;
                if ((i & 1572864) == 0) {
                    if (bj4VarO.j(mh4Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (bj4VarO.j(oh4Var4)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            if ((i3 & 4793491) == 4793490) {
                if (i16 != 0) {
                    ox6Var2 = ox6.a.t;
                } else {
                    ox6Var2 = ox6Var;
                }
                if (i17 != 0) {
                    str3 = BuildConfig.FLAVOR;
                } else {
                    str3 = str2;
                }
                i14 = 0;
                c0187a = jt1.a.a;
                i15 = 1;
                if (i4 != 0) {
                    bj4VarO.K(-404731513);
                    objF10 = bj4VarO.f();
                    if (objF10 == c0187a) {
                        objF10 = new t42(i15);
                        bj4VarO.C(objF10);
                    }
                    oh4Var8 = (oh4) objF10;
                    bj4VarO.U(false);
                } else {
                    oh4Var8 = oh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(-404729561);
                    objF9 = bj4VarO.f();
                    if (objF9 == c0187a) {
                        objF9 = new w47(i15);
                        bj4VarO.C(objF9);
                    }
                    oh4Var9 = (oh4) objF9;
                    bj4VarO.U(false);
                } else {
                    oh4Var9 = oh4Var6;
                }
                if (i8 != 0) {
                    bj4VarO.K(-404727993);
                    objF8 = bj4VarO.f();
                    if (objF8 == c0187a) {
                        objF8 = new z74(i15);
                        bj4VarO.C(objF8);
                    }
                    oh4Var10 = (oh4) objF8;
                    bj4VarO.U(false);
                } else {
                    oh4Var10 = oh4Var7;
                }
                if (i10 != 0) {
                    bj4VarO.K(-404726777);
                    objF7 = bj4VarO.f();
                    if (objF7 == c0187a) {
                        objF7 = new t88(i14);
                        bj4VarO.C(objF7);
                    }
                    mh4Var2 = (mh4) objF7;
                    bj4VarO.U(false);
                }
                if (i12 != 0) {
                    bj4VarO.K(-404725465);
                    objF6 = bj4VarO.f();
                    if (objF6 == c0187a) {
                        objF6 = new mn1(3);
                        bj4VarO.C(objF6);
                    }
                    oh4Var11 = (oh4) objF6;
                    bj4VarO.U(false);
                } else {
                    oh4Var11 = oh4Var4;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    c33 c33Var14 = wd3.a;
                    objF = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72 t72Var14 = (t72) objF;
                currentPage = previewUiState.getCurrentPage();
                bj4VarO.K(-404718523);
                zJ = bj4VarO.j(previewUiState);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: u88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: u88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                        }
                    };
                    bj4VarO.C(objF2);
                }
                mh4Var3 = (mh4) objF2;
                bj4VarO.U(false);
                hr7.b bVar14 = hr7.a;
                oh4<? super List<? extends Uri>, g2b> oh4Var111115 = oh4Var8;
                Object[] objArr14 = new Object[0];
                au3 au3Var14 = vs2.G;
                zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                oh4<? super IntercomPreviewFile, g2b> oh4Var111116 = oh4Var9;
                objF3 = bj4VarO.f();
                if (zH) {
                    objF3 = new mh4() { // from class: fr7
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return new vs2(currentPage, 0.0f, mh4Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mh4() { // from class: fr7
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return new vs2(currentPage, 0.0f, mh4Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                vs2Var = (vs2) mm8.e(objArr14, au3Var14, (mh4) objF3, bj4VarO, 0);
                vs2Var.F.setValue(mh4Var3);
                t9 t9Var14 = new t9();
                bj4VarO.K(-404713349);
                if ((3670016 & i3) == 1048576) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zJ118 = z | bj4VarO.j(context);
                if ((i3 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = zJ118 | z2;
                objF4 = bj4VarO.f();
                if (z3) {
                    objF4 = new oh4() { // from class: v88
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    objF4 = new oh4() { // from class: v88
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                eh6 eh6VarF14 = ia.f(t9Var14, (oh4) objF4, bj4VarO);
                bj4VarO.K(-404705280);
                boolean zJ119 = bj4VarO.J(vs2Var);
                if ((29360128 & i3) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zJ119 | z4;
                objF5 = bj4VarO.f();
                if (z5) {
                    objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                    bj4VarO.C(objF5);
                } else {
                    objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                    bj4VarO.C(objF5);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                ox6 ox6Var17 = ox6Var2;
                oh4<? super List<? extends Uri>, g2b> oh4Var111117 = oh4Var10;
                bj4Var = bj4VarO;
                q39.a(ox6Var17, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var111115, oh4Var111116, oh4Var111117, mh4Var2, context, eh6VarF14, vs2Var, t72Var14), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                oh4Var12 = oh4Var11;
                oh4Var13 = oh4Var111117;
                mh4Var4 = mh4Var2;
                ox6Var3 = ox6Var17;
                oh4Var14 = oh4Var111115;
                oh4Var15 = oh4Var111116;
                str4 = str3;
            } else {
                if (i16 != 0) {
                    ox6Var2 = ox6.a.t;
                } else {
                    ox6Var2 = ox6Var;
                }
                if (i17 != 0) {
                    str3 = BuildConfig.FLAVOR;
                } else {
                    str3 = str2;
                }
                i14 = 0;
                c0187a = jt1.a.a;
                i15 = 1;
                if (i4 != 0) {
                    bj4VarO.K(-404731513);
                    objF10 = bj4VarO.f();
                    if (objF10 == c0187a) {
                        objF10 = new t42(i15);
                        bj4VarO.C(objF10);
                    }
                    oh4Var8 = (oh4) objF10;
                    bj4VarO.U(false);
                } else {
                    oh4Var8 = oh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(-404729561);
                    objF9 = bj4VarO.f();
                    if (objF9 == c0187a) {
                        objF9 = new w47(i15);
                        bj4VarO.C(objF9);
                    }
                    oh4Var9 = (oh4) objF9;
                    bj4VarO.U(false);
                } else {
                    oh4Var9 = oh4Var6;
                }
                if (i8 != 0) {
                    bj4VarO.K(-404727993);
                    objF8 = bj4VarO.f();
                    if (objF8 == c0187a) {
                        objF8 = new z74(i15);
                        bj4VarO.C(objF8);
                    }
                    oh4Var10 = (oh4) objF8;
                    bj4VarO.U(false);
                } else {
                    oh4Var10 = oh4Var7;
                }
                if (i10 != 0) {
                    bj4VarO.K(-404726777);
                    objF7 = bj4VarO.f();
                    if (objF7 == c0187a) {
                        objF7 = new t88(i14);
                        bj4VarO.C(objF7);
                    }
                    mh4Var2 = (mh4) objF7;
                    bj4VarO.U(false);
                }
                if (i12 != 0) {
                    bj4VarO.K(-404725465);
                    objF6 = bj4VarO.f();
                    if (objF6 == c0187a) {
                        objF6 = new mn1(3);
                        bj4VarO.C(objF6);
                    }
                    oh4Var11 = (oh4) objF6;
                    bj4VarO.U(false);
                } else {
                    oh4Var11 = oh4Var4;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    c33 c33Var15 = wd3.a;
                    objF = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72 t72Var15 = (t72) objF;
                currentPage = previewUiState.getCurrentPage();
                bj4VarO.K(-404718523);
                zJ = bj4VarO.j(previewUiState);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: u88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: u88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                        }
                    };
                    bj4VarO.C(objF2);
                }
                mh4Var3 = (mh4) objF2;
                bj4VarO.U(false);
                hr7.b bVar15 = hr7.a;
                oh4<? super List<? extends Uri>, g2b> oh4Var111118 = oh4Var8;
                Object[] objArr15 = new Object[0];
                au3 au3Var15 = vs2.G;
                zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                oh4<? super IntercomPreviewFile, g2b> oh4Var111119 = oh4Var9;
                objF3 = bj4VarO.f();
                if (zH) {
                    objF3 = new mh4() { // from class: fr7
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return new vs2(currentPage, 0.0f, mh4Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mh4() { // from class: fr7
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return new vs2(currentPage, 0.0f, mh4Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                vs2Var = (vs2) mm8.e(objArr15, au3Var15, (mh4) objF3, bj4VarO, 0);
                vs2Var.F.setValue(mh4Var3);
                t9 t9Var15 = new t9();
                bj4VarO.K(-404713349);
                if ((3670016 & i3) == 1048576) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zJ1110 = z | bj4VarO.j(context);
                if ((i3 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = zJ1110 | z2;
                objF4 = bj4VarO.f();
                if (z3) {
                    objF4 = new oh4() { // from class: v88
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    objF4 = new oh4() { // from class: v88
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                eh6 eh6VarF15 = ia.f(t9Var15, (oh4) objF4, bj4VarO);
                bj4VarO.K(-404705280);
                boolean zJ1111 = bj4VarO.J(vs2Var);
                if ((29360128 & i3) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zJ1111 | z4;
                objF5 = bj4VarO.f();
                if (z5) {
                    objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                    bj4VarO.C(objF5);
                } else {
                    objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                    bj4VarO.C(objF5);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                ox6 ox6Var18 = ox6Var2;
                oh4<? super List<? extends Uri>, g2b> oh4Var1111110 = oh4Var10;
                bj4Var = bj4VarO;
                q39.a(ox6Var18, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var111118, oh4Var111119, oh4Var1111110, mh4Var2, context, eh6VarF15, vs2Var, t72Var15), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                oh4Var12 = oh4Var11;
                oh4Var13 = oh4Var1111110;
                mh4Var4 = mh4Var2;
                ox6Var3 = ox6Var18;
                oh4Var14 = oh4Var111118;
                oh4Var15 = oh4Var111119;
                str4 = str3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: w88
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PreviewRootScreenKt.PreviewRootScreenContent$lambda$19(ox6Var3, previewUiState, str4, oh4Var14, oh4Var15, oh4Var13, mh4Var4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        str2 = str;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                oh4Var5 = oh4Var;
                if (bj4VarO.j(oh4Var5)) {
                    i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    oh4Var6 = oh4Var2;
                    if (bj4VarO.j(oh4Var6)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        oh4Var7 = oh4Var3;
                        if (bj4VarO.j(oh4Var7)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                        mh4Var2 = mh4Var;
                    } else {
                        mh4Var2 = mh4Var;
                        if ((i & 1572864) == 0) {
                            if (bj4VarO.j(mh4Var2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (bj4VarO.j(oh4Var4)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        if (i16 != 0) {
                            ox6Var2 = ox6.a.t;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i17 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        } else {
                            str3 = str2;
                        }
                        i14 = 0;
                        c0187a = jt1.a.a;
                        i15 = 1;
                        if (i4 != 0) {
                            bj4VarO.K(-404731513);
                            objF10 = bj4VarO.f();
                            if (objF10 == c0187a) {
                                objF10 = new t42(i15);
                                bj4VarO.C(objF10);
                            }
                            oh4Var8 = (oh4) objF10;
                            bj4VarO.U(false);
                        } else {
                            oh4Var8 = oh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-404729561);
                            objF9 = bj4VarO.f();
                            if (objF9 == c0187a) {
                                objF9 = new w47(i15);
                                bj4VarO.C(objF9);
                            }
                            oh4Var9 = (oh4) objF9;
                            bj4VarO.U(false);
                        } else {
                            oh4Var9 = oh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-404727993);
                            objF8 = bj4VarO.f();
                            if (objF8 == c0187a) {
                                objF8 = new z74(i15);
                                bj4VarO.C(objF8);
                            }
                            oh4Var10 = (oh4) objF8;
                            bj4VarO.U(false);
                        } else {
                            oh4Var10 = oh4Var7;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-404726777);
                            objF7 = bj4VarO.f();
                            if (objF7 == c0187a) {
                                objF7 = new t88(i14);
                                bj4VarO.C(objF7);
                            }
                            mh4Var2 = (mh4) objF7;
                            bj4VarO.U(false);
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-404725465);
                            objF6 = bj4VarO.f();
                            if (objF6 == c0187a) {
                                objF6 = new mn1(3);
                                bj4VarO.C(objF6);
                            }
                            oh4Var11 = (oh4) objF6;
                            bj4VarO.U(false);
                        } else {
                            oh4Var11 = oh4Var4;
                        }
                        context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var16 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72 t72Var16 = (t72) objF;
                        currentPage = previewUiState.getCurrentPage();
                        bj4VarO.K(-404718523);
                        zJ = bj4VarO.j(previewUiState);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: u88
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: u88
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var3 = (mh4) objF2;
                        bj4VarO.U(false);
                        hr7.b bVar16 = hr7.a;
                        oh4<? super List<? extends Uri>, g2b> oh4Var1111111 = oh4Var8;
                        Object[] objArr16 = new Object[0];
                        au3 au3Var16 = vs2.G;
                        zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                        oh4<? super IntercomPreviewFile, g2b> oh4Var1111112 = oh4Var9;
                        objF3 = bj4VarO.f();
                        if (zH) {
                            objF3 = new mh4() { // from class: fr7
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return new vs2(currentPage, 0.0f, mh4Var3);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new mh4() { // from class: fr7
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return new vs2(currentPage, 0.0f, mh4Var3);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        vs2Var = (vs2) mm8.e(objArr16, au3Var16, (mh4) objF3, bj4VarO, 0);
                        vs2Var.F.setValue(mh4Var3);
                        t9 t9Var16 = new t9();
                        bj4VarO.K(-404713349);
                        if ((3670016 & i3) == 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean zJ1112 = z | bj4VarO.j(context);
                        if ((i3 & 896) == 256) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = zJ1112 | z2;
                        objF4 = bj4VarO.f();
                        if (z3) {
                            objF4 = new oh4() { // from class: v88
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                                }
                            };
                            bj4VarO.C(objF4);
                        } else {
                            objF4 = new oh4() { // from class: v88
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                                }
                            };
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        eh6 eh6VarF16 = ia.f(t9Var16, (oh4) objF4, bj4VarO);
                        bj4VarO.K(-404705280);
                        boolean zJ1113 = bj4VarO.J(vs2Var);
                        if ((29360128 & i3) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = zJ1113 | z4;
                        objF5 = bj4VarO.f();
                        if (z5) {
                            objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                            bj4VarO.C(objF5);
                        } else {
                            objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                        ox6 ox6Var19 = ox6Var2;
                        oh4<? super List<? extends Uri>, g2b> oh4Var1111113 = oh4Var10;
                        bj4Var = bj4VarO;
                        q39.a(ox6Var19, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var1111111, oh4Var1111112, oh4Var1111113, mh4Var2, context, eh6VarF16, vs2Var, t72Var16), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                        oh4Var12 = oh4Var11;
                        oh4Var13 = oh4Var1111113;
                        mh4Var4 = mh4Var2;
                        ox6Var3 = ox6Var19;
                        oh4Var14 = oh4Var1111111;
                        oh4Var15 = oh4Var1111112;
                        str4 = str3;
                    } else {
                        if (i16 != 0) {
                            ox6Var2 = ox6.a.t;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i17 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        } else {
                            str3 = str2;
                        }
                        i14 = 0;
                        c0187a = jt1.a.a;
                        i15 = 1;
                        if (i4 != 0) {
                            bj4VarO.K(-404731513);
                            objF10 = bj4VarO.f();
                            if (objF10 == c0187a) {
                                objF10 = new t42(i15);
                                bj4VarO.C(objF10);
                            }
                            oh4Var8 = (oh4) objF10;
                            bj4VarO.U(false);
                        } else {
                            oh4Var8 = oh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-404729561);
                            objF9 = bj4VarO.f();
                            if (objF9 == c0187a) {
                                objF9 = new w47(i15);
                                bj4VarO.C(objF9);
                            }
                            oh4Var9 = (oh4) objF9;
                            bj4VarO.U(false);
                        } else {
                            oh4Var9 = oh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-404727993);
                            objF8 = bj4VarO.f();
                            if (objF8 == c0187a) {
                                objF8 = new z74(i15);
                                bj4VarO.C(objF8);
                            }
                            oh4Var10 = (oh4) objF8;
                            bj4VarO.U(false);
                        } else {
                            oh4Var10 = oh4Var7;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-404726777);
                            objF7 = bj4VarO.f();
                            if (objF7 == c0187a) {
                                objF7 = new t88(i14);
                                bj4VarO.C(objF7);
                            }
                            mh4Var2 = (mh4) objF7;
                            bj4VarO.U(false);
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-404725465);
                            objF6 = bj4VarO.f();
                            if (objF6 == c0187a) {
                                objF6 = new mn1(3);
                                bj4VarO.C(objF6);
                            }
                            oh4Var11 = (oh4) objF6;
                            bj4VarO.U(false);
                        } else {
                            oh4Var11 = oh4Var4;
                        }
                        context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var17 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72 t72Var17 = (t72) objF;
                        currentPage = previewUiState.getCurrentPage();
                        bj4VarO.K(-404718523);
                        zJ = bj4VarO.j(previewUiState);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: u88
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: u88
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var3 = (mh4) objF2;
                        bj4VarO.U(false);
                        hr7.b bVar17 = hr7.a;
                        oh4<? super List<? extends Uri>, g2b> oh4Var1111114 = oh4Var8;
                        Object[] objArr17 = new Object[0];
                        au3 au3Var17 = vs2.G;
                        zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                        oh4<? super IntercomPreviewFile, g2b> oh4Var1111115 = oh4Var9;
                        objF3 = bj4VarO.f();
                        if (zH) {
                            objF3 = new mh4() { // from class: fr7
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return new vs2(currentPage, 0.0f, mh4Var3);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new mh4() { // from class: fr7
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return new vs2(currentPage, 0.0f, mh4Var3);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        vs2Var = (vs2) mm8.e(objArr17, au3Var17, (mh4) objF3, bj4VarO, 0);
                        vs2Var.F.setValue(mh4Var3);
                        t9 t9Var17 = new t9();
                        bj4VarO.K(-404713349);
                        if ((3670016 & i3) == 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean zJ1114 = z | bj4VarO.j(context);
                        if ((i3 & 896) == 256) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = zJ1114 | z2;
                        objF4 = bj4VarO.f();
                        if (z3) {
                            objF4 = new oh4() { // from class: v88
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                                }
                            };
                            bj4VarO.C(objF4);
                        } else {
                            objF4 = new oh4() { // from class: v88
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                                }
                            };
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        eh6 eh6VarF17 = ia.f(t9Var17, (oh4) objF4, bj4VarO);
                        bj4VarO.K(-404705280);
                        boolean zJ1115 = bj4VarO.J(vs2Var);
                        if ((29360128 & i3) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = zJ1115 | z4;
                        objF5 = bj4VarO.f();
                        if (z5) {
                            objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                            bj4VarO.C(objF5);
                        } else {
                            objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                        ox6 ox6Var110 = ox6Var2;
                        oh4<? super List<? extends Uri>, g2b> oh4Var1111116 = oh4Var10;
                        bj4Var = bj4VarO;
                        q39.a(ox6Var110, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var1111114, oh4Var1111115, oh4Var1111116, mh4Var2, context, eh6VarF17, vs2Var, t72Var17), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                        oh4Var12 = oh4Var11;
                        oh4Var13 = oh4Var1111116;
                        mh4Var4 = mh4Var2;
                        ox6Var3 = ox6Var110;
                        oh4Var14 = oh4Var1111114;
                        oh4Var15 = oh4Var1111115;
                        str4 = str3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: w88
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$19(ox6Var3, previewUiState, str4, oh4Var14, oh4Var15, oh4Var13, mh4Var4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                oh4Var7 = oh4Var3;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    mh4Var2 = mh4Var;
                } else {
                    mh4Var2 = mh4Var;
                    if ((i & 1572864) == 0) {
                        if (bj4VarO.j(mh4Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (bj4VarO.j(oh4Var4)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i16 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i17 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    } else {
                        str3 = str2;
                    }
                    i14 = 0;
                    c0187a = jt1.a.a;
                    i15 = 1;
                    if (i4 != 0) {
                        bj4VarO.K(-404731513);
                        objF10 = bj4VarO.f();
                        if (objF10 == c0187a) {
                            objF10 = new t42(i15);
                            bj4VarO.C(objF10);
                        }
                        oh4Var8 = (oh4) objF10;
                        bj4VarO.U(false);
                    } else {
                        oh4Var8 = oh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-404729561);
                        objF9 = bj4VarO.f();
                        if (objF9 == c0187a) {
                            objF9 = new w47(i15);
                            bj4VarO.C(objF9);
                        }
                        oh4Var9 = (oh4) objF9;
                        bj4VarO.U(false);
                    } else {
                        oh4Var9 = oh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-404727993);
                        objF8 = bj4VarO.f();
                        if (objF8 == c0187a) {
                            objF8 = new z74(i15);
                            bj4VarO.C(objF8);
                        }
                        oh4Var10 = (oh4) objF8;
                        bj4VarO.U(false);
                    } else {
                        oh4Var10 = oh4Var7;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-404726777);
                        objF7 = bj4VarO.f();
                        if (objF7 == c0187a) {
                            objF7 = new t88(i14);
                            bj4VarO.C(objF7);
                        }
                        mh4Var2 = (mh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-404725465);
                        objF6 = bj4VarO.f();
                        if (objF6 == c0187a) {
                            objF6 = new mn1(3);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    } else {
                        oh4Var11 = oh4Var4;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var18 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72 t72Var18 = (t72) objF;
                    currentPage = previewUiState.getCurrentPage();
                    bj4VarO.K(-404718523);
                    zJ = bj4VarO.j(previewUiState);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var3 = (mh4) objF2;
                    bj4VarO.U(false);
                    hr7.b bVar18 = hr7.a;
                    oh4<? super List<? extends Uri>, g2b> oh4Var1111117 = oh4Var8;
                    Object[] objArr18 = new Object[0];
                    au3 au3Var18 = vs2.G;
                    zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                    oh4<? super IntercomPreviewFile, g2b> oh4Var1111118 = oh4Var9;
                    objF3 = bj4VarO.f();
                    if (zH) {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    vs2Var = (vs2) mm8.e(objArr18, au3Var18, (mh4) objF3, bj4VarO, 0);
                    vs2Var.F.setValue(mh4Var3);
                    t9 t9Var18 = new t9();
                    bj4VarO.K(-404713349);
                    if ((3670016 & i3) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zJ1116 = z | bj4VarO.j(context);
                    if ((i3 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = zJ1116 | z2;
                    objF4 = bj4VarO.f();
                    if (z3) {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    eh6 eh6VarF18 = ia.f(t9Var18, (oh4) objF4, bj4VarO);
                    bj4VarO.K(-404705280);
                    boolean zJ1117 = bj4VarO.J(vs2Var);
                    if ((29360128 & i3) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zJ1117 | z4;
                    objF5 = bj4VarO.f();
                    if (z5) {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    } else {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                    ox6 ox6Var111 = ox6Var2;
                    oh4<? super List<? extends Uri>, g2b> oh4Var1111119 = oh4Var10;
                    bj4Var = bj4VarO;
                    q39.a(ox6Var111, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var1111117, oh4Var1111118, oh4Var1111119, mh4Var2, context, eh6VarF18, vs2Var, t72Var18), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                    oh4Var12 = oh4Var11;
                    oh4Var13 = oh4Var1111119;
                    mh4Var4 = mh4Var2;
                    ox6Var3 = ox6Var111;
                    oh4Var14 = oh4Var1111117;
                    oh4Var15 = oh4Var1111118;
                    str4 = str3;
                } else {
                    if (i16 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i17 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    } else {
                        str3 = str2;
                    }
                    i14 = 0;
                    c0187a = jt1.a.a;
                    i15 = 1;
                    if (i4 != 0) {
                        bj4VarO.K(-404731513);
                        objF10 = bj4VarO.f();
                        if (objF10 == c0187a) {
                            objF10 = new t42(i15);
                            bj4VarO.C(objF10);
                        }
                        oh4Var8 = (oh4) objF10;
                        bj4VarO.U(false);
                    } else {
                        oh4Var8 = oh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-404729561);
                        objF9 = bj4VarO.f();
                        if (objF9 == c0187a) {
                            objF9 = new w47(i15);
                            bj4VarO.C(objF9);
                        }
                        oh4Var9 = (oh4) objF9;
                        bj4VarO.U(false);
                    } else {
                        oh4Var9 = oh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-404727993);
                        objF8 = bj4VarO.f();
                        if (objF8 == c0187a) {
                            objF8 = new z74(i15);
                            bj4VarO.C(objF8);
                        }
                        oh4Var10 = (oh4) objF8;
                        bj4VarO.U(false);
                    } else {
                        oh4Var10 = oh4Var7;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-404726777);
                        objF7 = bj4VarO.f();
                        if (objF7 == c0187a) {
                            objF7 = new t88(i14);
                            bj4VarO.C(objF7);
                        }
                        mh4Var2 = (mh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-404725465);
                        objF6 = bj4VarO.f();
                        if (objF6 == c0187a) {
                            objF6 = new mn1(3);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    } else {
                        oh4Var11 = oh4Var4;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var19 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72 t72Var19 = (t72) objF;
                    currentPage = previewUiState.getCurrentPage();
                    bj4VarO.K(-404718523);
                    zJ = bj4VarO.j(previewUiState);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var3 = (mh4) objF2;
                    bj4VarO.U(false);
                    hr7.b bVar19 = hr7.a;
                    oh4<? super List<? extends Uri>, g2b> oh4Var11111110 = oh4Var8;
                    Object[] objArr19 = new Object[0];
                    au3 au3Var19 = vs2.G;
                    zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                    oh4<? super IntercomPreviewFile, g2b> oh4Var11111111 = oh4Var9;
                    objF3 = bj4VarO.f();
                    if (zH) {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    vs2Var = (vs2) mm8.e(objArr19, au3Var19, (mh4) objF3, bj4VarO, 0);
                    vs2Var.F.setValue(mh4Var3);
                    t9 t9Var19 = new t9();
                    bj4VarO.K(-404713349);
                    if ((3670016 & i3) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zJ1118 = z | bj4VarO.j(context);
                    if ((i3 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = zJ1118 | z2;
                    objF4 = bj4VarO.f();
                    if (z3) {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    eh6 eh6VarF19 = ia.f(t9Var19, (oh4) objF4, bj4VarO);
                    bj4VarO.K(-404705280);
                    boolean zJ1119 = bj4VarO.J(vs2Var);
                    if ((29360128 & i3) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zJ1119 | z4;
                    objF5 = bj4VarO.f();
                    if (z5) {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    } else {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                    ox6 ox6Var112 = ox6Var2;
                    oh4<? super List<? extends Uri>, g2b> oh4Var11111112 = oh4Var10;
                    bj4Var = bj4VarO;
                    q39.a(ox6Var112, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var11111110, oh4Var11111111, oh4Var11111112, mh4Var2, context, eh6VarF19, vs2Var, t72Var19), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                    oh4Var12 = oh4Var11;
                    oh4Var13 = oh4Var11111112;
                    mh4Var4 = mh4Var2;
                    ox6Var3 = ox6Var112;
                    oh4Var14 = oh4Var11111110;
                    oh4Var15 = oh4Var11111111;
                    str4 = str3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: w88
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$19(ox6Var3, previewUiState, str4, oh4Var14, oh4Var15, oh4Var13, mh4Var4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            oh4Var6 = oh4Var2;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    oh4Var7 = oh4Var3;
                    if (bj4VarO.j(oh4Var7)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    mh4Var2 = mh4Var;
                } else {
                    mh4Var2 = mh4Var;
                    if ((i & 1572864) == 0) {
                        if (bj4VarO.j(mh4Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (bj4VarO.j(oh4Var4)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i16 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i17 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    } else {
                        str3 = str2;
                    }
                    i14 = 0;
                    c0187a = jt1.a.a;
                    i15 = 1;
                    if (i4 != 0) {
                        bj4VarO.K(-404731513);
                        objF10 = bj4VarO.f();
                        if (objF10 == c0187a) {
                            objF10 = new t42(i15);
                            bj4VarO.C(objF10);
                        }
                        oh4Var8 = (oh4) objF10;
                        bj4VarO.U(false);
                    } else {
                        oh4Var8 = oh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-404729561);
                        objF9 = bj4VarO.f();
                        if (objF9 == c0187a) {
                            objF9 = new w47(i15);
                            bj4VarO.C(objF9);
                        }
                        oh4Var9 = (oh4) objF9;
                        bj4VarO.U(false);
                    } else {
                        oh4Var9 = oh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-404727993);
                        objF8 = bj4VarO.f();
                        if (objF8 == c0187a) {
                            objF8 = new z74(i15);
                            bj4VarO.C(objF8);
                        }
                        oh4Var10 = (oh4) objF8;
                        bj4VarO.U(false);
                    } else {
                        oh4Var10 = oh4Var7;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-404726777);
                        objF7 = bj4VarO.f();
                        if (objF7 == c0187a) {
                            objF7 = new t88(i14);
                            bj4VarO.C(objF7);
                        }
                        mh4Var2 = (mh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-404725465);
                        objF6 = bj4VarO.f();
                        if (objF6 == c0187a) {
                            objF6 = new mn1(3);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    } else {
                        oh4Var11 = oh4Var4;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var110 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72 t72Var110 = (t72) objF;
                    currentPage = previewUiState.getCurrentPage();
                    bj4VarO.K(-404718523);
                    zJ = bj4VarO.j(previewUiState);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var3 = (mh4) objF2;
                    bj4VarO.U(false);
                    hr7.b bVar110 = hr7.a;
                    oh4<? super List<? extends Uri>, g2b> oh4Var11111113 = oh4Var8;
                    Object[] objArr110 = new Object[0];
                    au3 au3Var110 = vs2.G;
                    zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                    oh4<? super IntercomPreviewFile, g2b> oh4Var11111114 = oh4Var9;
                    objF3 = bj4VarO.f();
                    if (zH) {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    vs2Var = (vs2) mm8.e(objArr110, au3Var110, (mh4) objF3, bj4VarO, 0);
                    vs2Var.F.setValue(mh4Var3);
                    t9 t9Var110 = new t9();
                    bj4VarO.K(-404713349);
                    if ((3670016 & i3) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zJ11110 = z | bj4VarO.j(context);
                    if ((i3 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = zJ11110 | z2;
                    objF4 = bj4VarO.f();
                    if (z3) {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    eh6 eh6VarF110 = ia.f(t9Var110, (oh4) objF4, bj4VarO);
                    bj4VarO.K(-404705280);
                    boolean zJ11111 = bj4VarO.J(vs2Var);
                    if ((29360128 & i3) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zJ11111 | z4;
                    objF5 = bj4VarO.f();
                    if (z5) {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    } else {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                    ox6 ox6Var113 = ox6Var2;
                    oh4<? super List<? extends Uri>, g2b> oh4Var11111115 = oh4Var10;
                    bj4Var = bj4VarO;
                    q39.a(ox6Var113, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var11111113, oh4Var11111114, oh4Var11111115, mh4Var2, context, eh6VarF110, vs2Var, t72Var110), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                    oh4Var12 = oh4Var11;
                    oh4Var13 = oh4Var11111115;
                    mh4Var4 = mh4Var2;
                    ox6Var3 = ox6Var113;
                    oh4Var14 = oh4Var11111113;
                    oh4Var15 = oh4Var11111114;
                    str4 = str3;
                } else {
                    if (i16 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i17 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    } else {
                        str3 = str2;
                    }
                    i14 = 0;
                    c0187a = jt1.a.a;
                    i15 = 1;
                    if (i4 != 0) {
                        bj4VarO.K(-404731513);
                        objF10 = bj4VarO.f();
                        if (objF10 == c0187a) {
                            objF10 = new t42(i15);
                            bj4VarO.C(objF10);
                        }
                        oh4Var8 = (oh4) objF10;
                        bj4VarO.U(false);
                    } else {
                        oh4Var8 = oh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-404729561);
                        objF9 = bj4VarO.f();
                        if (objF9 == c0187a) {
                            objF9 = new w47(i15);
                            bj4VarO.C(objF9);
                        }
                        oh4Var9 = (oh4) objF9;
                        bj4VarO.U(false);
                    } else {
                        oh4Var9 = oh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-404727993);
                        objF8 = bj4VarO.f();
                        if (objF8 == c0187a) {
                            objF8 = new z74(i15);
                            bj4VarO.C(objF8);
                        }
                        oh4Var10 = (oh4) objF8;
                        bj4VarO.U(false);
                    } else {
                        oh4Var10 = oh4Var7;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-404726777);
                        objF7 = bj4VarO.f();
                        if (objF7 == c0187a) {
                            objF7 = new t88(i14);
                            bj4VarO.C(objF7);
                        }
                        mh4Var2 = (mh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-404725465);
                        objF6 = bj4VarO.f();
                        if (objF6 == c0187a) {
                            objF6 = new mn1(3);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    } else {
                        oh4Var11 = oh4Var4;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var111 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72 t72Var111 = (t72) objF;
                    currentPage = previewUiState.getCurrentPage();
                    bj4VarO.K(-404718523);
                    zJ = bj4VarO.j(previewUiState);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var3 = (mh4) objF2;
                    bj4VarO.U(false);
                    hr7.b bVar111 = hr7.a;
                    oh4<? super List<? extends Uri>, g2b> oh4Var11111116 = oh4Var8;
                    Object[] objArr111 = new Object[0];
                    au3 au3Var111 = vs2.G;
                    zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                    oh4<? super IntercomPreviewFile, g2b> oh4Var11111117 = oh4Var9;
                    objF3 = bj4VarO.f();
                    if (zH) {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    vs2Var = (vs2) mm8.e(objArr111, au3Var111, (mh4) objF3, bj4VarO, 0);
                    vs2Var.F.setValue(mh4Var3);
                    t9 t9Var111 = new t9();
                    bj4VarO.K(-404713349);
                    if ((3670016 & i3) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zJ11112 = z | bj4VarO.j(context);
                    if ((i3 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = zJ11112 | z2;
                    objF4 = bj4VarO.f();
                    if (z3) {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    eh6 eh6VarF111 = ia.f(t9Var111, (oh4) objF4, bj4VarO);
                    bj4VarO.K(-404705280);
                    boolean zJ11113 = bj4VarO.J(vs2Var);
                    if ((29360128 & i3) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zJ11113 | z4;
                    objF5 = bj4VarO.f();
                    if (z5) {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    } else {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                    ox6 ox6Var114 = ox6Var2;
                    oh4<? super List<? extends Uri>, g2b> oh4Var11111118 = oh4Var10;
                    bj4Var = bj4VarO;
                    q39.a(ox6Var114, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var11111116, oh4Var11111117, oh4Var11111118, mh4Var2, context, eh6VarF111, vs2Var, t72Var111), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                    oh4Var12 = oh4Var11;
                    oh4Var13 = oh4Var11111118;
                    mh4Var4 = mh4Var2;
                    ox6Var3 = ox6Var114;
                    oh4Var14 = oh4Var11111116;
                    oh4Var15 = oh4Var11111117;
                    str4 = str3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: w88
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$19(ox6Var3, previewUiState, str4, oh4Var14, oh4Var15, oh4Var13, mh4Var4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            oh4Var7 = oh4Var3;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                mh4Var2 = mh4Var;
            } else {
                mh4Var2 = mh4Var;
                if ((i & 1572864) == 0) {
                    if (bj4VarO.j(mh4Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (bj4VarO.j(oh4Var4)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            if ((i3 & 4793491) == 4793490) {
                if (i16 != 0) {
                    ox6Var2 = ox6.a.t;
                } else {
                    ox6Var2 = ox6Var;
                }
                if (i17 != 0) {
                    str3 = BuildConfig.FLAVOR;
                } else {
                    str3 = str2;
                }
                i14 = 0;
                c0187a = jt1.a.a;
                i15 = 1;
                if (i4 != 0) {
                    bj4VarO.K(-404731513);
                    objF10 = bj4VarO.f();
                    if (objF10 == c0187a) {
                        objF10 = new t42(i15);
                        bj4VarO.C(objF10);
                    }
                    oh4Var8 = (oh4) objF10;
                    bj4VarO.U(false);
                } else {
                    oh4Var8 = oh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(-404729561);
                    objF9 = bj4VarO.f();
                    if (objF9 == c0187a) {
                        objF9 = new w47(i15);
                        bj4VarO.C(objF9);
                    }
                    oh4Var9 = (oh4) objF9;
                    bj4VarO.U(false);
                } else {
                    oh4Var9 = oh4Var6;
                }
                if (i8 != 0) {
                    bj4VarO.K(-404727993);
                    objF8 = bj4VarO.f();
                    if (objF8 == c0187a) {
                        objF8 = new z74(i15);
                        bj4VarO.C(objF8);
                    }
                    oh4Var10 = (oh4) objF8;
                    bj4VarO.U(false);
                } else {
                    oh4Var10 = oh4Var7;
                }
                if (i10 != 0) {
                    bj4VarO.K(-404726777);
                    objF7 = bj4VarO.f();
                    if (objF7 == c0187a) {
                        objF7 = new t88(i14);
                        bj4VarO.C(objF7);
                    }
                    mh4Var2 = (mh4) objF7;
                    bj4VarO.U(false);
                }
                if (i12 != 0) {
                    bj4VarO.K(-404725465);
                    objF6 = bj4VarO.f();
                    if (objF6 == c0187a) {
                        objF6 = new mn1(3);
                        bj4VarO.C(objF6);
                    }
                    oh4Var11 = (oh4) objF6;
                    bj4VarO.U(false);
                } else {
                    oh4Var11 = oh4Var4;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    c33 c33Var112 = wd3.a;
                    objF = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72 t72Var112 = (t72) objF;
                currentPage = previewUiState.getCurrentPage();
                bj4VarO.K(-404718523);
                zJ = bj4VarO.j(previewUiState);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: u88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: u88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                        }
                    };
                    bj4VarO.C(objF2);
                }
                mh4Var3 = (mh4) objF2;
                bj4VarO.U(false);
                hr7.b bVar112 = hr7.a;
                oh4<? super List<? extends Uri>, g2b> oh4Var11111119 = oh4Var8;
                Object[] objArr112 = new Object[0];
                au3 au3Var112 = vs2.G;
                zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                oh4<? super IntercomPreviewFile, g2b> oh4Var111111110 = oh4Var9;
                objF3 = bj4VarO.f();
                if (zH) {
                    objF3 = new mh4() { // from class: fr7
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return new vs2(currentPage, 0.0f, mh4Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mh4() { // from class: fr7
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return new vs2(currentPage, 0.0f, mh4Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                vs2Var = (vs2) mm8.e(objArr112, au3Var112, (mh4) objF3, bj4VarO, 0);
                vs2Var.F.setValue(mh4Var3);
                t9 t9Var112 = new t9();
                bj4VarO.K(-404713349);
                if ((3670016 & i3) == 1048576) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zJ11114 = z | bj4VarO.j(context);
                if ((i3 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = zJ11114 | z2;
                objF4 = bj4VarO.f();
                if (z3) {
                    objF4 = new oh4() { // from class: v88
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    objF4 = new oh4() { // from class: v88
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                eh6 eh6VarF112 = ia.f(t9Var112, (oh4) objF4, bj4VarO);
                bj4VarO.K(-404705280);
                boolean zJ11115 = bj4VarO.J(vs2Var);
                if ((29360128 & i3) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zJ11115 | z4;
                objF5 = bj4VarO.f();
                if (z5) {
                    objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                    bj4VarO.C(objF5);
                } else {
                    objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                    bj4VarO.C(objF5);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                ox6 ox6Var115 = ox6Var2;
                oh4<? super List<? extends Uri>, g2b> oh4Var111111111 = oh4Var10;
                bj4Var = bj4VarO;
                q39.a(ox6Var115, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var11111119, oh4Var111111110, oh4Var111111111, mh4Var2, context, eh6VarF112, vs2Var, t72Var112), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                oh4Var12 = oh4Var11;
                oh4Var13 = oh4Var111111111;
                mh4Var4 = mh4Var2;
                ox6Var3 = ox6Var115;
                oh4Var14 = oh4Var11111119;
                oh4Var15 = oh4Var111111110;
                str4 = str3;
            } else {
                if (i16 != 0) {
                    ox6Var2 = ox6.a.t;
                } else {
                    ox6Var2 = ox6Var;
                }
                if (i17 != 0) {
                    str3 = BuildConfig.FLAVOR;
                } else {
                    str3 = str2;
                }
                i14 = 0;
                c0187a = jt1.a.a;
                i15 = 1;
                if (i4 != 0) {
                    bj4VarO.K(-404731513);
                    objF10 = bj4VarO.f();
                    if (objF10 == c0187a) {
                        objF10 = new t42(i15);
                        bj4VarO.C(objF10);
                    }
                    oh4Var8 = (oh4) objF10;
                    bj4VarO.U(false);
                } else {
                    oh4Var8 = oh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(-404729561);
                    objF9 = bj4VarO.f();
                    if (objF9 == c0187a) {
                        objF9 = new w47(i15);
                        bj4VarO.C(objF9);
                    }
                    oh4Var9 = (oh4) objF9;
                    bj4VarO.U(false);
                } else {
                    oh4Var9 = oh4Var6;
                }
                if (i8 != 0) {
                    bj4VarO.K(-404727993);
                    objF8 = bj4VarO.f();
                    if (objF8 == c0187a) {
                        objF8 = new z74(i15);
                        bj4VarO.C(objF8);
                    }
                    oh4Var10 = (oh4) objF8;
                    bj4VarO.U(false);
                } else {
                    oh4Var10 = oh4Var7;
                }
                if (i10 != 0) {
                    bj4VarO.K(-404726777);
                    objF7 = bj4VarO.f();
                    if (objF7 == c0187a) {
                        objF7 = new t88(i14);
                        bj4VarO.C(objF7);
                    }
                    mh4Var2 = (mh4) objF7;
                    bj4VarO.U(false);
                }
                if (i12 != 0) {
                    bj4VarO.K(-404725465);
                    objF6 = bj4VarO.f();
                    if (objF6 == c0187a) {
                        objF6 = new mn1(3);
                        bj4VarO.C(objF6);
                    }
                    oh4Var11 = (oh4) objF6;
                    bj4VarO.U(false);
                } else {
                    oh4Var11 = oh4Var4;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    c33 c33Var113 = wd3.a;
                    objF = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72 t72Var113 = (t72) objF;
                currentPage = previewUiState.getCurrentPage();
                bj4VarO.K(-404718523);
                zJ = bj4VarO.j(previewUiState);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: u88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: u88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                        }
                    };
                    bj4VarO.C(objF2);
                }
                mh4Var3 = (mh4) objF2;
                bj4VarO.U(false);
                hr7.b bVar113 = hr7.a;
                oh4<? super List<? extends Uri>, g2b> oh4Var111111112 = oh4Var8;
                Object[] objArr113 = new Object[0];
                au3 au3Var113 = vs2.G;
                zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                oh4<? super IntercomPreviewFile, g2b> oh4Var111111113 = oh4Var9;
                objF3 = bj4VarO.f();
                if (zH) {
                    objF3 = new mh4() { // from class: fr7
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return new vs2(currentPage, 0.0f, mh4Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mh4() { // from class: fr7
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return new vs2(currentPage, 0.0f, mh4Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                vs2Var = (vs2) mm8.e(objArr113, au3Var113, (mh4) objF3, bj4VarO, 0);
                vs2Var.F.setValue(mh4Var3);
                t9 t9Var113 = new t9();
                bj4VarO.K(-404713349);
                if ((3670016 & i3) == 1048576) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zJ11116 = z | bj4VarO.j(context);
                if ((i3 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = zJ11116 | z2;
                objF4 = bj4VarO.f();
                if (z3) {
                    objF4 = new oh4() { // from class: v88
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    objF4 = new oh4() { // from class: v88
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                eh6 eh6VarF113 = ia.f(t9Var113, (oh4) objF4, bj4VarO);
                bj4VarO.K(-404705280);
                boolean zJ11117 = bj4VarO.J(vs2Var);
                if ((29360128 & i3) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zJ11117 | z4;
                objF5 = bj4VarO.f();
                if (z5) {
                    objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                    bj4VarO.C(objF5);
                } else {
                    objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                    bj4VarO.C(objF5);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                ox6 ox6Var116 = ox6Var2;
                oh4<? super List<? extends Uri>, g2b> oh4Var111111114 = oh4Var10;
                bj4Var = bj4VarO;
                q39.a(ox6Var116, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var111111112, oh4Var111111113, oh4Var111111114, mh4Var2, context, eh6VarF113, vs2Var, t72Var113), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                oh4Var12 = oh4Var11;
                oh4Var13 = oh4Var111111114;
                mh4Var4 = mh4Var2;
                ox6Var3 = ox6Var116;
                oh4Var14 = oh4Var111111112;
                oh4Var15 = oh4Var111111113;
                str4 = str3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: w88
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PreviewRootScreenKt.PreviewRootScreenContent$lambda$19(ox6Var3, previewUiState, str4, oh4Var14, oh4Var15, oh4Var13, mh4Var4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        oh4Var5 = oh4Var;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                oh4Var6 = oh4Var2;
                if (bj4VarO.j(oh4Var6)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    oh4Var7 = oh4Var3;
                    if (bj4VarO.j(oh4Var7)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    mh4Var2 = mh4Var;
                } else {
                    mh4Var2 = mh4Var;
                    if ((i & 1572864) == 0) {
                        if (bj4VarO.j(mh4Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (bj4VarO.j(oh4Var4)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i16 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i17 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    } else {
                        str3 = str2;
                    }
                    i14 = 0;
                    c0187a = jt1.a.a;
                    i15 = 1;
                    if (i4 != 0) {
                        bj4VarO.K(-404731513);
                        objF10 = bj4VarO.f();
                        if (objF10 == c0187a) {
                            objF10 = new t42(i15);
                            bj4VarO.C(objF10);
                        }
                        oh4Var8 = (oh4) objF10;
                        bj4VarO.U(false);
                    } else {
                        oh4Var8 = oh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-404729561);
                        objF9 = bj4VarO.f();
                        if (objF9 == c0187a) {
                            objF9 = new w47(i15);
                            bj4VarO.C(objF9);
                        }
                        oh4Var9 = (oh4) objF9;
                        bj4VarO.U(false);
                    } else {
                        oh4Var9 = oh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-404727993);
                        objF8 = bj4VarO.f();
                        if (objF8 == c0187a) {
                            objF8 = new z74(i15);
                            bj4VarO.C(objF8);
                        }
                        oh4Var10 = (oh4) objF8;
                        bj4VarO.U(false);
                    } else {
                        oh4Var10 = oh4Var7;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-404726777);
                        objF7 = bj4VarO.f();
                        if (objF7 == c0187a) {
                            objF7 = new t88(i14);
                            bj4VarO.C(objF7);
                        }
                        mh4Var2 = (mh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-404725465);
                        objF6 = bj4VarO.f();
                        if (objF6 == c0187a) {
                            objF6 = new mn1(3);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    } else {
                        oh4Var11 = oh4Var4;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var114 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72 t72Var114 = (t72) objF;
                    currentPage = previewUiState.getCurrentPage();
                    bj4VarO.K(-404718523);
                    zJ = bj4VarO.j(previewUiState);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var3 = (mh4) objF2;
                    bj4VarO.U(false);
                    hr7.b bVar114 = hr7.a;
                    oh4<? super List<? extends Uri>, g2b> oh4Var111111115 = oh4Var8;
                    Object[] objArr114 = new Object[0];
                    au3 au3Var114 = vs2.G;
                    zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                    oh4<? super IntercomPreviewFile, g2b> oh4Var111111116 = oh4Var9;
                    objF3 = bj4VarO.f();
                    if (zH) {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    vs2Var = (vs2) mm8.e(objArr114, au3Var114, (mh4) objF3, bj4VarO, 0);
                    vs2Var.F.setValue(mh4Var3);
                    t9 t9Var114 = new t9();
                    bj4VarO.K(-404713349);
                    if ((3670016 & i3) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zJ11118 = z | bj4VarO.j(context);
                    if ((i3 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = zJ11118 | z2;
                    objF4 = bj4VarO.f();
                    if (z3) {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    eh6 eh6VarF114 = ia.f(t9Var114, (oh4) objF4, bj4VarO);
                    bj4VarO.K(-404705280);
                    boolean zJ11119 = bj4VarO.J(vs2Var);
                    if ((29360128 & i3) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zJ11119 | z4;
                    objF5 = bj4VarO.f();
                    if (z5) {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    } else {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                    ox6 ox6Var117 = ox6Var2;
                    oh4<? super List<? extends Uri>, g2b> oh4Var111111117 = oh4Var10;
                    bj4Var = bj4VarO;
                    q39.a(ox6Var117, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var111111115, oh4Var111111116, oh4Var111111117, mh4Var2, context, eh6VarF114, vs2Var, t72Var114), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                    oh4Var12 = oh4Var11;
                    oh4Var13 = oh4Var111111117;
                    mh4Var4 = mh4Var2;
                    ox6Var3 = ox6Var117;
                    oh4Var14 = oh4Var111111115;
                    oh4Var15 = oh4Var111111116;
                    str4 = str3;
                } else {
                    if (i16 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i17 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    } else {
                        str3 = str2;
                    }
                    i14 = 0;
                    c0187a = jt1.a.a;
                    i15 = 1;
                    if (i4 != 0) {
                        bj4VarO.K(-404731513);
                        objF10 = bj4VarO.f();
                        if (objF10 == c0187a) {
                            objF10 = new t42(i15);
                            bj4VarO.C(objF10);
                        }
                        oh4Var8 = (oh4) objF10;
                        bj4VarO.U(false);
                    } else {
                        oh4Var8 = oh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-404729561);
                        objF9 = bj4VarO.f();
                        if (objF9 == c0187a) {
                            objF9 = new w47(i15);
                            bj4VarO.C(objF9);
                        }
                        oh4Var9 = (oh4) objF9;
                        bj4VarO.U(false);
                    } else {
                        oh4Var9 = oh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-404727993);
                        objF8 = bj4VarO.f();
                        if (objF8 == c0187a) {
                            objF8 = new z74(i15);
                            bj4VarO.C(objF8);
                        }
                        oh4Var10 = (oh4) objF8;
                        bj4VarO.U(false);
                    } else {
                        oh4Var10 = oh4Var7;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-404726777);
                        objF7 = bj4VarO.f();
                        if (objF7 == c0187a) {
                            objF7 = new t88(i14);
                            bj4VarO.C(objF7);
                        }
                        mh4Var2 = (mh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-404725465);
                        objF6 = bj4VarO.f();
                        if (objF6 == c0187a) {
                            objF6 = new mn1(3);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    } else {
                        oh4Var11 = oh4Var4;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var115 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72 t72Var115 = (t72) objF;
                    currentPage = previewUiState.getCurrentPage();
                    bj4VarO.K(-404718523);
                    zJ = bj4VarO.j(previewUiState);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: u88
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var3 = (mh4) objF2;
                    bj4VarO.U(false);
                    hr7.b bVar115 = hr7.a;
                    oh4<? super List<? extends Uri>, g2b> oh4Var111111118 = oh4Var8;
                    Object[] objArr115 = new Object[0];
                    au3 au3Var115 = vs2.G;
                    zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                    oh4<? super IntercomPreviewFile, g2b> oh4Var111111119 = oh4Var9;
                    objF3 = bj4VarO.f();
                    if (zH) {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mh4() { // from class: fr7
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return new vs2(currentPage, 0.0f, mh4Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    vs2Var = (vs2) mm8.e(objArr115, au3Var115, (mh4) objF3, bj4VarO, 0);
                    vs2Var.F.setValue(mh4Var3);
                    t9 t9Var115 = new t9();
                    bj4VarO.K(-404713349);
                    if ((3670016 & i3) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zJ111110 = z | bj4VarO.j(context);
                    if ((i3 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = zJ111110 | z2;
                    objF4 = bj4VarO.f();
                    if (z3) {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new oh4() { // from class: v88
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    eh6 eh6VarF115 = ia.f(t9Var115, (oh4) objF4, bj4VarO);
                    bj4VarO.K(-404705280);
                    boolean zJ111111 = bj4VarO.J(vs2Var);
                    if ((29360128 & i3) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zJ111111 | z4;
                    objF5 = bj4VarO.f();
                    if (z5) {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    } else {
                        objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                    ox6 ox6Var118 = ox6Var2;
                    oh4<? super List<? extends Uri>, g2b> oh4Var1111111110 = oh4Var10;
                    bj4Var = bj4VarO;
                    q39.a(ox6Var118, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var111111118, oh4Var111111119, oh4Var1111111110, mh4Var2, context, eh6VarF115, vs2Var, t72Var115), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                    oh4Var12 = oh4Var11;
                    oh4Var13 = oh4Var1111111110;
                    mh4Var4 = mh4Var2;
                    ox6Var3 = ox6Var118;
                    oh4Var14 = oh4Var111111118;
                    oh4Var15 = oh4Var111111119;
                    str4 = str3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: w88
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$19(ox6Var3, previewUiState, str4, oh4Var14, oh4Var15, oh4Var13, mh4Var4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            oh4Var7 = oh4Var3;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                mh4Var2 = mh4Var;
            } else {
                mh4Var2 = mh4Var;
                if ((i & 1572864) == 0) {
                    if (bj4VarO.j(mh4Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (bj4VarO.j(oh4Var4)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            if ((i3 & 4793491) == 4793490) {
                if (i16 != 0) {
                    ox6Var2 = ox6.a.t;
                } else {
                    ox6Var2 = ox6Var;
                }
                if (i17 != 0) {
                    str3 = BuildConfig.FLAVOR;
                } else {
                    str3 = str2;
                }
                i14 = 0;
                c0187a = jt1.a.a;
                i15 = 1;
                if (i4 != 0) {
                    bj4VarO.K(-404731513);
                    objF10 = bj4VarO.f();
                    if (objF10 == c0187a) {
                        objF10 = new t42(i15);
                        bj4VarO.C(objF10);
                    }
                    oh4Var8 = (oh4) objF10;
                    bj4VarO.U(false);
                } else {
                    oh4Var8 = oh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(-404729561);
                    objF9 = bj4VarO.f();
                    if (objF9 == c0187a) {
                        objF9 = new w47(i15);
                        bj4VarO.C(objF9);
                    }
                    oh4Var9 = (oh4) objF9;
                    bj4VarO.U(false);
                } else {
                    oh4Var9 = oh4Var6;
                }
                if (i8 != 0) {
                    bj4VarO.K(-404727993);
                    objF8 = bj4VarO.f();
                    if (objF8 == c0187a) {
                        objF8 = new z74(i15);
                        bj4VarO.C(objF8);
                    }
                    oh4Var10 = (oh4) objF8;
                    bj4VarO.U(false);
                } else {
                    oh4Var10 = oh4Var7;
                }
                if (i10 != 0) {
                    bj4VarO.K(-404726777);
                    objF7 = bj4VarO.f();
                    if (objF7 == c0187a) {
                        objF7 = new t88(i14);
                        bj4VarO.C(objF7);
                    }
                    mh4Var2 = (mh4) objF7;
                    bj4VarO.U(false);
                }
                if (i12 != 0) {
                    bj4VarO.K(-404725465);
                    objF6 = bj4VarO.f();
                    if (objF6 == c0187a) {
                        objF6 = new mn1(3);
                        bj4VarO.C(objF6);
                    }
                    oh4Var11 = (oh4) objF6;
                    bj4VarO.U(false);
                } else {
                    oh4Var11 = oh4Var4;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    c33 c33Var116 = wd3.a;
                    objF = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72 t72Var116 = (t72) objF;
                currentPage = previewUiState.getCurrentPage();
                bj4VarO.K(-404718523);
                zJ = bj4VarO.j(previewUiState);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: u88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: u88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                        }
                    };
                    bj4VarO.C(objF2);
                }
                mh4Var3 = (mh4) objF2;
                bj4VarO.U(false);
                hr7.b bVar116 = hr7.a;
                oh4<? super List<? extends Uri>, g2b> oh4Var1111111111 = oh4Var8;
                Object[] objArr116 = new Object[0];
                au3 au3Var116 = vs2.G;
                zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                oh4<? super IntercomPreviewFile, g2b> oh4Var1111111112 = oh4Var9;
                objF3 = bj4VarO.f();
                if (zH) {
                    objF3 = new mh4() { // from class: fr7
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return new vs2(currentPage, 0.0f, mh4Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mh4() { // from class: fr7
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return new vs2(currentPage, 0.0f, mh4Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                vs2Var = (vs2) mm8.e(objArr116, au3Var116, (mh4) objF3, bj4VarO, 0);
                vs2Var.F.setValue(mh4Var3);
                t9 t9Var116 = new t9();
                bj4VarO.K(-404713349);
                if ((3670016 & i3) == 1048576) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zJ111112 = z | bj4VarO.j(context);
                if ((i3 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = zJ111112 | z2;
                objF4 = bj4VarO.f();
                if (z3) {
                    objF4 = new oh4() { // from class: v88
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    objF4 = new oh4() { // from class: v88
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                eh6 eh6VarF116 = ia.f(t9Var116, (oh4) objF4, bj4VarO);
                bj4VarO.K(-404705280);
                boolean zJ111113 = bj4VarO.J(vs2Var);
                if ((29360128 & i3) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zJ111113 | z4;
                objF5 = bj4VarO.f();
                if (z5) {
                    objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                    bj4VarO.C(objF5);
                } else {
                    objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                    bj4VarO.C(objF5);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                ox6 ox6Var119 = ox6Var2;
                oh4<? super List<? extends Uri>, g2b> oh4Var1111111113 = oh4Var10;
                bj4Var = bj4VarO;
                q39.a(ox6Var119, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var1111111111, oh4Var1111111112, oh4Var1111111113, mh4Var2, context, eh6VarF116, vs2Var, t72Var116), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                oh4Var12 = oh4Var11;
                oh4Var13 = oh4Var1111111113;
                mh4Var4 = mh4Var2;
                ox6Var3 = ox6Var119;
                oh4Var14 = oh4Var1111111111;
                oh4Var15 = oh4Var1111111112;
                str4 = str3;
            } else {
                if (i16 != 0) {
                    ox6Var2 = ox6.a.t;
                } else {
                    ox6Var2 = ox6Var;
                }
                if (i17 != 0) {
                    str3 = BuildConfig.FLAVOR;
                } else {
                    str3 = str2;
                }
                i14 = 0;
                c0187a = jt1.a.a;
                i15 = 1;
                if (i4 != 0) {
                    bj4VarO.K(-404731513);
                    objF10 = bj4VarO.f();
                    if (objF10 == c0187a) {
                        objF10 = new t42(i15);
                        bj4VarO.C(objF10);
                    }
                    oh4Var8 = (oh4) objF10;
                    bj4VarO.U(false);
                } else {
                    oh4Var8 = oh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(-404729561);
                    objF9 = bj4VarO.f();
                    if (objF9 == c0187a) {
                        objF9 = new w47(i15);
                        bj4VarO.C(objF9);
                    }
                    oh4Var9 = (oh4) objF9;
                    bj4VarO.U(false);
                } else {
                    oh4Var9 = oh4Var6;
                }
                if (i8 != 0) {
                    bj4VarO.K(-404727993);
                    objF8 = bj4VarO.f();
                    if (objF8 == c0187a) {
                        objF8 = new z74(i15);
                        bj4VarO.C(objF8);
                    }
                    oh4Var10 = (oh4) objF8;
                    bj4VarO.U(false);
                } else {
                    oh4Var10 = oh4Var7;
                }
                if (i10 != 0) {
                    bj4VarO.K(-404726777);
                    objF7 = bj4VarO.f();
                    if (objF7 == c0187a) {
                        objF7 = new t88(i14);
                        bj4VarO.C(objF7);
                    }
                    mh4Var2 = (mh4) objF7;
                    bj4VarO.U(false);
                }
                if (i12 != 0) {
                    bj4VarO.K(-404725465);
                    objF6 = bj4VarO.f();
                    if (objF6 == c0187a) {
                        objF6 = new mn1(3);
                        bj4VarO.C(objF6);
                    }
                    oh4Var11 = (oh4) objF6;
                    bj4VarO.U(false);
                } else {
                    oh4Var11 = oh4Var4;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    c33 c33Var117 = wd3.a;
                    objF = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72 t72Var117 = (t72) objF;
                currentPage = previewUiState.getCurrentPage();
                bj4VarO.K(-404718523);
                zJ = bj4VarO.j(previewUiState);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: u88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: u88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                        }
                    };
                    bj4VarO.C(objF2);
                }
                mh4Var3 = (mh4) objF2;
                bj4VarO.U(false);
                hr7.b bVar117 = hr7.a;
                oh4<? super List<? extends Uri>, g2b> oh4Var1111111114 = oh4Var8;
                Object[] objArr117 = new Object[0];
                au3 au3Var117 = vs2.G;
                zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                oh4<? super IntercomPreviewFile, g2b> oh4Var1111111115 = oh4Var9;
                objF3 = bj4VarO.f();
                if (zH) {
                    objF3 = new mh4() { // from class: fr7
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return new vs2(currentPage, 0.0f, mh4Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mh4() { // from class: fr7
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return new vs2(currentPage, 0.0f, mh4Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                vs2Var = (vs2) mm8.e(objArr117, au3Var117, (mh4) objF3, bj4VarO, 0);
                vs2Var.F.setValue(mh4Var3);
                t9 t9Var117 = new t9();
                bj4VarO.K(-404713349);
                if ((3670016 & i3) == 1048576) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zJ111114 = z | bj4VarO.j(context);
                if ((i3 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = zJ111114 | z2;
                objF4 = bj4VarO.f();
                if (z3) {
                    objF4 = new oh4() { // from class: v88
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    objF4 = new oh4() { // from class: v88
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                eh6 eh6VarF117 = ia.f(t9Var117, (oh4) objF4, bj4VarO);
                bj4VarO.K(-404705280);
                boolean zJ111115 = bj4VarO.J(vs2Var);
                if ((29360128 & i3) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zJ111115 | z4;
                objF5 = bj4VarO.f();
                if (z5) {
                    objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                    bj4VarO.C(objF5);
                } else {
                    objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                    bj4VarO.C(objF5);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                ox6 ox6Var1110 = ox6Var2;
                oh4<? super List<? extends Uri>, g2b> oh4Var1111111116 = oh4Var10;
                bj4Var = bj4VarO;
                q39.a(ox6Var1110, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var1111111114, oh4Var1111111115, oh4Var1111111116, mh4Var2, context, eh6VarF117, vs2Var, t72Var117), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                oh4Var12 = oh4Var11;
                oh4Var13 = oh4Var1111111116;
                mh4Var4 = mh4Var2;
                ox6Var3 = ox6Var1110;
                oh4Var14 = oh4Var1111111114;
                oh4Var15 = oh4Var1111111115;
                str4 = str3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: w88
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PreviewRootScreenKt.PreviewRootScreenContent$lambda$19(ox6Var3, previewUiState, str4, oh4Var14, oh4Var15, oh4Var13, mh4Var4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        oh4Var6 = oh4Var2;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                oh4Var7 = oh4Var3;
                if (bj4VarO.j(oh4Var7)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                mh4Var2 = mh4Var;
            } else {
                mh4Var2 = mh4Var;
                if ((i & 1572864) == 0) {
                    if (bj4VarO.j(mh4Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (bj4VarO.j(oh4Var4)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            if ((i3 & 4793491) == 4793490) {
                if (i16 != 0) {
                    ox6Var2 = ox6.a.t;
                } else {
                    ox6Var2 = ox6Var;
                }
                if (i17 != 0) {
                    str3 = BuildConfig.FLAVOR;
                } else {
                    str3 = str2;
                }
                i14 = 0;
                c0187a = jt1.a.a;
                i15 = 1;
                if (i4 != 0) {
                    bj4VarO.K(-404731513);
                    objF10 = bj4VarO.f();
                    if (objF10 == c0187a) {
                        objF10 = new t42(i15);
                        bj4VarO.C(objF10);
                    }
                    oh4Var8 = (oh4) objF10;
                    bj4VarO.U(false);
                } else {
                    oh4Var8 = oh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(-404729561);
                    objF9 = bj4VarO.f();
                    if (objF9 == c0187a) {
                        objF9 = new w47(i15);
                        bj4VarO.C(objF9);
                    }
                    oh4Var9 = (oh4) objF9;
                    bj4VarO.U(false);
                } else {
                    oh4Var9 = oh4Var6;
                }
                if (i8 != 0) {
                    bj4VarO.K(-404727993);
                    objF8 = bj4VarO.f();
                    if (objF8 == c0187a) {
                        objF8 = new z74(i15);
                        bj4VarO.C(objF8);
                    }
                    oh4Var10 = (oh4) objF8;
                    bj4VarO.U(false);
                } else {
                    oh4Var10 = oh4Var7;
                }
                if (i10 != 0) {
                    bj4VarO.K(-404726777);
                    objF7 = bj4VarO.f();
                    if (objF7 == c0187a) {
                        objF7 = new t88(i14);
                        bj4VarO.C(objF7);
                    }
                    mh4Var2 = (mh4) objF7;
                    bj4VarO.U(false);
                }
                if (i12 != 0) {
                    bj4VarO.K(-404725465);
                    objF6 = bj4VarO.f();
                    if (objF6 == c0187a) {
                        objF6 = new mn1(3);
                        bj4VarO.C(objF6);
                    }
                    oh4Var11 = (oh4) objF6;
                    bj4VarO.U(false);
                } else {
                    oh4Var11 = oh4Var4;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    c33 c33Var118 = wd3.a;
                    objF = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72 t72Var118 = (t72) objF;
                currentPage = previewUiState.getCurrentPage();
                bj4VarO.K(-404718523);
                zJ = bj4VarO.j(previewUiState);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: u88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: u88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                        }
                    };
                    bj4VarO.C(objF2);
                }
                mh4Var3 = (mh4) objF2;
                bj4VarO.U(false);
                hr7.b bVar118 = hr7.a;
                oh4<? super List<? extends Uri>, g2b> oh4Var1111111117 = oh4Var8;
                Object[] objArr118 = new Object[0];
                au3 au3Var118 = vs2.G;
                zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                oh4<? super IntercomPreviewFile, g2b> oh4Var1111111118 = oh4Var9;
                objF3 = bj4VarO.f();
                if (zH) {
                    objF3 = new mh4() { // from class: fr7
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return new vs2(currentPage, 0.0f, mh4Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mh4() { // from class: fr7
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return new vs2(currentPage, 0.0f, mh4Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                vs2Var = (vs2) mm8.e(objArr118, au3Var118, (mh4) objF3, bj4VarO, 0);
                vs2Var.F.setValue(mh4Var3);
                t9 t9Var118 = new t9();
                bj4VarO.K(-404713349);
                if ((3670016 & i3) == 1048576) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zJ111116 = z | bj4VarO.j(context);
                if ((i3 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = zJ111116 | z2;
                objF4 = bj4VarO.f();
                if (z3) {
                    objF4 = new oh4() { // from class: v88
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    objF4 = new oh4() { // from class: v88
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                eh6 eh6VarF118 = ia.f(t9Var118, (oh4) objF4, bj4VarO);
                bj4VarO.K(-404705280);
                boolean zJ111117 = bj4VarO.J(vs2Var);
                if ((29360128 & i3) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zJ111117 | z4;
                objF5 = bj4VarO.f();
                if (z5) {
                    objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                    bj4VarO.C(objF5);
                } else {
                    objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                    bj4VarO.C(objF5);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                ox6 ox6Var1111 = ox6Var2;
                oh4<? super List<? extends Uri>, g2b> oh4Var1111111119 = oh4Var10;
                bj4Var = bj4VarO;
                q39.a(ox6Var1111, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var1111111117, oh4Var1111111118, oh4Var1111111119, mh4Var2, context, eh6VarF118, vs2Var, t72Var118), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                oh4Var12 = oh4Var11;
                oh4Var13 = oh4Var1111111119;
                mh4Var4 = mh4Var2;
                ox6Var3 = ox6Var1111;
                oh4Var14 = oh4Var1111111117;
                oh4Var15 = oh4Var1111111118;
                str4 = str3;
            } else {
                if (i16 != 0) {
                    ox6Var2 = ox6.a.t;
                } else {
                    ox6Var2 = ox6Var;
                }
                if (i17 != 0) {
                    str3 = BuildConfig.FLAVOR;
                } else {
                    str3 = str2;
                }
                i14 = 0;
                c0187a = jt1.a.a;
                i15 = 1;
                if (i4 != 0) {
                    bj4VarO.K(-404731513);
                    objF10 = bj4VarO.f();
                    if (objF10 == c0187a) {
                        objF10 = new t42(i15);
                        bj4VarO.C(objF10);
                    }
                    oh4Var8 = (oh4) objF10;
                    bj4VarO.U(false);
                } else {
                    oh4Var8 = oh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(-404729561);
                    objF9 = bj4VarO.f();
                    if (objF9 == c0187a) {
                        objF9 = new w47(i15);
                        bj4VarO.C(objF9);
                    }
                    oh4Var9 = (oh4) objF9;
                    bj4VarO.U(false);
                } else {
                    oh4Var9 = oh4Var6;
                }
                if (i8 != 0) {
                    bj4VarO.K(-404727993);
                    objF8 = bj4VarO.f();
                    if (objF8 == c0187a) {
                        objF8 = new z74(i15);
                        bj4VarO.C(objF8);
                    }
                    oh4Var10 = (oh4) objF8;
                    bj4VarO.U(false);
                } else {
                    oh4Var10 = oh4Var7;
                }
                if (i10 != 0) {
                    bj4VarO.K(-404726777);
                    objF7 = bj4VarO.f();
                    if (objF7 == c0187a) {
                        objF7 = new t88(i14);
                        bj4VarO.C(objF7);
                    }
                    mh4Var2 = (mh4) objF7;
                    bj4VarO.U(false);
                }
                if (i12 != 0) {
                    bj4VarO.K(-404725465);
                    objF6 = bj4VarO.f();
                    if (objF6 == c0187a) {
                        objF6 = new mn1(3);
                        bj4VarO.C(objF6);
                    }
                    oh4Var11 = (oh4) objF6;
                    bj4VarO.U(false);
                } else {
                    oh4Var11 = oh4Var4;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    c33 c33Var119 = wd3.a;
                    objF = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72 t72Var119 = (t72) objF;
                currentPage = previewUiState.getCurrentPage();
                bj4VarO.K(-404718523);
                zJ = bj4VarO.j(previewUiState);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: u88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: u88
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                        }
                    };
                    bj4VarO.C(objF2);
                }
                mh4Var3 = (mh4) objF2;
                bj4VarO.U(false);
                hr7.b bVar119 = hr7.a;
                oh4<? super List<? extends Uri>, g2b> oh4Var11111111110 = oh4Var8;
                Object[] objArr119 = new Object[0];
                au3 au3Var119 = vs2.G;
                zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
                oh4<? super IntercomPreviewFile, g2b> oh4Var11111111111 = oh4Var9;
                objF3 = bj4VarO.f();
                if (zH) {
                    objF3 = new mh4() { // from class: fr7
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return new vs2(currentPage, 0.0f, mh4Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mh4() { // from class: fr7
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return new vs2(currentPage, 0.0f, mh4Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                vs2Var = (vs2) mm8.e(objArr119, au3Var119, (mh4) objF3, bj4VarO, 0);
                vs2Var.F.setValue(mh4Var3);
                t9 t9Var119 = new t9();
                bj4VarO.K(-404713349);
                if ((3670016 & i3) == 1048576) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zJ111118 = z | bj4VarO.j(context);
                if ((i3 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = zJ111118 | z2;
                objF4 = bj4VarO.f();
                if (z3) {
                    objF4 = new oh4() { // from class: v88
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    objF4 = new oh4() { // from class: v88
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                eh6 eh6VarF119 = ia.f(t9Var119, (oh4) objF4, bj4VarO);
                bj4VarO.K(-404705280);
                boolean zJ111119 = bj4VarO.J(vs2Var);
                if ((29360128 & i3) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zJ111119 | z4;
                objF5 = bj4VarO.f();
                if (z5) {
                    objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                    bj4VarO.C(objF5);
                } else {
                    objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                    bj4VarO.C(objF5);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
                ox6 ox6Var1112 = ox6Var2;
                oh4<? super List<? extends Uri>, g2b> oh4Var11111111112 = oh4Var10;
                bj4Var = bj4VarO;
                q39.a(ox6Var1112, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var11111111110, oh4Var11111111111, oh4Var11111111112, mh4Var2, context, eh6VarF119, vs2Var, t72Var119), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
                oh4Var12 = oh4Var11;
                oh4Var13 = oh4Var11111111112;
                mh4Var4 = mh4Var2;
                ox6Var3 = ox6Var1112;
                oh4Var14 = oh4Var11111111110;
                oh4Var15 = oh4Var11111111111;
                str4 = str3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: w88
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PreviewRootScreenKt.PreviewRootScreenContent$lambda$19(ox6Var3, previewUiState, str4, oh4Var14, oh4Var15, oh4Var13, mh4Var4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 196608;
        oh4Var7 = oh4Var3;
        i10 = i2 & 64;
        if (i10 != 0) {
            i3 |= 1572864;
            mh4Var2 = mh4Var;
        } else {
            mh4Var2 = mh4Var;
            if ((i & 1572864) == 0) {
                if (bj4VarO.j(mh4Var2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
        }
        i12 = i2 & 128;
        if (i12 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (bj4VarO.j(oh4Var4)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i3 |= i13;
        }
        if ((i3 & 4793491) == 4793490) {
            if (i16 != 0) {
                ox6Var2 = ox6.a.t;
            } else {
                ox6Var2 = ox6Var;
            }
            if (i17 != 0) {
                str3 = BuildConfig.FLAVOR;
            } else {
                str3 = str2;
            }
            i14 = 0;
            c0187a = jt1.a.a;
            i15 = 1;
            if (i4 != 0) {
                bj4VarO.K(-404731513);
                objF10 = bj4VarO.f();
                if (objF10 == c0187a) {
                    objF10 = new t42(i15);
                    bj4VarO.C(objF10);
                }
                oh4Var8 = (oh4) objF10;
                bj4VarO.U(false);
            } else {
                oh4Var8 = oh4Var5;
            }
            if (i6 != 0) {
                bj4VarO.K(-404729561);
                objF9 = bj4VarO.f();
                if (objF9 == c0187a) {
                    objF9 = new w47(i15);
                    bj4VarO.C(objF9);
                }
                oh4Var9 = (oh4) objF9;
                bj4VarO.U(false);
            } else {
                oh4Var9 = oh4Var6;
            }
            if (i8 != 0) {
                bj4VarO.K(-404727993);
                objF8 = bj4VarO.f();
                if (objF8 == c0187a) {
                    objF8 = new z74(i15);
                    bj4VarO.C(objF8);
                }
                oh4Var10 = (oh4) objF8;
                bj4VarO.U(false);
            } else {
                oh4Var10 = oh4Var7;
            }
            if (i10 != 0) {
                bj4VarO.K(-404726777);
                objF7 = bj4VarO.f();
                if (objF7 == c0187a) {
                    objF7 = new t88(i14);
                    bj4VarO.C(objF7);
                }
                mh4Var2 = (mh4) objF7;
                bj4VarO.U(false);
            }
            if (i12 != 0) {
                bj4VarO.K(-404725465);
                objF6 = bj4VarO.f();
                if (objF6 == c0187a) {
                    objF6 = new mn1(3);
                    bj4VarO.C(objF6);
                }
                oh4Var11 = (oh4) objF6;
                bj4VarO.U(false);
            } else {
                oh4Var11 = oh4Var4;
            }
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            objF = bj4VarO.f();
            if (objF == c0187a) {
                c33 c33Var1110 = wd3.a;
                objF = m78.a(bj4VarO.x(), bj4VarO);
            }
            t72 t72Var1110 = (t72) objF;
            currentPage = previewUiState.getCurrentPage();
            bj4VarO.K(-404718523);
            zJ = bj4VarO.j(previewUiState);
            objF2 = bj4VarO.f();
            if (zJ) {
                objF2 = new mh4() { // from class: u88
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new mh4() { // from class: u88
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                    }
                };
                bj4VarO.C(objF2);
            }
            mh4Var3 = (mh4) objF2;
            bj4VarO.U(false);
            hr7.b bVar1110 = hr7.a;
            oh4<? super List<? extends Uri>, g2b> oh4Var11111111113 = oh4Var8;
            Object[] objArr1110 = new Object[0];
            au3 au3Var1110 = vs2.G;
            zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
            oh4<? super IntercomPreviewFile, g2b> oh4Var11111111114 = oh4Var9;
            objF3 = bj4VarO.f();
            if (zH) {
                objF3 = new mh4() { // from class: fr7
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return new vs2(currentPage, 0.0f, mh4Var3);
                    }
                };
                bj4VarO.C(objF3);
            } else {
                objF3 = new mh4() { // from class: fr7
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return new vs2(currentPage, 0.0f, mh4Var3);
                    }
                };
                bj4VarO.C(objF3);
            }
            vs2Var = (vs2) mm8.e(objArr1110, au3Var1110, (mh4) objF3, bj4VarO, 0);
            vs2Var.F.setValue(mh4Var3);
            t9 t9Var1110 = new t9();
            bj4VarO.K(-404713349);
            if ((3670016 & i3) == 1048576) {
                z = true;
            } else {
                z = false;
            }
            boolean zJ1111110 = z | bj4VarO.j(context);
            if ((i3 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = zJ1111110 | z2;
            objF4 = bj4VarO.f();
            if (z3) {
                objF4 = new oh4() { // from class: v88
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                    }
                };
                bj4VarO.C(objF4);
            } else {
                objF4 = new oh4() { // from class: v88
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                    }
                };
                bj4VarO.C(objF4);
            }
            bj4VarO.U(false);
            eh6 eh6VarF1110 = ia.f(t9Var1110, (oh4) objF4, bj4VarO);
            bj4VarO.K(-404705280);
            boolean zJ1111111 = bj4VarO.J(vs2Var);
            if ((29360128 & i3) == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = zJ1111111 | z4;
            objF5 = bj4VarO.f();
            if (z5) {
                objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                bj4VarO.C(objF5);
            } else {
                objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                bj4VarO.C(objF5);
            }
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
            ox6 ox6Var1113 = ox6Var2;
            oh4<? super List<? extends Uri>, g2b> oh4Var11111111115 = oh4Var10;
            bj4Var = bj4VarO;
            q39.a(ox6Var1113, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var11111111113, oh4Var11111111114, oh4Var11111111115, mh4Var2, context, eh6VarF1110, vs2Var, t72Var1110), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
            oh4Var12 = oh4Var11;
            oh4Var13 = oh4Var11111111115;
            mh4Var4 = mh4Var2;
            ox6Var3 = ox6Var1113;
            oh4Var14 = oh4Var11111111113;
            oh4Var15 = oh4Var11111111114;
            str4 = str3;
        } else {
            if (i16 != 0) {
                ox6Var2 = ox6.a.t;
            } else {
                ox6Var2 = ox6Var;
            }
            if (i17 != 0) {
                str3 = BuildConfig.FLAVOR;
            } else {
                str3 = str2;
            }
            i14 = 0;
            c0187a = jt1.a.a;
            i15 = 1;
            if (i4 != 0) {
                bj4VarO.K(-404731513);
                objF10 = bj4VarO.f();
                if (objF10 == c0187a) {
                    objF10 = new t42(i15);
                    bj4VarO.C(objF10);
                }
                oh4Var8 = (oh4) objF10;
                bj4VarO.U(false);
            } else {
                oh4Var8 = oh4Var5;
            }
            if (i6 != 0) {
                bj4VarO.K(-404729561);
                objF9 = bj4VarO.f();
                if (objF9 == c0187a) {
                    objF9 = new w47(i15);
                    bj4VarO.C(objF9);
                }
                oh4Var9 = (oh4) objF9;
                bj4VarO.U(false);
            } else {
                oh4Var9 = oh4Var6;
            }
            if (i8 != 0) {
                bj4VarO.K(-404727993);
                objF8 = bj4VarO.f();
                if (objF8 == c0187a) {
                    objF8 = new z74(i15);
                    bj4VarO.C(objF8);
                }
                oh4Var10 = (oh4) objF8;
                bj4VarO.U(false);
            } else {
                oh4Var10 = oh4Var7;
            }
            if (i10 != 0) {
                bj4VarO.K(-404726777);
                objF7 = bj4VarO.f();
                if (objF7 == c0187a) {
                    objF7 = new t88(i14);
                    bj4VarO.C(objF7);
                }
                mh4Var2 = (mh4) objF7;
                bj4VarO.U(false);
            }
            if (i12 != 0) {
                bj4VarO.K(-404725465);
                objF6 = bj4VarO.f();
                if (objF6 == c0187a) {
                    objF6 = new mn1(3);
                    bj4VarO.C(objF6);
                }
                oh4Var11 = (oh4) objF6;
                bj4VarO.U(false);
            } else {
                oh4Var11 = oh4Var4;
            }
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            objF = bj4VarO.f();
            if (objF == c0187a) {
                c33 c33Var1111 = wd3.a;
                objF = m78.a(bj4VarO.x(), bj4VarO);
            }
            t72 t72Var1111 = (t72) objF;
            currentPage = previewUiState.getCurrentPage();
            bj4VarO.K(-404718523);
            zJ = bj4VarO.j(previewUiState);
            objF2 = bj4VarO.f();
            if (zJ) {
                objF2 = new mh4() { // from class: u88
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new mh4() { // from class: u88
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreenContent$lambda$15$lambda$14(previewUiState));
                    }
                };
                bj4VarO.C(objF2);
            }
            mh4Var3 = (mh4) objF2;
            bj4VarO.U(false);
            hr7.b bVar1111 = hr7.a;
            oh4<? super List<? extends Uri>, g2b> oh4Var11111111116 = oh4Var8;
            Object[] objArr1111 = new Object[0];
            au3 au3Var1111 = vs2.G;
            zH = bj4VarO.h(currentPage) | bj4VarO.J(mh4Var3);
            oh4<? super IntercomPreviewFile, g2b> oh4Var11111111117 = oh4Var9;
            objF3 = bj4VarO.f();
            if (zH) {
                objF3 = new mh4() { // from class: fr7
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return new vs2(currentPage, 0.0f, mh4Var3);
                    }
                };
                bj4VarO.C(objF3);
            } else {
                objF3 = new mh4() { // from class: fr7
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return new vs2(currentPage, 0.0f, mh4Var3);
                    }
                };
                bj4VarO.C(objF3);
            }
            vs2Var = (vs2) mm8.e(objArr1111, au3Var1111, (mh4) objF3, bj4VarO, 0);
            vs2Var.F.setValue(mh4Var3);
            t9 t9Var1111 = new t9();
            bj4VarO.K(-404713349);
            if ((3670016 & i3) == 1048576) {
                z = true;
            } else {
                z = false;
            }
            boolean zJ1111112 = z | bj4VarO.j(context);
            if ((i3 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = zJ1111112 | z2;
            objF4 = bj4VarO.f();
            if (z3) {
                objF4 = new oh4() { // from class: v88
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                    }
                };
                bj4VarO.C(objF4);
            } else {
                objF4 = new oh4() { // from class: v88
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return PreviewRootScreenKt.PreviewRootScreenContent$lambda$17$lambda$16(mh4Var2, context, str3, ((Boolean) obj).booleanValue());
                    }
                };
                bj4VarO.C(objF4);
            }
            bj4VarO.U(false);
            eh6 eh6VarF1111 = ia.f(t9Var1111, (oh4) objF4, bj4VarO);
            bj4VarO.K(-404705280);
            boolean zJ1111113 = bj4VarO.J(vs2Var);
            if ((29360128 & i3) == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = zJ1111113 | z4;
            objF5 = bj4VarO.f();
            if (z5) {
                objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                bj4VarO.C(objF5);
            } else {
                objF5 = new PreviewRootScreenKt$PreviewRootScreenContent$6$1(vs2Var, oh4Var11, null);
                bj4VarO.C(objF5);
            }
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF5, "Page Navigation");
            ox6 ox6Var1114 = ox6Var2;
            oh4<? super List<? extends Uri>, g2b> oh4Var11111111118 = oh4Var10;
            bj4Var = bj4VarO;
            q39.a(ox6Var1114, null, null, null, null, 0, uh1.b, uh1.e, null, gr1.b(612610579, new AnonymousClass7(previewUiState, oh4Var11111111116, oh4Var11111111117, oh4Var11111111118, mh4Var2, context, eh6VarF1111, vs2Var, t72Var1111), bj4VarO), bj4Var, (i3 & 14) | 819462144, 318);
            oh4Var12 = oh4Var11;
            oh4Var13 = oh4Var11111111118;
            mh4Var4 = mh4Var2;
            ox6Var3 = ox6Var1114;
            oh4Var14 = oh4Var11111111116;
            oh4Var15 = oh4Var11111111117;
            str4 = str3;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: w88
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PreviewRootScreenKt.PreviewRootScreenContent$lambda$19(ox6Var3, previewUiState, str4, oh4Var14, oh4Var15, oh4Var13, mh4Var4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewRootScreenContent$lambda$13$lambda$12(int i) {
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int PreviewRootScreenContent$lambda$15$lambda$14(PreviewUiState previewUiState) {
        return previewUiState.getFiles().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewRootScreenContent$lambda$17$lambda$16(mh4 mh4Var, Context context, String str, boolean z) {
        if (z) {
            mh4Var.invoke();
        } else {
            Toast.makeText(context, str, 1).show();
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewRootScreenContent$lambda$19(ox6 ox6Var, PreviewUiState previewUiState, String str, oh4 oh4Var, oh4 oh4Var2, oh4 oh4Var3, mh4 mh4Var, oh4 oh4Var4, int i, int i2, jt1 jt1Var, int i3) {
        PreviewRootScreenContent(ox6Var, previewUiState, str, oh4Var, oh4Var2, oh4Var3, mh4Var, oh4Var4, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewRootScreenContent$lambda$5$lambda$4(List list) {
        list.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewRootScreenContent$lambda$7$lambda$6(IntercomPreviewFile intercomPreviewFile) {
        intercomPreviewFile.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewRootScreenContent$lambda$9$lambda$8(List list) {
        list.getClass();
        return g2b.a;
    }

    @IntercomPreviews
    private static final void PreviewRootScreenPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1805731172);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            PreviewRootScreenContent(null, new PreviewUiState(null, 0, true, false, "Send", true, null, null, null, 459, null), null, null, null, null, null, null, bj4VarO, 0, 253);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: r88
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PreviewRootScreenKt.PreviewRootScreenPreview$lambda$20(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewRootScreenPreview$lambda$20(int i, jt1 jt1Var, int i2) {
        PreviewRootScreenPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.preview.ui.PreviewRootScreenKt$PreviewRootScreenContent$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass7 implements ei4<go7, jt1, Integer, g2b> {
        final /* synthetic */ Context $context;
        final /* synthetic */ oh4<List<? extends Uri>, g2b> $onBackCLick;
        final /* synthetic */ oh4<IntercomPreviewFile, g2b> $onDeleteClick;
        final /* synthetic */ mh4<g2b> $onDownloadClick;
        final /* synthetic */ oh4<List<? extends Uri>, g2b> $onSendClick;
        final /* synthetic */ dr7 $pagerState;
        final /* synthetic */ eh6<String, Boolean> $permissionLauncher;
        final /* synthetic */ t72 $scope;
        final /* synthetic */ PreviewUiState $state;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(PreviewUiState previewUiState, oh4<? super List<? extends Uri>, g2b> oh4Var, oh4<? super IntercomPreviewFile, g2b> oh4Var2, oh4<? super List<? extends Uri>, g2b> oh4Var3, mh4<g2b> mh4Var, Context context, eh6<String, Boolean> eh6Var, dr7 dr7Var, t72 t72Var) {
            this.$state = previewUiState;
            this.$onBackCLick = oh4Var;
            this.$onDeleteClick = oh4Var2;
            this.$onSendClick = oh4Var3;
            this.$onDownloadClick = mh4Var;
            this.$context = context;
            this.$permissionLauncher = eh6Var;
            this.$pagerState = dr7Var;
            this.$scope = t72Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$15$lambda$11$lambda$10(t72 t72Var, dr7 dr7Var, int i) {
            oy0.d(t72Var, null, null, new PreviewRootScreenKt$PreviewRootScreenContent$7$1$6$1$1(dr7Var, i, null), 3);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$15$lambda$14$lambda$13(oh4 oh4Var, PreviewUiState previewUiState) {
            List<IntercomPreviewFile> files = previewUiState.getFiles();
            ArrayList arrayList = new ArrayList(ph1.n(files, 10));
            Iterator<T> it = files.iterator();
            while (it.hasNext()) {
                arrayList.add(((IntercomPreviewFile) it.next()).getUri());
            }
            oh4Var.invoke(arrayList);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$15$lambda$2$lambda$1(oh4 oh4Var, PreviewUiState previewUiState) {
            List<IntercomPreviewFile> files = previewUiState.getFiles();
            ArrayList arrayList = new ArrayList(ph1.n(files, 10));
            Iterator<T> it = files.iterator();
            while (it.hasNext()) {
                arrayList.add(((IntercomPreviewFile) it.next()).getUri());
            }
            oh4Var.invoke(arrayList);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$15$lambda$4$lambda$3(oh4 oh4Var, PreviewUiState previewUiState) {
            oh4Var.invoke(previewUiState.getFiles().get(previewUiState.getCurrentPage()));
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$15$lambda$7$lambda$6(oh4 oh4Var, PreviewUiState previewUiState) {
            List<IntercomPreviewFile> files = previewUiState.getFiles();
            ArrayList arrayList = new ArrayList(ph1.n(files, 10));
            Iterator<T> it = files.iterator();
            while (it.hasNext()) {
                arrayList.add(((IntercomPreviewFile) it.next()).getUri());
            }
            oh4Var.invoke(arrayList);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$15$lambda$9$lambda$8(mh4 mh4Var, Context context, eh6 eh6Var) {
            if (Build.VERSION.SDK_INT < 29 && vz1.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                eh6Var.a("android.permission.WRITE_EXTERNAL_STORAGE");
            } else {
                mh4Var.invoke();
            }
            return g2b.a;
        }

        /* JADX WARN: Code duplicated, block: B:56:0x020a  */
        public final void invoke(go7 go7Var, jt1 jt1Var, int i) {
            int i2;
            Object obj;
            boolean zJ;
            Object objF;
            String confirmationText;
            go7Var.getClass();
            if ((i & 6) == 0) {
                i2 = i | (jt1Var.J(go7Var) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            hf8 hf8Var = qu1.n;
            float fE = eo7.e(go7Var, (tq5) jt1Var.F(hf8Var));
            float fD = eo7.d(go7Var, (tq5) jt1Var.F(hf8Var));
            float fD2 = go7Var.d();
            float fA = go7Var.a();
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarH = eo7.l(aVar, fE, fD2, fD, fA).H(ir9.c);
            final PreviewUiState previewUiState = this.$state;
            final oh4<List<? extends Uri>, g2b> oh4Var = this.$onBackCLick;
            final oh4<IntercomPreviewFile, g2b> oh4Var2 = this.$onDeleteClick;
            final oh4<List<? extends Uri>, g2b> oh4Var3 = this.$onSendClick;
            final mh4<g2b> mh4Var = this.$onDownloadClick;
            final Context context = this.$context;
            final eh6<String, Boolean> eh6Var = this.$permissionLauncher;
            final dr7 dr7Var = this.$pagerState;
            final t72 t72Var = this.$scope;
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var, 0);
            int iHashCode = Long.hashCode(jt1Var.v());
            kw7 kw7VarY = jt1Var.y();
            ox6 ox6VarC = it1.c(jt1Var, ox6VarH);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar2);
            } else {
                jt1Var.z();
            }
            rd7.d(jt1Var, bt1.a.f, aj1VarA);
            rd7.d(jt1Var, bt1.a.e, kw7VarY);
            rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(jt1Var, bt1.a.h);
            rd7.d(jt1Var, bt1.a.d, ox6VarC);
            boolean showDeleteAction = previewUiState.getShowDeleteAction();
            boolean showSendAction = previewUiState.getShowSendAction();
            boolean showDownloadAction = previewUiState.getShowDownloadAction();
            jt1Var.K(1822285518);
            boolean zJ2 = jt1Var.J(oh4Var) | jt1Var.j(previewUiState);
            Object objF2 = jt1Var.f();
            Object obj2 = jt1.a.a;
            if (zJ2 || objF2 == obj2) {
                objF2 = new mh4() { // from class: io.intercom.android.sdk.m5.preview.ui.j
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return PreviewRootScreenKt.AnonymousClass7.invoke$lambda$15$lambda$2$lambda$1(oh4Var, previewUiState);
                    }
                };
                jt1Var.C(objF2);
            }
            mh4 mh4Var2 = (mh4) objF2;
            jt1Var.B();
            jt1Var.K(1822287988);
            boolean zJ3 = jt1Var.J(oh4Var2) | jt1Var.j(previewUiState);
            Object objF3 = jt1Var.f();
            if (zJ3 || objF3 == obj2) {
                objF3 = new mh4() { // from class: io.intercom.android.sdk.m5.preview.ui.k
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return PreviewRootScreenKt.AnonymousClass7.invoke$lambda$15$lambda$4$lambda$3(oh4Var2, previewUiState);
                    }
                };
                jt1Var.C(objF3);
            }
            mh4 mh4Var3 = (mh4) objF3;
            jt1Var.B();
            jt1Var.K(1822290574);
            boolean zJ4 = jt1Var.J(oh4Var3) | jt1Var.j(previewUiState);
            Object objF4 = jt1Var.f();
            if (zJ4 || objF4 == obj2) {
                objF4 = new mh4() { // from class: io.intercom.android.sdk.m5.preview.ui.l
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return PreviewRootScreenKt.AnonymousClass7.invoke$lambda$15$lambda$7$lambda$6(oh4Var3, previewUiState);
                    }
                };
                jt1Var.C(objF4);
            }
            mh4 mh4Var4 = (mh4) objF4;
            jt1Var.B();
            jt1Var.K(1822293607);
            boolean zJ5 = jt1Var.J(mh4Var) | jt1Var.j(context) | jt1Var.j(eh6Var);
            Object objF5 = jt1Var.f();
            if (zJ5 || objF5 == obj2) {
                objF5 = new mh4() { // from class: io.intercom.android.sdk.m5.preview.ui.m
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return PreviewRootScreenKt.AnonymousClass7.invoke$lambda$15$lambda$9$lambda$8(mh4Var, context, eh6Var);
                    }
                };
                jt1Var.C(objF5);
            }
            jt1Var.B();
            PreviewTopBarKt.PreviewTopBar(null, showDeleteAction, showSendAction, showDownloadAction, mh4Var2, mh4Var3, mh4Var4, (mh4) objF5, jt1Var, 0, 1);
            hq7.a(dr7Var, new qs5(true, 1.0f), null, null, null, null, false, null, null, null, gr1.b(570504714, new fi4<qq7, Integer, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.preview.ui.PreviewRootScreenKt$PreviewRootScreenContent$7$1$5
                public final void invoke(qq7 qq7Var, int i3, jt1 jt1Var2, int i4) {
                    qq7Var.getClass();
                    PreviewUriKt.PreviewUri(ox6.a.t, previewUiState.getFiles().get(i3), jt1Var2, 6, 0);
                }

                @Override // defpackage.fi4
                public /* bridge */ /* synthetic */ g2b invoke(qq7 qq7Var, Integer num, jt1 jt1Var2, Integer num2) {
                    invoke(qq7Var, num.intValue(), jt1Var2, num2.intValue());
                    return g2b.a;
                }
            }, jt1Var), jt1Var, 0);
            jt1Var.K(1822320903);
            if (previewUiState.getFiles().size() > 1 || ((confirmationText = previewUiState.getConfirmationText()) != null && !z2a.w(confirmationText))) {
                jt1Var.K(1822330170);
                boolean zJ6 = jt1Var.j(t72Var) | jt1Var.J(dr7Var);
                Object objF6 = jt1Var.f();
                if (zJ6) {
                    obj = obj2;
                } else {
                    obj = obj2;
                    if (objF6 == obj) {
                    }
                    oh4 oh4Var4 = (oh4) objF6;
                    jt1Var.B();
                    jt1Var.K(1822327470);
                    zJ = jt1Var.J(oh4Var3) | jt1Var.j(previewUiState);
                    objF = jt1Var.f();
                    if (zJ || objF == obj) {
                        objF = new mh4() { // from class: io.intercom.android.sdk.m5.preview.ui.o
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return PreviewRootScreenKt.AnonymousClass7.invoke$lambda$15$lambda$14$lambda$13(oh4Var3, previewUiState);
                            }
                        };
                        jt1Var.C(objF);
                    }
                    jt1Var.B();
                    PreviewBottomBarKt.PreviewBottomBar(aVar, previewUiState, oh4Var4, (mh4) objF, jt1Var, 6, 0);
                }
                objF6 = new oh4() { // from class: io.intercom.android.sdk.m5.preview.ui.n
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj3) {
                        return PreviewRootScreenKt.AnonymousClass7.invoke$lambda$15$lambda$11$lambda$10(t72Var, dr7Var, ((Integer) obj3).intValue());
                    }
                };
                jt1Var.C(objF6);
                oh4 oh4Var5 = (oh4) objF6;
                jt1Var.B();
                jt1Var.K(1822327470);
                zJ = jt1Var.J(oh4Var3) | jt1Var.j(previewUiState);
                objF = jt1Var.f();
                if (zJ) {
                    objF = new mh4() { // from class: io.intercom.android.sdk.m5.preview.ui.o
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return PreviewRootScreenKt.AnonymousClass7.invoke$lambda$15$lambda$14$lambda$13(oh4Var3, previewUiState);
                        }
                    };
                    jt1Var.C(objF);
                } else {
                    objF = new mh4() { // from class: io.intercom.android.sdk.m5.preview.ui.o
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return PreviewRootScreenKt.AnonymousClass7.invoke$lambda$15$lambda$14$lambda$13(oh4Var3, previewUiState);
                        }
                    };
                    jt1Var.C(objF);
                }
                jt1Var.B();
                PreviewBottomBarKt.PreviewBottomBar(aVar, previewUiState, oh4Var5, (mh4) objF, jt1Var, 6, 0);
            }
            jt1Var.B();
            jt1Var.I();
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var, Integer num) {
            invoke(go7Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
