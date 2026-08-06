package io.intercom.android.sdk.m5.preview.ui;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import com.intercom.twig.BuildConfig;
import defpackage.ae8;
import defpackage.aj1;
import defpackage.al8;
import defpackage.b33;
import defpackage.b47;
import defpackage.b85;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.bz5;
import defpackage.c30;
import defpackage.c33;
import defpackage.ci4;
import defpackage.co6;
import defpackage.d50;
import defpackage.di;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fg1;
import defpackage.fi4;
import defpackage.fl6;
import defpackage.fr1;
import defpackage.ft;
import defpackage.fv5;
import defpackage.g2b;
import defpackage.g76;
import defpackage.gi0;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.k85;
import defpackage.kw7;
import defpackage.m76;
import defpackage.mia;
import defpackage.ml5;
import defpackage.n57;
import defpackage.nz1;
import defpackage.oh4;
import defpackage.ov0;
import defpackage.ox6;
import defpackage.po;
import defpackage.pq0;
import defpackage.pv0;
import defpackage.qr5;
import defpackage.r52;
import defpackage.rd7;
import defpackage.s66;
import defpackage.u;
import defpackage.wd3;
import defpackage.wq0;
import defpackage.xj8;
import defpackage.y0a;
import defpackage.y43;
import defpackage.yi1;
import defpackage.ys5;
import defpackage.yz9;
import defpackage.z75;
import defpackage.zg5;
import defpackage.zu9;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.m5.preview.ui.PreviewUriKt;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PreviewUriKt {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[s66.a.values().length];
            try {
                iArr[s66.a.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0080  */
    /* JADX WARN: Code duplicated, block: B:54:0x0083  */
    /* JADX WARN: Code duplicated, block: B:55:0x0086  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    private static final void DocumentPreview(final ox6 ox6Var, final Uri uri, final boolean z, nz1 nz1Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        nz1 nz1Var2;
        final nz1 nz1Var3;
        final nz1 nz1Var4;
        final boolean z2;
        xj8 xj8VarW;
        bj4 bj4VarO = jt1Var.o(-290699575);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(uri) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.c(z) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                nz1Var2 = nz1Var;
                i3 |= bj4VarO.J(nz1Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            if ((i3 & 1171) == 1170 || !bj4VarO.r()) {
                if (i4 != 0) {
                    z = true;
                }
                if (i5 != 0) {
                    nz1Var3 = nz1.a.b;
                } else {
                    nz1Var3 = nz1Var2;
                }
                final Context context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                ov0.a(ox6Var.H(ir9.c), null, false, gr1.b(-561669217, new ei4<pv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.preview.ui.PreviewUriKt.DocumentPreview.1
                    public final void invoke(pv0 pv0Var, jt1 jt1Var2, int i6) throws IOException {
                        int i7;
                        pv0Var.getClass();
                        if ((i6 & 6) == 0) {
                            i7 = i6 | (jt1Var2.J(pv0Var) ? 4 : 2);
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 19) == 18 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        float fD = pv0Var.d();
                        String string = BuildConfig.FLAVOR;
                        try {
                            Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
                            if (cursorQuery != null) {
                                try {
                                    if (cursorQuery.moveToFirst() && cursorQuery.getColumnIndex("_display_name") != -1) {
                                        string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                                    }
                                    g2b g2bVar = g2b.a;
                                    cursorQuery.close();
                                } catch (Throwable th) {
                                    String str = string;
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        try {
                                            fg1.a(cursorQuery, th);
                                            throw th2;
                                        } catch (SecurityException unused) {
                                            string = str;
                                        }
                                    }
                                }
                            }
                        } catch (SecurityException unused2) {
                        }
                        String str2 = string;
                        ox6.a aVar = ox6.a.t;
                        ox6 ox6VarK = ir9.k(fD, 1.414f * fD, aVar);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i8 = IntercomTheme.$stable;
                        ox6 ox6VarF = pv0Var.f(gi0.c(ox6VarK, zg5.a(intercomTheme, jt1Var2, i8), al8.a), di.a.e);
                        nz1 nz1Var5 = nz1Var3;
                        boolean z3 = z;
                        aj1 aj1VarA = yi1.a(c30.d, di.a.n, jt1Var2, 54);
                        int iHashCode = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6 ox6VarC = it1.c(jt1Var2, ox6VarF);
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
                        rd7.d(jt1Var2, bt1.a.f, aj1VarA);
                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(jt1Var2, bt1.a.h);
                        rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                        z75.a(is7.a(R.drawable.intercom_ic_document, jt1Var2, 0), "Doc Icon", ir9.j(aVar, y43.a(fD, 48.0f) > 0 ? 56.0f : 24.0f), null, nz1Var5, 0.0f, new wq0(5, intercomTheme.getColors(jt1Var2, i8).m751getAction0d7_KjU()), jt1Var2, 56, 40);
                        jt1Var2.K(1193261104);
                        if (z3) {
                            b47.b(jt1Var2, ir9.d(aVar, 16.0f));
                            mia.b(str2, null, intercomTheme.getColors(jt1Var2, i8).getText().m824getDefault0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i8).getType04Point5(), jt1Var2, 0, 0, 131066);
                        }
                        jt1Var2.B();
                        jt1Var2.I();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(pv0 pv0Var, jt1 jt1Var2, Integer num) throws IOException {
                        invoke(pv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, 3072, 6);
                nz1Var4 = nz1Var3;
            } else {
                bj4VarO.u();
                nz1Var4 = nz1Var2;
            }
            z2 = z;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: c98
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PreviewUriKt.DocumentPreview$lambda$13(ox6Var, uri, z2, nz1Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        nz1Var2 = nz1Var;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
                z = true;
            }
            if (i5 != 0) {
                nz1Var3 = nz1.a.b;
            } else {
                nz1Var3 = nz1Var2;
            }
            final Context context2 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            ov0.a(ox6Var.H(ir9.c), null, false, gr1.b(-561669217, new ei4<pv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.preview.ui.PreviewUriKt.DocumentPreview.1
                public final void invoke(pv0 pv0Var, jt1 jt1Var2, int i6) throws IOException {
                    int i7;
                    pv0Var.getClass();
                    if ((i6 & 6) == 0) {
                        i7 = i6 | (jt1Var2.J(pv0Var) ? 4 : 2);
                    } else {
                        i7 = i6;
                    }
                    if ((i7 & 19) == 18 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    float fD = pv0Var.d();
                    String string = BuildConfig.FLAVOR;
                    try {
                        Cursor cursorQuery = context2.getContentResolver().query(uri, null, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.moveToFirst() && cursorQuery.getColumnIndex("_display_name") != -1) {
                                    string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                                }
                                g2b g2bVar = g2b.a;
                                cursorQuery.close();
                            } catch (Throwable th) {
                                String str = string;
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        fg1.a(cursorQuery, th);
                                        throw th2;
                                    } catch (SecurityException unused) {
                                        string = str;
                                    }
                                }
                            }
                        }
                    } catch (SecurityException unused2) {
                    }
                    String str2 = string;
                    ox6.a aVar = ox6.a.t;
                    ox6 ox6VarK = ir9.k(fD, 1.414f * fD, aVar);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i8 = IntercomTheme.$stable;
                    ox6 ox6VarF = pv0Var.f(gi0.c(ox6VarK, zg5.a(intercomTheme, jt1Var2, i8), al8.a), di.a.e);
                    nz1 nz1Var5 = nz1Var3;
                    boolean z3 = z;
                    aj1 aj1VarA = yi1.a(c30.d, di.a.n, jt1Var2, 54);
                    int iHashCode = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6 ox6VarC = it1.c(jt1Var2, ox6VarF);
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
                    rd7.d(jt1Var2, bt1.a.f, aj1VarA);
                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(jt1Var2, bt1.a.h);
                    rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                    z75.a(is7.a(R.drawable.intercom_ic_document, jt1Var2, 0), "Doc Icon", ir9.j(aVar, y43.a(fD, 48.0f) > 0 ? 56.0f : 24.0f), null, nz1Var5, 0.0f, new wq0(5, intercomTheme.getColors(jt1Var2, i8).m751getAction0d7_KjU()), jt1Var2, 56, 40);
                    jt1Var2.K(1193261104);
                    if (z3) {
                        b47.b(jt1Var2, ir9.d(aVar, 16.0f));
                        mia.b(str2, null, intercomTheme.getColors(jt1Var2, i8).getText().m824getDefault0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i8).getType04Point5(), jt1Var2, 0, 0, 131066);
                    }
                    jt1Var2.B();
                    jt1Var2.I();
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(pv0 pv0Var, jt1 jt1Var2, Integer num) throws IOException {
                    invoke(pv0Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 3072, 6);
            nz1Var4 = nz1Var3;
        } else {
            if (i4 != 0) {
                z = true;
            }
            if (i5 != 0) {
                nz1Var3 = nz1.a.b;
            } else {
                nz1Var3 = nz1Var2;
            }
            final Context context3 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            ov0.a(ox6Var.H(ir9.c), null, false, gr1.b(-561669217, new ei4<pv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.preview.ui.PreviewUriKt.DocumentPreview.1
                public final void invoke(pv0 pv0Var, jt1 jt1Var2, int i6) throws IOException {
                    int i7;
                    pv0Var.getClass();
                    if ((i6 & 6) == 0) {
                        i7 = i6 | (jt1Var2.J(pv0Var) ? 4 : 2);
                    } else {
                        i7 = i6;
                    }
                    if ((i7 & 19) == 18 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    float fD = pv0Var.d();
                    String string = BuildConfig.FLAVOR;
                    try {
                        Cursor cursorQuery = context3.getContentResolver().query(uri, null, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.moveToFirst() && cursorQuery.getColumnIndex("_display_name") != -1) {
                                    string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                                }
                                g2b g2bVar = g2b.a;
                                cursorQuery.close();
                            } catch (Throwable th) {
                                String str = string;
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        fg1.a(cursorQuery, th);
                                        throw th2;
                                    } catch (SecurityException unused) {
                                        string = str;
                                    }
                                }
                            }
                        }
                    } catch (SecurityException unused2) {
                    }
                    String str2 = string;
                    ox6.a aVar = ox6.a.t;
                    ox6 ox6VarK = ir9.k(fD, 1.414f * fD, aVar);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i8 = IntercomTheme.$stable;
                    ox6 ox6VarF = pv0Var.f(gi0.c(ox6VarK, zg5.a(intercomTheme, jt1Var2, i8), al8.a), di.a.e);
                    nz1 nz1Var5 = nz1Var3;
                    boolean z3 = z;
                    aj1 aj1VarA = yi1.a(c30.d, di.a.n, jt1Var2, 54);
                    int iHashCode = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6 ox6VarC = it1.c(jt1Var2, ox6VarF);
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
                    rd7.d(jt1Var2, bt1.a.f, aj1VarA);
                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(jt1Var2, bt1.a.h);
                    rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                    z75.a(is7.a(R.drawable.intercom_ic_document, jt1Var2, 0), "Doc Icon", ir9.j(aVar, y43.a(fD, 48.0f) > 0 ? 56.0f : 24.0f), null, nz1Var5, 0.0f, new wq0(5, intercomTheme.getColors(jt1Var2, i8).m751getAction0d7_KjU()), jt1Var2, 56, 40);
                    jt1Var2.K(1193261104);
                    if (z3) {
                        b47.b(jt1Var2, ir9.d(aVar, 16.0f));
                        mia.b(str2, null, intercomTheme.getColors(jt1Var2, i8).getText().m824getDefault0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i8).getType04Point5(), jt1Var2, 0, 0, 131066);
                    }
                    jt1Var2.B();
                    jt1Var2.I();
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(pv0 pv0Var, jt1 jt1Var2, Integer num) throws IOException {
                    invoke(pv0Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 3072, 6);
            nz1Var4 = nz1Var3;
        }
        z2 = z;
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: c98
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PreviewUriKt.DocumentPreview$lambda$13(ox6Var, uri, z2, nz1Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b DocumentPreview$lambda$13(ox6 ox6Var, Uri uri, boolean z, nz1 nz1Var, int i, int i2, jt1 jt1Var, int i3) {
        DocumentPreview(ox6Var, uri, z, nz1Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    private static final void PdfPreview(ox6 ox6Var, final IntercomPreviewFile intercomPreviewFile, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        bj4 bj4VarO = jt1Var.o(-2135159466);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= bj4VarO.j(intercomPreviewFile) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6 ox6Var3 = i4 != 0 ? ox6.a.t : ox6Var2;
            PdfLoadState value = loadPdfState(intercomPreviewFile, bj4VarO, (i3 >> 3) & 14).getValue();
            if (value instanceof PdfLoadState.Loading) {
                bj4VarO.K(1375819033);
                ox6 ox6VarH = ox6Var3.H(ir9.c);
                fl6 fl6VarD = dv0.d(di.a.e, false);
                int iHashCode = Long.hashCode(bj4VarO.T);
                kw7 kw7VarP = bj4VarO.P();
                ox6 ox6VarC = it1.c(bj4VarO, ox6VarH);
                bt1.c.getClass();
                qr5.a aVar = bt1.a.b;
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
                ae8.a(null, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m751getAction0d7_KjU(), 0.0f, 0L, 0, 0.0f, bj4VarO, 0, 61);
                bj4VarO.U(true);
                bj4VarO.U(false);
                ox6Var2 = ox6Var3;
            } else if (value instanceof PdfLoadState.Success) {
                bj4VarO.K(1376104140);
                ox6 ox6VarH2 = ox6Var3.H(ir9.c);
                bj4VarO.K(2122603249);
                boolean zJ = bj4VarO.J(value);
                Object objF = bj4VarO.f();
                if (zJ || objF == jt1.a.a) {
                    final PdfLoadState.Success success = (PdfLoadState.Success) value;
                    objF = new oh4() { // from class: e98
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return PreviewUriKt.PdfPreview$lambda$17$lambda$16(success, (bz5) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ys5.a(ox6VarH2, null, null, null, null, null, false, null, (oh4) objF, bj4VarO, 0, 510);
                bj4VarO = bj4VarO;
                bj4VarO.U(false);
                ox6Var2 = ox6Var3;
            } else {
                ox6 ox6Var4 = ox6Var3;
                if (!(value instanceof PdfLoadState.Error)) {
                    bj4VarO.K(2122589085);
                    bj4VarO.U(false);
                    u.b();
                    return;
                } else {
                    bj4VarO.K(1376662078);
                    ox6Var2 = ox6Var4;
                    DocumentPreview(ox6Var2, intercomPreviewFile.getUri(), false, null, bj4VarO, i3 & 14, 12);
                    bj4VarO.U(false);
                }
            }
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: f98
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PreviewUriKt.PdfPreview$lambda$18(ox6Var2, intercomPreviewFile, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PdfPreview$lambda$17$lambda$16(PdfLoadState pdfLoadState, bz5 bz5Var) {
        bz5Var.getClass();
        final List<Bitmap> bitmaps = ((PdfLoadState.Success) pdfLoadState).getBitmaps();
        final PreviewUriKt$PdfPreview$lambda$17$lambda$16$$inlined$items$default$1 previewUriKt$PdfPreview$lambda$17$lambda$16$$inlined$items$default$1 = new oh4() { // from class: io.intercom.android.sdk.m5.preview.ui.PreviewUriKt$PdfPreview$lambda$17$lambda$16$$inlined$items$default$1
            @Override // defpackage.oh4
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((Bitmap) obj);
            }

            @Override // defpackage.oh4
            public final Void invoke(Bitmap bitmap) {
                return null;
            }
        };
        bz5Var.a(bitmaps.size(), null, new oh4<Integer, Object>() { // from class: io.intercom.android.sdk.m5.preview.ui.PreviewUriKt$PdfPreview$lambda$17$lambda$16$$inlined$items$default$3
            public final Object invoke(int i) {
                return previewUriKt$PdfPreview$lambda$17$lambda$16$$inlined$items$default$1.invoke(bitmaps.get(i));
            }

            @Override // defpackage.oh4
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, new fr1(true, 802480018, new fi4<fv5, Integer, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.preview.ui.PreviewUriKt$PdfPreview$lambda$17$lambda$16$$inlined$items$default$4
            public final void invoke(fv5 fv5Var, int i, jt1 jt1Var, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (jt1Var.J(fv5Var) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= jt1Var.h(i) ? 32 : 16;
                }
                if (!jt1Var.A(i3 & 1, (i3 & 147) != 146)) {
                    jt1Var.u();
                    return;
                }
                Bitmap bitmap = (Bitmap) bitmaps.get(i);
                jt1Var.K(2097908854);
                ox6 ox6VarM = eo7.m(ir9.c, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                po poVar = new po(bitmap);
                boolean zJ = jt1Var.J(poVar);
                Object objF = jt1Var.f();
                if (zJ || objF == jt1.a.a) {
                    objF = gz3.a(poVar, 1);
                    jt1Var.C(objF);
                }
                z75.a((pq0) objF, "Pdf Preview", ox6VarM, di.a.e, nz1.a.d, 1.0f, null, jt1Var, 25016, 0);
                jt1Var.B();
            }

            @Override // defpackage.fi4
            public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, Integer num, jt1 jt1Var, Integer num2) {
                invoke(fv5Var, num.intValue(), jt1Var, num2.intValue());
                return g2b.a;
            }
        }));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PdfPreview$lambda$18(ox6 ox6Var, IntercomPreviewFile intercomPreviewFile, int i, int i2, jt1 jt1Var, int i3) {
        PdfPreview(ox6Var, intercomPreviewFile, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void PreviewUri(final ox6 ox6Var, final IntercomPreviewFile intercomPreviewFile, jt1 jt1Var, final int i, final int i2) {
        int i3;
        intercomPreviewFile.getClass();
        bj4 bj4VarO = jt1Var.o(-774963832);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(intercomPreviewFile) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            ox6 ox6Var2 = ox6Var;
            Context context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            Uri uri = intercomPreviewFile.getUri();
            String mimeType = intercomPreviewFile.getMimeType(context);
            if (ContentTypeExtensionKt.isImage(mimeType)) {
                bj4VarO.K(1216183442);
                ThumbnailPreview(ox6Var2, null, intercomPreviewFile, bj4VarO, (i3 & 14) | ((i3 << 3) & 896), 2);
                bj4VarO.U(false);
            } else if (ContentTypeExtensionKt.isVideo(mimeType) || ContentTypeExtensionKt.isAudio(mimeType)) {
                bj4VarO.K(1216310201);
                VideoPlayer(ox6Var2, uri, bj4VarO, i3 & 14, 0);
                bj4VarO.U(false);
            } else if (ContentTypeExtensionKt.isPdf(mimeType)) {
                bj4VarO.K(1216406456);
                PdfPreview(ox6Var2, intercomPreviewFile, bj4VarO, i3 & 126, 0);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(1216491861);
                DocumentPreview(ox6Var2, uri, false, null, bj4VarO, i3 & 14, 12);
                bj4VarO = bj4VarO;
                bj4VarO.U(false);
            }
            ox6Var = ox6Var2;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: b98
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PreviewUriKt.PreviewUri$lambda$0(ox6Var, intercomPreviewFile, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewUri$lambda$0(ox6 ox6Var, IntercomPreviewFile intercomPreviewFile, int i, int i2, jt1 jt1Var, int i3) {
        PreviewUri(ox6Var, intercomPreviewFile, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:58:0x0104  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static final void ThumbnailPreview(ox6 ox6Var, nz1 nz1Var, final IntercomPreviewFile intercomPreviewFile, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        nz1 nz1Var2;
        int i4;
        ox6 ox6Var3;
        nz1 nz1Var3;
        y0a y0aVar;
        Context context;
        String mimeType;
        final nz1 nz1Var4;
        xj8 xj8VarW;
        intercomPreviewFile.getClass();
        bj4 bj4VarO = jt1Var.o(-939708445);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                nz1Var2 = nz1Var;
                i3 |= bj4VarO.J(nz1Var2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (bj4VarO.j(intercomPreviewFile)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i3 & 147) == 146 || !bj4VarO.r()) {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i6 != 0) {
                    nz1Var3 = nz1.a.b;
                } else {
                    nz1Var3 = nz1Var2;
                }
                y0aVar = AndroidCompositionLocals_androidKt.b;
                context = (Context) bj4VarO.F(y0aVar);
                mimeType = intercomPreviewFile.getMimeType(context);
                if (!ContentTypeExtensionKt.isImage(mimeType) || ContentTypeExtensionKt.isVideo(mimeType) || ContentTypeExtensionKt.isPdf(mimeType)) {
                    bj4VarO.K(-257151612);
                    ox6 ox6VarH = ox6Var3.H(ir9.c);
                    b85 imageLoader = IntercomImageLoaderKt.getImageLoader(context);
                    k85.a aVar = new k85.a((Context) bj4VarO.F(y0aVar));
                    aVar.c = intercomPreviewFile.getUri();
                    aVar.b();
                    d50.b(aVar.a(), "Image", imageLoader, ox6VarH, null, nz1Var3, null, bj4VarO, ((i3 << 18) & 29360128) | 48, 8048);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(-256758439);
                    nz1 nz1Var5 = nz1Var3;
                    DocumentPreview(ox6Var3, intercomPreviewFile.getUri(), false, nz1Var5, bj4VarO, (i3 & 14) | 384 | ((i3 << 6) & 7168), 0);
                    nz1Var3 = nz1Var5;
                    bj4VarO.U(false);
                }
                ox6Var2 = ox6Var3;
                nz1Var4 = nz1Var3;
            } else {
                bj4VarO.u();
                nz1Var4 = nz1Var2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: z88
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PreviewUriKt.ThumbnailPreview$lambda$2(ox6Var2, nz1Var4, intercomPreviewFile, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        nz1Var2 = nz1Var;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (bj4VarO.j(intercomPreviewFile)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) == 146) {
            if (i5 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i6 != 0) {
                nz1Var3 = nz1.a.b;
            } else {
                nz1Var3 = nz1Var2;
            }
            y0aVar = AndroidCompositionLocals_androidKt.b;
            context = (Context) bj4VarO.F(y0aVar);
            mimeType = intercomPreviewFile.getMimeType(context);
            if (ContentTypeExtensionKt.isImage(mimeType)) {
                bj4VarO.K(-257151612);
                ox6 ox6VarH2 = ox6Var3.H(ir9.c);
                b85 imageLoader2 = IntercomImageLoaderKt.getImageLoader(context);
                k85.a aVar2 = new k85.a((Context) bj4VarO.F(y0aVar));
                aVar2.c = intercomPreviewFile.getUri();
                aVar2.b();
                d50.b(aVar2.a(), "Image", imageLoader2, ox6VarH2, null, nz1Var3, null, bj4VarO, ((i3 << 18) & 29360128) | 48, 8048);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(-257151612);
                ox6 ox6VarH3 = ox6Var3.H(ir9.c);
                b85 imageLoader3 = IntercomImageLoaderKt.getImageLoader(context);
                k85.a aVar3 = new k85.a((Context) bj4VarO.F(y0aVar));
                aVar3.c = intercomPreviewFile.getUri();
                aVar3.b();
                d50.b(aVar3.a(), "Image", imageLoader3, ox6VarH3, null, nz1Var3, null, bj4VarO, ((i3 << 18) & 29360128) | 48, 8048);
                bj4VarO.U(false);
            }
            ox6Var2 = ox6Var3;
            nz1Var4 = nz1Var3;
        } else {
            if (i5 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i6 != 0) {
                nz1Var3 = nz1.a.b;
            } else {
                nz1Var3 = nz1Var2;
            }
            y0aVar = AndroidCompositionLocals_androidKt.b;
            context = (Context) bj4VarO.F(y0aVar);
            mimeType = intercomPreviewFile.getMimeType(context);
            if (ContentTypeExtensionKt.isImage(mimeType)) {
                bj4VarO.K(-257151612);
                ox6 ox6VarH4 = ox6Var3.H(ir9.c);
                b85 imageLoader4 = IntercomImageLoaderKt.getImageLoader(context);
                k85.a aVar4 = new k85.a((Context) bj4VarO.F(y0aVar));
                aVar4.c = intercomPreviewFile.getUri();
                aVar4.b();
                d50.b(aVar4.a(), "Image", imageLoader4, ox6VarH4, null, nz1Var3, null, bj4VarO, ((i3 << 18) & 29360128) | 48, 8048);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(-257151612);
                ox6 ox6VarH5 = ox6Var3.H(ir9.c);
                b85 imageLoader5 = IntercomImageLoaderKt.getImageLoader(context);
                k85.a aVar5 = new k85.a((Context) bj4VarO.F(y0aVar));
                aVar5.c = intercomPreviewFile.getUri();
                aVar5.b();
                d50.b(aVar5.a(), "Image", imageLoader5, ox6VarH5, null, nz1Var3, null, bj4VarO, ((i3 << 18) & 29360128) | 48, 8048);
                bj4VarO.U(false);
            }
            ox6Var2 = ox6Var3;
            nz1Var4 = nz1Var3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: z88
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PreviewUriKt.ThumbnailPreview$lambda$2(ox6Var2, nz1Var4, intercomPreviewFile, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ThumbnailPreview$lambda$2(ox6 ox6Var, nz1 nz1Var, IntercomPreviewFile intercomPreviewFile, int i, int i2, jt1 jt1Var, int i3) {
        ThumbnailPreview(ox6Var, nz1Var, intercomPreviewFile, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    private static final void VideoPlayer(final ox6 ox6Var, final Uri uri, jt1 jt1Var, final int i, final int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(554501913);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(uri) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            ox6 ox6Var2 = ox6Var;
            Context context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            h37 h37VarJ = bl7.j(bj4VarO.F(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), bj4VarO);
            co6.a aVarA = co6.b(uri).a();
            String strValueOf = String.valueOf(uri.hashCode());
            strValueOf.getClass();
            aVarA.a = strValueOf;
            aVarA.h = uri;
            co6 co6VarA = aVarA.a();
            androidx.media3.exoplayer.d dVarA = new ExoPlayer.b(context).a();
            dVarA.h0(co6VarA);
            dVarA.d();
            bj4VarO.K(-1887749031);
            boolean zJ = bj4VarO.j(dVarA);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            int i5 = 1;
            if (zJ || objF == c0187a) {
                objF = new n57(i5, dVarA);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ft.b((oh4) objF, ox6Var2, null, bj4VarO, (i3 << 3) & 112, 4);
            bj4VarO.K(-1887735410);
            boolean zJ2 = bj4VarO.j(dVarA) | bj4VarO.J(h37VarJ);
            Object objF2 = bj4VarO.f();
            if (zJ2 || objF2 == c0187a) {
                objF2 = new r52(i5, dVarA, h37VarJ);
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            wd3.a(BuildConfig.FLAVOR, (oh4) objF2, bj4VarO);
            ox6Var = ox6Var2;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: d98
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PreviewUriKt.VideoPlayer$lambda$12(ox6Var, uri, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b33 VideoPlayer$lambda$11$lambda$10(final ExoPlayer exoPlayer, yz9 yz9Var, c33 c33Var) {
        c33Var.getClass();
        exoPlayer.h();
        final g76 g76Var = new g76() { // from class: a98
            @Override // defpackage.g76
            public final void t(m76 m76Var, s66.a aVar) {
                PreviewUriKt.VideoPlayer$lambda$11$lambda$10$lambda$8(exoPlayer, m76Var, aVar);
            }
        };
        final s66 lifecycle = ((m76) yz9Var.getValue()).getLifecycle();
        lifecycle.a(g76Var);
        return new b33() { // from class: io.intercom.android.sdk.m5.preview.ui.PreviewUriKt$VideoPlayer$lambda$11$lambda$10$$inlined$onDispose$1
            @Override // defpackage.b33
            public void dispose() {
                lifecycle.c(g76Var);
                exoPlayer.a();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VideoPlayer$lambda$11$lambda$10$lambda$8(ExoPlayer exoPlayer, m76 m76Var, s66.a aVar) {
        m76Var.getClass();
        aVar.getClass();
        if (WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()] == 1) {
            exoPlayer.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b VideoPlayer$lambda$12(ox6 ox6Var, Uri uri, int i, int i2, jt1 jt1Var, int i3) {
        VideoPlayer(ox6Var, uri, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerView VideoPlayer$lambda$7$lambda$6(ExoPlayer exoPlayer, Context context) {
        context.getClass();
        PlayerView playerView = new PlayerView(context);
        playerView.setPlayer(exoPlayer);
        playerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return playerView;
    }

    private static final yz9<PdfLoadState> loadPdfState(IntercomPreviewFile intercomPreviewFile, jt1 jt1Var, int i) {
        jt1Var.K(-782364509);
        Context context = (Context) jt1Var.F(AndroidCompositionLocals_androidKt.b);
        PdfLoadState.Loading loading = PdfLoadState.Loading.INSTANCE;
        jt1Var.K(1470556875);
        boolean zJ = jt1Var.j(context) | jt1Var.j(intercomPreviewFile);
        Object objF = jt1Var.f();
        Object obj = jt1.a.a;
        if (zJ || objF == obj) {
            objF = new PreviewUriKt$loadPdfState$1$1(context, intercomPreviewFile, null);
            jt1Var.C(objF);
        }
        ci4 ci4Var = (ci4) objF;
        jt1Var.B();
        Object objF2 = jt1Var.f();
        if (objF2 == obj) {
            objF2 = bl7.i(loading);
            jt1Var.C(objF2);
        }
        h37 h37Var = (h37) objF2;
        boolean zJ2 = jt1Var.j(ci4Var);
        Object objF3 = jt1Var.f();
        if (zJ2 || objF3 == obj) {
            objF3 = new zu9(ci4Var, h37Var, null);
            jt1Var.C(objF3);
        }
        wd3.d(jt1Var, (ci4) objF3, intercomPreviewFile);
        jt1Var.B();
        return h37Var;
    }
}
