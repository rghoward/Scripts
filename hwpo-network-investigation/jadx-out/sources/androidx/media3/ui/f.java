package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.widget.FrameLayout;
import com.intercom.twig.BuildConfig;
import defpackage.d5a;
import defpackage.ec2;
import defpackage.n15;
import defpackage.n6b;
import defpackage.od3;
import defpackage.oda;
import defpackage.op3;
import defpackage.pk;
import defpackage.pp2;
import defpackage.sk0;
import defpackage.ty8;
import defpackage.vl8;
import defpackage.xkb;
import defpackage.xl7;
import defpackage.y41;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends FrameLayout implements SubtitleView.a {
    public final androidx.media3.ui.a t;
    public final xkb u;
    public List<ec2> v;
    public y41 w;
    public float x;
    public float y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(Context context) {
        super(context, null);
        this.v = Collections.EMPTY_LIST;
        this.w = y41.g;
        this.x = 0.0533f;
        this.y = 0.08f;
        androidx.media3.ui.a aVar = new androidx.media3.ui.a(context, 0);
        this.t = aVar;
        xkb xkbVar = new xkb(context, null);
        this.u = xkbVar;
        xkbVar.setBackgroundColor(0);
        xkbVar.getSettings().setAllowContentAccess(false);
        addView(aVar);
        addView(xkbVar);
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public final void a(List list, y41 y41Var, float f, float f2) {
        this.w = y41Var;
        this.x = f;
        this.y = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ec2 ec2Var = (ec2) list.get(i);
            if (ec2Var.d != null) {
                arrayList.add(ec2Var);
            } else {
                arrayList2.add(ec2Var);
            }
        }
        if (!this.v.isEmpty() || !arrayList2.isEmpty()) {
            this.v = arrayList2;
            c();
        }
        this.t.a(arrayList, y41Var, f, f2);
        invalidate();
    }

    public final String b(float f, int i) {
        float fB = d5a.b(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fB == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fB / getContext().getResources().getDisplayMetrics().density)};
        String str = n6b.a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0243  */
    /* JADX WARN: Code duplicated, block: B:104:0x0249  */
    /* JADX WARN: Code duplicated, block: B:105:0x0258  */
    /* JADX WARN: Code duplicated, block: B:107:0x0276 A[LOOP:2: B:106:0x0274->B:107:0x0276, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x0299 A[LOOP:3: B:109:0x0293->B:111:0x0299, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:116:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:119:0x030a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0310  */
    /* JADX WARN: Code duplicated, block: B:122:0x0328  */
    /* JADX WARN: Code duplicated, block: B:124:0x032e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0344  */
    /* JADX WARN: Code duplicated, block: B:127:0x034a  */
    /* JADX WARN: Code duplicated, block: B:128:0x034d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0351  */
    /* JADX WARN: Code duplicated, block: B:132:0x035a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0360  */
    /* JADX WARN: Code duplicated, block: B:135:0x037a  */
    /* JADX WARN: Code duplicated, block: B:137:0x037e  */
    /* JADX WARN: Code duplicated, block: B:138:0x039b  */
    /* JADX WARN: Code duplicated, block: B:140:0x039f  */
    /* JADX WARN: Code duplicated, block: B:142:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:143:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:144:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:146:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:148:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:150:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:153:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:156:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:158:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:160:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:162:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:165:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:166:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:167:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:168:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:170:0x0400  */
    /* JADX WARN: Code duplicated, block: B:171:0x0404  */
    /* JADX WARN: Code duplicated, block: B:173:0x0408  */
    /* JADX WARN: Code duplicated, block: B:175:0x0419  */
    /* JADX WARN: Code duplicated, block: B:178:0x041d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0423  */
    /* JADX WARN: Code duplicated, block: B:181:0x042b  */
    /* JADX WARN: Code duplicated, block: B:183:0x042e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0430  */
    /* JADX WARN: Code duplicated, block: B:186:0x0433  */
    /* JADX WARN: Code duplicated, block: B:187:0x0437  */
    /* JADX WARN: Code duplicated, block: B:188:0x043d  */
    /* JADX WARN: Code duplicated, block: B:189:0x0443  */
    /* JADX WARN: Code duplicated, block: B:190:0x0449  */
    /* JADX WARN: Code duplicated, block: B:193:0x0457  */
    /* JADX WARN: Code duplicated, block: B:194:0x045a  */
    /* JADX WARN: Code duplicated, block: B:197:0x046d  */
    /* JADX WARN: Code duplicated, block: B:209:0x0485  */
    /* JADX WARN: Code duplicated, block: B:239:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:241:0x0500  */
    /* JADX WARN: Code duplicated, block: B:244:0x0515  */
    /* JADX WARN: Code duplicated, block: B:250:0x0546  */
    /* JADX WARN: Code duplicated, block: B:252:0x056f A[LOOP:6: B:251:0x056d->B:252:0x056f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:255:0x058f A[LOOP:7: B:254:0x058d->B:255:0x058f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:261:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:263:0x05de  */
    /* JADX WARN: Code duplicated, block: B:267:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:271:0x0606  */
    /* JADX WARN: Code duplicated, block: B:273:0x0609  */
    /* JADX WARN: Code duplicated, block: B:277:0x0610  */
    /* JADX WARN: Code duplicated, block: B:280:0x062b  */
    /* JADX WARN: Code duplicated, block: B:283:0x0648  */
    /* JADX WARN: Code duplicated, block: B:285:0x0653  */
    /* JADX WARN: Code duplicated, block: B:287:0x0656  */
    /* JADX WARN: Code duplicated, block: B:288:0x0659  */
    /* JADX WARN: Code duplicated, block: B:289:0x065c  */
    /* JADX WARN: Code duplicated, block: B:291:0x067a  */
    /* JADX WARN: Code duplicated, block: B:309:0x0522 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0175  */
    /* JADX WARN: Code duplicated, block: B:55:0x0188  */
    /* JADX WARN: Code duplicated, block: B:58:0x0195  */
    /* JADX WARN: Code duplicated, block: B:59:0x019a  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x01be  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0207  */
    /* JADX WARN: Instruction removed from duplicated block: B:111:0x0299, please report this as an issue */
    public final void c() {
        String strConcat;
        String str;
        String str2;
        int i;
        float f;
        String str3;
        Layout.Alignment alignment;
        String str4;
        int i2;
        int i3;
        Object obj;
        int i4;
        String str5;
        int i5;
        String str6;
        String str7;
        int i6;
        String str8;
        Object obj2;
        String str9;
        CharSequence charSequence;
        float f2;
        String str10;
        Spanned spanned;
        HashSet hashSet;
        BackgroundColorSpan[] backgroundColorSpanArr;
        int length;
        int i7;
        HashMap map;
        Iterator it;
        String str11;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i8;
        String str12;
        StringBuilder sb;
        int i9;
        int i10;
        d.a aVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i11;
        int size2;
        int i12;
        Object obj3;
        boolean z;
        boolean z2;
        int i13;
        oda odaVar;
        int i14;
        int i15;
        StringBuilder sb2;
        int i16;
        String str13;
        String strC;
        int i17;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size3;
        String str14;
        int spanStart;
        int spanEnd;
        d.c cVar;
        d.c cVar2;
        float f3;
        String str15;
        Layout.Alignment alignment2;
        String str16;
        int i18;
        String str17;
        String str18;
        String str19;
        boolean z3;
        f fVar = this;
        StringBuilder sb3 = new StringBuilder();
        String strF = od3.f(fVar.w.a);
        int i19 = 0;
        String strB = fVar.b(fVar.x, 0);
        float f4 = 1.2f;
        Float fValueOf = Float.valueOf(1.2f);
        y41 y41Var = fVar.w;
        int i20 = y41Var.d;
        int i21 = y41Var.e;
        int i22 = 2;
        int i23 = 1;
        if (i20 == 1) {
            Object[] objArr = {od3.f(i21)};
            String str20 = n6b.a;
            strConcat = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr);
        } else if (i20 == 2) {
            String strF2 = od3.f(i21);
            String str21 = n6b.a;
            Locale locale = Locale.US;
            strConcat = "0.1em 0.12em 0.15em ".concat(strF2);
        } else if (i20 == 3) {
            String strF3 = od3.f(i21);
            String str22 = n6b.a;
            Locale locale2 = Locale.US;
            strConcat = "0.06em 0.08em 0.15em ".concat(strF3);
        } else if (i20 != 4) {
            strConcat = "unset";
        } else {
            String strF4 = od3.f(i21);
            String str23 = n6b.a;
            Locale locale3 = Locale.US;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strF4);
        }
        Object[] objArr2 = {strF, strB, fValueOf, strConcat};
        String str24 = n6b.a;
        sb3.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr2));
        HashMap map2 = new HashMap();
        String strF5 = od3.f(fVar.w.b);
        String str25 = "background-color:";
        StringBuilder sb4 = new StringBuilder("background-color:");
        sb4.append(strF5);
        String str26 = ";";
        sb4.append(";");
        map2.put(".default_bg,.default_bg *", sb4.toString());
        int i24 = 0;
        while (i24 < fVar.v.size()) {
            ec2 ec2Var = fVar.v.get(i24);
            float f5 = ec2Var.h;
            int i25 = ec2Var.p;
            float f6 = f5 != -3.4028235E38f ? f5 * 100.0f : 50.0f;
            float f7 = f4;
            int i26 = ec2Var.i;
            int i27 = -100;
            int i28 = i26 != i23 ? i26 != i22 ? i19 : -100 : -50;
            float f8 = ec2Var.e;
            if (f8 != r15) {
                if (ec2Var.f != i23) {
                    str = String.format(Locale.US, "%.2f%%", Float.valueOf(f8 * 100.0f));
                    int i29 = ec2Var.g;
                    if (i25 == i23) {
                        i27 = -(i29 != i23 ? i29 != i22 ? 0 : -100 : -50);
                    } else {
                        i27 = i29 != i23 ? i29 != i22 ? 0 : -100 : -50;
                    }
                } else {
                    if (f8 >= 0.0f) {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(f8 * f7));
                        i = 0;
                    } else {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(((-f8) - 1.0f) * f7));
                        i = i23;
                    }
                    i27 = 0;
                }
                f = ec2Var.j;
                if (f != -8388609) {
                    str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f * 100.0f));
                } else {
                    str3 = "fit-content";
                }
                String str27 = str3;
                alignment = ec2Var.b;
                str4 = "end";
                if (alignment == null) {
                    i4 = i23;
                    obj = "center";
                    i3 = 2;
                } else {
                    i2 = a.a[alignment.ordinal()];
                    if (i2 != i23) {
                        i3 = 2;
                        if (i2 != 2) {
                            obj = "center";
                        } else {
                            obj = "end";
                        }
                    } else {
                        i3 = 2;
                        obj = OpsMetricTracker.START;
                    }
                    i4 = 1;
                }
                if (i25 != i4) {
                    str5 = "vertical-rl";
                } else if (i25 != i3) {
                    str5 = "horizontal-tb";
                } else {
                    str5 = "vertical-lr";
                }
                String str28 = str5;
                String strB2 = fVar.b(ec2Var.o, ec2Var.n);
                if (ec2Var.l) {
                    i5 = ec2Var.m;
                } else {
                    i5 = fVar.w.c;
                }
                String strF6 = od3.f(i5);
                str6 = BlockAlignment.RIGHT;
                str7 = VerticalAlignment.TOP;
                i6 = i;
                if (i25 != 1) {
                    if (i6 != 0) {
                        str6 = BlockAlignment.LEFT;
                    }
                    str8 = str6;
                    obj2 = VerticalAlignment.TOP;
                } else if (i25 != 2) {
                    if (i6 != 0) {
                        str7 = VerticalAlignment.BOTTOM;
                    }
                    obj2 = BlockAlignment.LEFT;
                    str8 = str7;
                } else {
                    if (i6 == 0) {
                        str6 = BlockAlignment.LEFT;
                    }
                    str8 = str6;
                    obj2 = VerticalAlignment.TOP;
                }
                if (i25 != 2 || i25 == 1) {
                    str9 = "height";
                    int i30 = i27;
                    i27 = i28;
                    i28 = i30;
                } else {
                    str9 = "width";
                }
                String str29 = str9;
                charSequence = ec2Var.a;
                f2 = fVar.getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = d.a;
                int i31 = i28;
                int i32 = i24;
                if (charSequence == null) {
                    aVar = new d.a(BuildConfig.FLAVOR, vl8.z);
                    str10 = BuildConfig.FLAVOR;
                } else {
                    str10 = BuildConfig.FLAVOR;
                    if (charSequence instanceof Spanned) {
                        spanned = (Spanned) charSequence;
                        hashSet = new HashSet();
                        backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        length = backgroundColorSpanArr.length;
                        i7 = 0;
                        while (i7 < length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i7].getBackgroundColor()));
                            i7++;
                            backgroundColorSpanArr = backgroundColorSpanArr;
                        }
                        map = new HashMap();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            String strA = pp2.a(iIntValue, "bg_");
                            Iterator it2 = it;
                            String strA2 = op3.a(".", strA, ",.", strA, " *");
                            String strF7 = od3.f(iIntValue);
                            String str30 = n6b.a;
                            Locale locale4 = Locale.US;
                            map.put(strA2, str25 + strF7 + str26);
                            it = it2;
                            str4 = str4;
                        }
                        str11 = str4;
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        i8 = 0;
                        for (length2 = spans.length; i8 < length2; length2 = i13) {
                            String str31 = str26;
                            obj3 = spans[i8];
                            String str32 = str25;
                            z = obj3 instanceof StrikethroughSpan;
                            String str33 = null;
                            if (z) {
                                z2 = z;
                                strC = "<span style='text-decoration:line-through;'>";
                            } else {
                                z2 = z;
                                if (obj3 instanceof ForegroundColorSpan) {
                                    String strF8 = od3.f(((ForegroundColorSpan) obj3).getForegroundColor());
                                    String str34 = n6b.a;
                                    Locale locale5 = Locale.US;
                                    strC = sk0.c("<span style='color:", strF8, ";'>");
                                } else {
                                    spans = spans;
                                    if (obj3 instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                        String str35 = n6b.a;
                                        Locale locale6 = Locale.US;
                                        i13 = length2;
                                        strC = pk.d(backgroundColor, "<span class='bg_", "'>");
                                    } else {
                                        i13 = length2;
                                        if (obj3 instanceof n15) {
                                            strC = "<span style='text-combine-upright:all;'>";
                                        } else if (obj3 instanceof AbsoluteSizeSpan) {
                                            absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                            if (absoluteSizeSpan.getDip()) {
                                                size3 = absoluteSizeSpan.getSize();
                                            } else {
                                                size3 = absoluteSizeSpan.getSize() / f2;
                                            }
                                            Object[] objArr3 = {Float.valueOf(size3)};
                                            String str36 = n6b.a;
                                            strC = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr3);
                                        } else if (obj3 instanceof RelativeSizeSpan) {
                                            Object[] objArr4 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                            String str37 = n6b.a;
                                            strC = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr4);
                                        } else if (obj3 instanceof TypefaceSpan) {
                                            family = ((TypefaceSpan) obj3).getFamily();
                                            if (family != null) {
                                                String str38 = n6b.a;
                                                Locale locale7 = Locale.US;
                                                strC = sk0.c("<span style='font-family:\"", family, "\";'>");
                                            } else {
                                                strC = null;
                                            }
                                        } else if (obj3 instanceof StyleSpan) {
                                            style = ((StyleSpan) obj3).getStyle();
                                            if (style != 1) {
                                                strC = "<b>";
                                            } else if (style != 2) {
                                                strC = "<i>";
                                            } else if (style != 3) {
                                                strC = null;
                                            } else {
                                                strC = "<b><i>";
                                            }
                                        } else if (obj3 instanceof ty8) {
                                            i17 = ((ty8) obj3).b;
                                            if (i17 != -1) {
                                                strC = "<ruby style='ruby-position:unset;'>";
                                            } else if (i17 != 1) {
                                                strC = "<ruby style='ruby-position:over;'>";
                                            } else if (i17 != 2) {
                                                strC = null;
                                            } else {
                                                strC = "<ruby style='ruby-position:under;'>";
                                            }
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            strC = "<u>";
                                        } else if (obj3 instanceof oda) {
                                            odaVar = (oda) obj3;
                                            i14 = odaVar.a;
                                            i15 = odaVar.b;
                                            sb2 = new StringBuilder();
                                            if (i15 != 1) {
                                                i16 = 2;
                                                if (i15 == 2) {
                                                    sb2.append("open ");
                                                }
                                            } else {
                                                i16 = 2;
                                                sb2.append("filled ");
                                            }
                                            if (i14 != 0) {
                                                sb2.append("none");
                                            } else if (i14 != 1) {
                                                sb2.append("circle");
                                            } else if (i14 != i16) {
                                                sb2.append("dot");
                                            } else if (i14 != 3) {
                                                sb2.append("unset");
                                            } else {
                                                sb2.append("sesame");
                                            }
                                            String string = sb2.toString();
                                            if (odaVar.c != 2) {
                                                str13 = "over right";
                                            } else {
                                                str13 = "under left";
                                            }
                                            Object[] objArr5 = {string, str13};
                                            String str39 = n6b.a;
                                            strC = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr5);
                                        } else {
                                            strC = null;
                                        }
                                    }
                                }
                                if (z2 && !(obj3 instanceof ForegroundColorSpan) && !(obj3 instanceof BackgroundColorSpan) && !(obj3 instanceof n15) && !(obj3 instanceof AbsoluteSizeSpan) && !(obj3 instanceof RelativeSizeSpan) && !(obj3 instanceof oda)) {
                                    if (obj3 instanceof TypefaceSpan) {
                                        str14 = ((TypefaceSpan) obj3).getFamily() != null ? "</span>" : null;
                                    } else {
                                        if (obj3 instanceof StyleSpan) {
                                            int style2 = ((StyleSpan) obj3).getStyle();
                                            if (style2 == 1) {
                                                str33 = "</b>";
                                            } else if (style2 == 2) {
                                                str33 = "</i>";
                                            } else if (style2 == 3) {
                                                str33 = "</i></b>";
                                            }
                                        } else if (obj3 instanceof ty8) {
                                            str33 = "<rt>" + d.a(((ty8) obj3).a) + "</rt></ruby>";
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            str33 = "</u>";
                                        }
                                        str14 = str33;
                                    }
                                }
                                spanStart = spanned.getSpanStart(obj3);
                                spanEnd = spanned.getSpanEnd(obj3);
                                if (strC != null) {
                                    str14.getClass();
                                    d.b bVar = new d.b(spanStart, spanEnd, strC, str14);
                                    cVar = (d.c) sparseArray.get(spanStart);
                                    if (cVar == null) {
                                        cVar = new d.c();
                                        sparseArray.put(spanStart, cVar);
                                    }
                                    cVar.a.add(bVar);
                                    cVar2 = (d.c) sparseArray.get(spanEnd);
                                    if (cVar2 == null) {
                                        cVar2 = new d.c();
                                        sparseArray.put(spanEnd, cVar2);
                                    }
                                    cVar2.b.add(bVar);
                                }
                                i8++;
                                str26 = str31;
                                str25 = str32;
                                spans = spans;
                            }
                            i13 = length2;
                            str14 = z2 ? "</span>" : "</span>";
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strC != null) {
                                str14.getClass();
                                d.b bVar2 = new d.b(spanStart, spanEnd, strC, str14);
                                cVar = (d.c) sparseArray.get(spanStart);
                                if (cVar == null) {
                                    cVar = new d.c();
                                    sparseArray.put(spanStart, cVar);
                                }
                                cVar.a.add(bVar2);
                                cVar2 = (d.c) sparseArray.get(spanEnd);
                                if (cVar2 == null) {
                                    cVar2 = new d.c();
                                    sparseArray.put(spanEnd, cVar2);
                                }
                                cVar2.b.add(bVar2);
                            }
                            i8++;
                            str26 = str31;
                            str25 = str32;
                            spans = spans;
                        }
                        str26 = str26;
                        str12 = str25;
                        sb = new StringBuilder(spanned.length());
                        i9 = 0;
                        i10 = 0;
                        while (i10 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i10);
                            sb.append(d.a(spanned.subSequence(i9, iKeyAt)));
                            d.c cVar3 = (d.c) sparseArray.get(iKeyAt);
                            ArrayList arrayList3 = cVar3.b;
                            arrayList = cVar3.a;
                            SparseArray sparseArray2 = sparseArray;
                            Collections.sort(arrayList3, d.b.f);
                            arrayList2 = cVar3.b;
                            size = arrayList2.size();
                            i11 = 0;
                            while (i11 < size) {
                                Object obj4 = arrayList2.get(i11);
                                i11++;
                                sb.append(((d.b) obj4).d);
                                arrayList2 = arrayList2;
                            }
                            Collections.sort(arrayList, d.b.e);
                            size2 = arrayList.size();
                            i12 = 0;
                            while (i12 < size2) {
                                Object obj5 = arrayList.get(i12);
                                i12++;
                                sb.append(((d.b) obj5).c);
                            }
                            i10++;
                            i9 = iKeyAt;
                            sparseArray = sparseArray2;
                        }
                        sb.append(d.a(spanned.subSequence(i9, spanned.length())));
                        aVar = new d.a(sb.toString(), map);
                    } else {
                        aVar = new d.a(d.a(charSequence), vl8.z);
                    }
                    for (String str40 : map2.keySet()) {
                        str19 = (String) map2.put(str40, (String) map2.get(str40));
                        if (str19 != null || str19.equals(map2.get(str40))) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        xl7.r(z3);
                    }
                    Integer numValueOf = Integer.valueOf(i32);
                    Float fValueOf2 = Float.valueOf(f6);
                    Integer numValueOf2 = Integer.valueOf(i31);
                    Integer numValueOf3 = Integer.valueOf(i27);
                    f3 = ec2Var.q;
                    if (f3 != 0.0f) {
                        if (i25 != 2 || i25 == 1) {
                            str18 = "skewY";
                        } else {
                            str18 = "skewX";
                        }
                        Object[] objArr6 = {str18, Float.valueOf(f3)};
                        String str41 = n6b.a;
                        str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr6);
                    } else {
                        str15 = str10;
                    }
                    sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf, obj2, fValueOf2, str8, str2, str29, str27, obj, str28, strB2, strF6, numValueOf2, numValueOf3, str15));
                    sb3.append("<span class='default_bg'>");
                    alignment2 = ec2Var.c;
                    str16 = aVar.a;
                    if (alignment2 != null) {
                        i18 = a.a[alignment2.ordinal()];
                        if (i18 != 1) {
                            i22 = 2;
                            if (i18 != 2) {
                                str17 = "center";
                            } else {
                                str17 = str11;
                            }
                        } else {
                            i22 = 2;
                            str17 = OpsMetricTracker.START;
                        }
                        sb3.append("<span style='display:inline-block; text-align:" + str17 + ";'>");
                        sb3.append(str16);
                        sb3.append("</span>");
                    } else {
                        i22 = 2;
                        sb3.append(str16);
                    }
                    sb3.append("</span></div>");
                    i24 = i32 + 1;
                    f4 = f7;
                    str26 = str26;
                    str25 = str12;
                    i19 = 0;
                    i23 = 1;
                    fVar = this;
                }
                str12 = str25;
                str11 = "end";
                while (r0.hasNext()) {
                    str19 = (String) map2.put(str40, (String) map2.get(str40));
                    if (str19 != null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    xl7.r(z3);
                }
                Integer numValueOf4 = Integer.valueOf(i32);
                Float fValueOf3 = Float.valueOf(f6);
                Integer numValueOf5 = Integer.valueOf(i31);
                Integer numValueOf6 = Integer.valueOf(i27);
                f3 = ec2Var.q;
                if (f3 != 0.0f) {
                    if (i25 != 2) {
                        str18 = "skewY";
                    } else {
                        str18 = "skewY";
                    }
                    Object[] objArr7 = {str18, Float.valueOf(f3)};
                    String str42 = n6b.a;
                    str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                } else {
                    str15 = str10;
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf4, obj2, fValueOf3, str8, str2, str29, str27, obj, str28, strB2, strF6, numValueOf5, numValueOf6, str15));
                sb3.append("<span class='default_bg'>");
                alignment2 = ec2Var.c;
                str16 = aVar.a;
                if (alignment2 != null) {
                    i18 = a.a[alignment2.ordinal()];
                    if (i18 != 1) {
                        i22 = 2;
                        if (i18 != 2) {
                            str17 = "center";
                        } else {
                            str17 = str11;
                        }
                    } else {
                        i22 = 2;
                        str17 = OpsMetricTracker.START;
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str17 + ";'>");
                    sb3.append(str16);
                    sb3.append("</span>");
                } else {
                    i22 = 2;
                    sb3.append(str16);
                }
                sb3.append("</span></div>");
                i24 = i32 + 1;
                f4 = f7;
                str26 = str26;
                str25 = str12;
                i19 = 0;
                i23 = 1;
                fVar = this;
            } else {
                str = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - fVar.y) * 100.0f));
            }
            str2 = str;
            i = 0;
            f = ec2Var.j;
            if (f != -8388609) {
                str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f * 100.0f));
            } else {
                str3 = "fit-content";
            }
            String str210 = str3;
            alignment = ec2Var.b;
            str4 = "end";
            if (alignment == null) {
                i4 = i23;
                obj = "center";
                i3 = 2;
            } else {
                i2 = a.a[alignment.ordinal()];
                if (i2 != i23) {
                    i3 = 2;
                    if (i2 != 2) {
                        obj = "center";
                    } else {
                        obj = "end";
                    }
                } else {
                    i3 = 2;
                    obj = OpsMetricTracker.START;
                }
                i4 = 1;
            }
            if (i25 != i4) {
                str5 = "vertical-rl";
            } else if (i25 != i3) {
                str5 = "horizontal-tb";
            } else {
                str5 = "vertical-lr";
            }
            String str211 = str5;
            String strB3 = fVar.b(ec2Var.o, ec2Var.n);
            if (ec2Var.l) {
                i5 = ec2Var.m;
            } else {
                i5 = fVar.w.c;
            }
            String strF9 = od3.f(i5);
            str6 = BlockAlignment.RIGHT;
            str7 = VerticalAlignment.TOP;
            i6 = i;
            if (i25 != 1) {
                if (i6 != 0) {
                    str6 = BlockAlignment.LEFT;
                }
                str8 = str6;
                obj2 = VerticalAlignment.TOP;
            } else if (i25 != 2) {
                if (i6 != 0) {
                    str7 = VerticalAlignment.BOTTOM;
                }
                obj2 = BlockAlignment.LEFT;
                str8 = str7;
            } else {
                if (i6 == 0) {
                    str6 = BlockAlignment.LEFT;
                }
                str8 = str6;
                obj2 = VerticalAlignment.TOP;
            }
            if (i25 != 2) {
                str9 = "height";
                int i33 = i27;
                i27 = i28;
                i28 = i33;
            } else {
                str9 = "height";
                int i34 = i27;
                i27 = i28;
                i28 = i34;
            }
            String str212 = str9;
            charSequence = ec2Var.a;
            f2 = fVar.getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = d.a;
            int i35 = i28;
            int i36 = i24;
            if (charSequence == null) {
                aVar = new d.a(BuildConfig.FLAVOR, vl8.z);
                str10 = BuildConfig.FLAVOR;
            } else {
                str10 = BuildConfig.FLAVOR;
                if (charSequence instanceof Spanned) {
                    aVar = new d.a(d.a(charSequence), vl8.z);
                } else {
                    spanned = (Spanned) charSequence;
                    hashSet = new HashSet();
                    backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    length = backgroundColorSpanArr.length;
                    i7 = 0;
                    while (i7 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i7].getBackgroundColor()));
                        i7++;
                        backgroundColorSpanArr = backgroundColorSpanArr;
                    }
                    map = new HashMap();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        String strA3 = pp2.a(iIntValue2, "bg_");
                        Iterator it3 = it;
                        String strA4 = op3.a(".", strA3, ",.", strA3, " *");
                        String strF10 = od3.f(iIntValue2);
                        String str310 = n6b.a;
                        Locale locale8 = Locale.US;
                        map.put(strA4, str25 + strF10 + str26);
                        it = it3;
                        str4 = str4;
                    }
                    str11 = str4;
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    i8 = 0;
                    while (i8 < length2) {
                        String str311 = str26;
                        obj3 = spans[i8];
                        String str312 = str25;
                        z = obj3 instanceof StrikethroughSpan;
                        String str313 = null;
                        if (z) {
                            z2 = z;
                            strC = "<span style='text-decoration:line-through;'>";
                        } else {
                            z2 = z;
                            if (obj3 instanceof ForegroundColorSpan) {
                                String strF11 = od3.f(((ForegroundColorSpan) obj3).getForegroundColor());
                                String str314 = n6b.a;
                                Locale locale9 = Locale.US;
                                strC = sk0.c("<span style='color:", strF11, ";'>");
                            } else {
                                spans = spans;
                                if (obj3 instanceof BackgroundColorSpan) {
                                    int backgroundColor2 = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                    String str315 = n6b.a;
                                    Locale locale10 = Locale.US;
                                    i13 = length2;
                                    strC = pk.d(backgroundColor2, "<span class='bg_", "'>");
                                } else {
                                    i13 = length2;
                                    if (obj3 instanceof n15) {
                                        strC = "<span style='text-combine-upright:all;'>";
                                    } else if (obj3 instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                        if (absoluteSizeSpan.getDip()) {
                                            size3 = absoluteSizeSpan.getSize();
                                        } else {
                                            size3 = absoluteSizeSpan.getSize() / f2;
                                        }
                                        Object[] objArr8 = {Float.valueOf(size3)};
                                        String str316 = n6b.a;
                                        strC = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr8);
                                    } else if (obj3 instanceof RelativeSizeSpan) {
                                        Object[] objArr9 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                        String str317 = n6b.a;
                                        strC = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr9);
                                    } else if (obj3 instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj3).getFamily();
                                        if (family != null) {
                                            String str318 = n6b.a;
                                            Locale locale11 = Locale.US;
                                            strC = sk0.c("<span style='font-family:\"", family, "\";'>");
                                        } else {
                                            strC = null;
                                        }
                                    } else if (obj3 instanceof StyleSpan) {
                                        style = ((StyleSpan) obj3).getStyle();
                                        if (style != 1) {
                                            strC = "<b>";
                                        } else if (style != 2) {
                                            strC = "<i>";
                                        } else if (style != 3) {
                                            strC = null;
                                        } else {
                                            strC = "<b><i>";
                                        }
                                    } else if (obj3 instanceof ty8) {
                                        i17 = ((ty8) obj3).b;
                                        if (i17 != -1) {
                                            strC = "<ruby style='ruby-position:unset;'>";
                                        } else if (i17 != 1) {
                                            strC = "<ruby style='ruby-position:over;'>";
                                        } else if (i17 != 2) {
                                            strC = null;
                                        } else {
                                            strC = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj3 instanceof UnderlineSpan) {
                                        strC = "<u>";
                                    } else if (obj3 instanceof oda) {
                                        odaVar = (oda) obj3;
                                        i14 = odaVar.a;
                                        i15 = odaVar.b;
                                        sb2 = new StringBuilder();
                                        if (i15 != 1) {
                                            i16 = 2;
                                            if (i15 == 2) {
                                                sb2.append("open ");
                                            }
                                        } else {
                                            i16 = 2;
                                            sb2.append("filled ");
                                        }
                                        if (i14 != 0) {
                                            sb2.append("none");
                                        } else if (i14 != 1) {
                                            sb2.append("circle");
                                        } else if (i14 != i16) {
                                            sb2.append("dot");
                                        } else if (i14 != 3) {
                                            sb2.append("unset");
                                        } else {
                                            sb2.append("sesame");
                                        }
                                        String string2 = sb2.toString();
                                        if (odaVar.c != 2) {
                                            str13 = "over right";
                                        } else {
                                            str13 = "under left";
                                        }
                                        Object[] objArr10 = {string2, str13};
                                        String str319 = n6b.a;
                                        strC = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr10);
                                    } else {
                                        strC = null;
                                    }
                                }
                            }
                            if (z2) {
                            }
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strC != null) {
                                str14.getClass();
                                d.b bVar3 = new d.b(spanStart, spanEnd, strC, str14);
                                cVar = (d.c) sparseArray.get(spanStart);
                                if (cVar == null) {
                                    cVar = new d.c();
                                    sparseArray.put(spanStart, cVar);
                                }
                                cVar.a.add(bVar3);
                                cVar2 = (d.c) sparseArray.get(spanEnd);
                                if (cVar2 == null) {
                                    cVar2 = new d.c();
                                    sparseArray.put(spanEnd, cVar2);
                                }
                                cVar2.b.add(bVar3);
                            }
                            i8++;
                            str26 = str311;
                            str25 = str312;
                            spans = spans;
                        }
                        i13 = length2;
                        if (z2) {
                        }
                        spanStart = spanned.getSpanStart(obj3);
                        spanEnd = spanned.getSpanEnd(obj3);
                        if (strC != null) {
                            str14.getClass();
                            d.b bVar4 = new d.b(spanStart, spanEnd, strC, str14);
                            cVar = (d.c) sparseArray.get(spanStart);
                            if (cVar == null) {
                                cVar = new d.c();
                                sparseArray.put(spanStart, cVar);
                            }
                            cVar.a.add(bVar4);
                            cVar2 = (d.c) sparseArray.get(spanEnd);
                            if (cVar2 == null) {
                                cVar2 = new d.c();
                                sparseArray.put(spanEnd, cVar2);
                            }
                            cVar2.b.add(bVar4);
                        }
                        i8++;
                        str26 = str311;
                        str25 = str312;
                        spans = spans;
                    }
                    str26 = str26;
                    str12 = str25;
                    sb = new StringBuilder(spanned.length());
                    i9 = 0;
                    i10 = 0;
                    while (i10 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i10);
                        sb.append(d.a(spanned.subSequence(i9, iKeyAt2)));
                        d.c cVar4 = (d.c) sparseArray.get(iKeyAt2);
                        ArrayList arrayList4 = cVar4.b;
                        arrayList = cVar4.a;
                        SparseArray sparseArray3 = sparseArray;
                        Collections.sort(arrayList4, d.b.f);
                        arrayList2 = cVar4.b;
                        size = arrayList2.size();
                        i11 = 0;
                        while (i11 < size) {
                            Object obj6 = arrayList2.get(i11);
                            i11++;
                            sb.append(((d.b) obj6).d);
                            arrayList2 = arrayList2;
                        }
                        Collections.sort(arrayList, d.b.e);
                        size2 = arrayList.size();
                        i12 = 0;
                        while (i12 < size2) {
                            Object obj7 = arrayList.get(i12);
                            i12++;
                            sb.append(((d.b) obj7).c);
                        }
                        i10++;
                        i9 = iKeyAt2;
                        sparseArray = sparseArray3;
                    }
                    sb.append(d.a(spanned.subSequence(i9, spanned.length())));
                    aVar = new d.a(sb.toString(), map);
                }
                while (r0.hasNext()) {
                    str19 = (String) map2.put(str40, (String) map2.get(str40));
                    if (str19 != null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    xl7.r(z3);
                }
                Integer numValueOf7 = Integer.valueOf(i36);
                Float fValueOf4 = Float.valueOf(f6);
                Integer numValueOf8 = Integer.valueOf(i35);
                Integer numValueOf9 = Integer.valueOf(i27);
                f3 = ec2Var.q;
                if (f3 != 0.0f) {
                    if (i25 != 2) {
                        str18 = "skewY";
                    } else {
                        str18 = "skewY";
                    }
                    Object[] objArr11 = {str18, Float.valueOf(f3)};
                    String str43 = n6b.a;
                    str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr11);
                } else {
                    str15 = str10;
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf7, obj2, fValueOf4, str8, str2, str212, str210, obj, str211, strB3, strF9, numValueOf8, numValueOf9, str15));
                sb3.append("<span class='default_bg'>");
                alignment2 = ec2Var.c;
                str16 = aVar.a;
                if (alignment2 != null) {
                    i18 = a.a[alignment2.ordinal()];
                    if (i18 != 1) {
                        i22 = 2;
                        if (i18 != 2) {
                            str17 = "center";
                        } else {
                            str17 = str11;
                        }
                    } else {
                        i22 = 2;
                        str17 = OpsMetricTracker.START;
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str17 + ";'>");
                    sb3.append(str16);
                    sb3.append("</span>");
                } else {
                    i22 = 2;
                    sb3.append(str16);
                }
                sb3.append("</span></div>");
                i24 = i36 + 1;
                f4 = f7;
                str26 = str26;
                str25 = str12;
                i19 = 0;
                i23 = 1;
                fVar = this;
            }
            str12 = str25;
            str11 = "end";
            while (r0.hasNext()) {
                str19 = (String) map2.put(str40, (String) map2.get(str40));
                if (str19 != null) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                xl7.r(z3);
            }
            Integer numValueOf10 = Integer.valueOf(i36);
            Float fValueOf5 = Float.valueOf(f6);
            Integer numValueOf11 = Integer.valueOf(i35);
            Integer numValueOf12 = Integer.valueOf(i27);
            f3 = ec2Var.q;
            if (f3 != 0.0f) {
                if (i25 != 2) {
                    str18 = "skewY";
                } else {
                    str18 = "skewY";
                }
                Object[] objArr12 = {str18, Float.valueOf(f3)};
                String str44 = n6b.a;
                str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr12);
            } else {
                str15 = str10;
            }
            sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf10, obj2, fValueOf5, str8, str2, str212, str210, obj, str211, strB3, strF9, numValueOf11, numValueOf12, str15));
            sb3.append("<span class='default_bg'>");
            alignment2 = ec2Var.c;
            str16 = aVar.a;
            if (alignment2 != null) {
                i18 = a.a[alignment2.ordinal()];
                if (i18 != 1) {
                    i22 = 2;
                    if (i18 != 2) {
                        str17 = "center";
                    } else {
                        str17 = str11;
                    }
                } else {
                    i22 = 2;
                    str17 = OpsMetricTracker.START;
                }
                sb3.append("<span style='display:inline-block; text-align:" + str17 + ";'>");
                sb3.append(str16);
                sb3.append("</span>");
            } else {
                i22 = 2;
                sb3.append(str16);
            }
            sb3.append("</span></div>");
            i24 = i36 + 1;
            f4 = f7;
            str26 = str26;
            str25 = str12;
            i19 = 0;
            i23 = 1;
            fVar = this;
        }
        sb3.append("</div></body></html>");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("<html><head><style>");
        for (String str45 : map2.keySet()) {
            sb5.append(str45);
            sb5.append("{");
            sb5.append((String) map2.get(str45));
            sb5.append("}");
        }
        sb5.append("</style></head>");
        sb3.insert(0, (CharSequence) sb5);
        this.u.loadData(Base64.encodeToString(sb3.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.v.isEmpty()) {
            return;
        }
        c();
    }
}
