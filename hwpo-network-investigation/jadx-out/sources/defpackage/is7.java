package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import io.ably.lib.util.Crypto;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class is7 {
    /* JADX WARN: Code duplicated, block: B:129:0x037c  */
    /* JADX WARN: Code duplicated, block: B:148:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:149:0x0402  */
    /* JADX WARN: Code duplicated, block: B:155:0x041c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x041e  */
    /* JADX WARN: Code duplicated, block: B:157:0x0426  */
    /* JADX WARN: Code duplicated, block: B:164:0x043f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x0441  */
    /* JADX WARN: Code duplicated, block: B:167:0x0449  */
    /* JADX WARN: Code duplicated, block: B:170:0x0459  */
    /* JADX WARN: Code duplicated, block: B:171:0x045c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0462  */
    /* JADX WARN: Code duplicated, block: B:54:0x014d  */
    public static final es7 a(int i, jt1 jt1Var, int i2) {
        TypedValue typedValueB;
        int i3;
        long jC;
        int i4;
        int i5;
        char c;
        int i6;
        int i7;
        int i8;
        mp1 mp1VarB;
        int i9;
        Shader shader;
        fx0 aw9Var;
        Shader shader2;
        fx0 aw9Var2;
        fx0 fx0Var;
        int i10;
        Context context = (Context) jt1Var.F(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) jt1Var.F(AndroidCompositionLocals_androidKt.c);
        wt8 wt8Var = (wt8) jt1Var.F(AndroidCompositionLocals_androidKt.e);
        synchronized (wt8Var) {
            typedValueB = wt8Var.a.b(i);
            i3 = 1;
            if (typedValueB == null) {
                typedValueB = new TypedValue();
                resources.getValue(i, typedValueB, true);
                e27<TypedValue> e27Var = wt8Var.a;
                int iD = e27Var.d(i);
                Object[] objArr = e27Var.c;
                Object obj = objArr[iD];
                e27Var.b[iD] = i;
                objArr[iD] = typedValueB;
            }
        }
        CharSequence charSequence = typedValueB.string;
        if (charSequence == null || !z2a.r(".xml", charSequence)) {
            jt1Var.K(-1771643000);
            boolean zJ = jt1Var.J(context.getTheme()) | jt1Var.J(charSequence) | ((((i2 & 14) ^ 6) > 4 && jt1Var.h(i)) || (i2 & 6) == 4);
            Object objF = jt1Var.f();
            if (zJ || objF == jt1.a.a) {
                try {
                    Drawable drawable = resources.getDrawable(i, null);
                    drawable.getClass();
                    objF = new po(((BitmapDrawable) drawable).getBitmap());
                    jt1Var.C(objF);
                } catch (Exception e) {
                    throw new du8("Error attempting to load resource: " + ((Object) charSequence), e);
                }
            }
            l75 l75Var = (l75) objF;
            pq0 pq0Var = new pq0(l75Var, (((long) l75Var.h()) & 4294967295L) | (((long) l75Var.j()) << 32));
            jt1Var.B();
            return pq0Var;
        }
        jt1Var.K(-1771798434);
        Resources.Theme theme = context.getTheme();
        int i11 = typedValueB.changingConfigurations;
        o85 o85Var = (o85) jt1Var.F(AndroidCompositionLocals_androidKt.d);
        o85.b bVar = new o85.b(theme, i);
        WeakReference<o85.a> weakReference = o85Var.a.get(bVar);
        o85.a aVar = weakReference != null ? weakReference.get() : null;
        if (aVar == null) {
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!xj5.a(xml.getName(), "vector")) {
                z90.a("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            ws wsVar = new ws(xml);
            TypedArray typedArrayD = iza.d(resources, theme, attributeSetAsAttributeSet, xs.t);
            wsVar.b(typedArrayD.getChangingConfigurations());
            boolean z = !iza.c(xml, "autoMirrored") ? false : typedArrayD.getBoolean(5, false);
            wsVar.b(typedArrayD.getChangingConfigurations());
            float fA = wsVar.a(typedArrayD, "viewportWidth", 7, 0.0f);
            float fA2 = wsVar.a(typedArrayD, "viewportHeight", 8, 0.0f);
            if (fA <= 0.0f) {
                throw new XmlPullParserException(typedArrayD.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (fA2 <= 0.0f) {
                throw new XmlPullParserException(typedArrayD.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            int i12 = 3;
            float dimension = typedArrayD.getDimension(3, 0.0f);
            wsVar.b(typedArrayD.getChangingConfigurations());
            float dimension2 = typedArrayD.getDimension(2, 0.0f);
            wsVar.b(typedArrayD.getChangingConfigurations());
            if (typedArrayD.hasValue(1)) {
                TypedValue typedValue = new TypedValue();
                typedArrayD.getValue(1, typedValue);
                if (typedValue.type == 2) {
                    jC = uh1.k;
                } else {
                    ColorStateList colorStateListA = iza.a(typedArrayD, xml, theme);
                    wsVar.b(typedArrayD.getChangingConfigurations());
                    jC = colorStateListA != null ? u7d.c(colorStateListA.getDefaultColor()) : uh1.k;
                }
            } else {
                jC = uh1.k;
            }
            long j = jC;
            int i13 = typedArrayD.getInt(6, -1);
            wsVar.b(typedArrayD.getChangingConfigurations());
            if (i13 == -1) {
                i4 = 5;
            } else if (i13 == 3) {
                i4 = 3;
            } else if (i13 == 5) {
                i4 = 5;
            } else if (i13 != 9) {
                switch (i13) {
                    case 14:
                        i4 = 13;
                        break;
                    case h4c.e /* 15 */:
                        i4 = 14;
                        break;
                    case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                        i4 = 12;
                        break;
                    default:
                        i4 = 5;
                        break;
                }
            } else {
                i4 = 9;
            }
            float f = dimension / resources.getDisplayMetrics().density;
            float f2 = dimension2 / resources.getDisplayMetrics().density;
            typedArrayD.recycle();
            n85.a aVar2 = new n85.a(null, f, f2, fA, fA2, j, i4, z, 1);
            int i14 = 0;
            while (xml.getEventType() != i3 && (xml.getDepth() >= i3 || xml.getEventType() != i12)) {
                List listA = hf3.t;
                XmlPullParser xmlPullParser = wsVar.a;
                int i15 = i3;
                lu7 lu7Var = wsVar.c;
                XmlResourceParser xmlResourceParser = xml;
                int eventType = xmlPullParser.getEventType();
                int i16 = i11;
                if (eventType != 2) {
                    if (eventType != i12) {
                        i5 = i15;
                    } else if ("group".equals(xmlPullParser.getName())) {
                        int i17 = i14 + 1;
                        int i18 = 0;
                        while (i18 < i17) {
                            ArrayList<n85.a.C0205a> arrayList = aVar2.i;
                            if (aVar2.k) {
                                uc5.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            n85.a.C0205a c0205aRemove = arrayList.remove(arrayList.size() - 1);
                            ((n85.a.C0205a) p51.b(i15, arrayList)).j.add(new ycb(c0205aRemove.a, c0205aRemove.b, c0205aRemove.c, c0205aRemove.d, c0205aRemove.e, c0205aRemove.f, c0205aRemove.g, c0205aRemove.h, c0205aRemove.i, c0205aRemove.j));
                            i18++;
                            i12 = 3;
                            i15 = 1;
                        }
                        i12 = i12;
                        i5 = 1;
                        i14 = 0;
                        c = '\t';
                    } else {
                        i5 = 1;
                    }
                    c = '\t';
                    i14 = i14;
                } else {
                    String name = xmlPullParser.getName();
                    if (name != null) {
                        int iHashCode = name.hashCode();
                        if (iHashCode != -1649314686) {
                            i14 = i14;
                            if (iHashCode != 3433509) {
                                if (iHashCode == 98629247 && name.equals("group")) {
                                    TypedArray typedArrayD2 = iza.d(resources, theme, attributeSetAsAttributeSet, xs.u);
                                    wsVar.b(typedArrayD2.getChangingConfigurations());
                                    float fA3 = wsVar.a(typedArrayD2, "rotation", 5, 0.0f);
                                    float f3 = typedArrayD2.getFloat(1, 0.0f);
                                    wsVar.b(typedArrayD2.getChangingConfigurations());
                                    float f4 = typedArrayD2.getFloat(2, 0.0f);
                                    wsVar.b(typedArrayD2.getChangingConfigurations());
                                    float fA4 = wsVar.a(typedArrayD2, "scaleX", 3, 1.0f);
                                    float fA5 = wsVar.a(typedArrayD2, "scaleY", 4, 1.0f);
                                    float fA6 = wsVar.a(typedArrayD2, "translateX", 6, 0.0f);
                                    float fA7 = wsVar.a(typedArrayD2, "translateY", 7, 0.0f);
                                    String string = typedArrayD2.getString(0);
                                    wsVar.b(typedArrayD2.getChangingConfigurations());
                                    String str = string == null ? BuildConfig.FLAVOR : string;
                                    typedArrayD2.recycle();
                                    int i19 = zcb.a;
                                    if (aVar2.k) {
                                        uc5.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    aVar2.i.add(new n85.a.C0205a(str, fA3, f3, f4, fA4, fA5, fA6, fA7, listA, 512));
                                    i14 = i14;
                                    i5 = 1;
                                    c = '\t';
                                    i12 = 3;
                                }
                            } else if (name.equals("path")) {
                                TypedArray typedArrayD3 = iza.d(resources, theme, attributeSetAsAttributeSet, xs.v);
                                wsVar.b(typedArrayD3.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    z90.a("No path data available");
                                    return null;
                                }
                                String string2 = typedArrayD3.getString(0);
                                wsVar.b(typedArrayD3.getChangingConfigurations());
                                String str2 = string2 == null ? BuildConfig.FLAVOR : string2;
                                String string3 = typedArrayD3.getString(2);
                                wsVar.b(typedArrayD3.getChangingConfigurations());
                                if (string3 == null) {
                                    int i20 = zcb.a;
                                } else {
                                    listA = lu7.a(lu7Var, string3);
                                }
                                List list = listA;
                                mp1 mp1VarB2 = iza.b(typedArrayD3, wsVar.a, theme, "fillColor", 1);
                                wsVar.b(typedArrayD3.getChangingConfigurations());
                                float fA8 = wsVar.a(typedArrayD3, "fillAlpha", 12, 1.0f);
                                int i21 = !iza.c(wsVar.a, "strokeLineCap") ? -1 : typedArrayD3.getInt(8, -1);
                                wsVar.b(typedArrayD3.getChangingConfigurations());
                                if (i21 == 0) {
                                    i6 = 0;
                                } else if (i21 == 1) {
                                    i6 = 1;
                                } else if (i21 != 2) {
                                    i6 = 0;
                                } else {
                                    i6 = 2;
                                }
                                if (iza.c(wsVar.a, "strokeLineJoin")) {
                                    c = '\t';
                                    i7 = typedArrayD3.getInt(9, -1);
                                } else {
                                    c = '\t';
                                    i7 = -1;
                                }
                                wsVar.b(typedArrayD3.getChangingConfigurations());
                                if (i7 != 0) {
                                    if (i7 == 1) {
                                        i8 = 1;
                                    } else if (i7 == 2) {
                                        i8 = 2;
                                    }
                                    float fA9 = wsVar.a(typedArrayD3, "strokeMiterLimit", 10, 4.0f);
                                    mp1VarB = iza.b(typedArrayD3, wsVar.a, theme, "strokeColor", 3);
                                    wsVar.b(typedArrayD3.getChangingConfigurations());
                                    float fA10 = wsVar.a(typedArrayD3, "strokeAlpha", 11, 1.0f);
                                    float fA11 = wsVar.a(typedArrayD3, "strokeWidth", 4, 1.0f);
                                    float fA12 = wsVar.a(typedArrayD3, "trimPathEnd", 6, 1.0f);
                                    float fA13 = wsVar.a(typedArrayD3, "trimPathOffset", 7, 0.0f);
                                    float fA14 = wsVar.a(typedArrayD3, "trimPathStart", 5, 0.0f);
                                    if (iza.c(wsVar.a, "fillType")) {
                                        i9 = typedArrayD3.getInt(13, 0);
                                    } else {
                                        i9 = 0;
                                    }
                                    wsVar.b(typedArrayD3.getChangingConfigurations());
                                    typedArrayD3.recycle();
                                    shader = mp1VarB2.a;
                                    if (shader == null && mp1VarB2.c == 0) {
                                        aw9Var = null;
                                    } else if (shader != null) {
                                        aw9Var = new gx0(shader);
                                    } else {
                                        aw9Var = new aw9(u7d.c(mp1VarB2.c));
                                    }
                                    shader2 = mp1VarB.a;
                                    if (shader2 != null && mp1VarB.c == 0) {
                                        fx0Var = null;
                                    } else {
                                        if (shader2 != null) {
                                            aw9Var2 = new gx0(shader2);
                                        } else {
                                            aw9Var2 = new aw9(u7d.c(mp1VarB.c));
                                        }
                                        fx0Var = aw9Var2;
                                    }
                                    if (i9 == 0) {
                                        i10 = 0;
                                    } else {
                                        i10 = 1;
                                    }
                                    if (aVar2.k) {
                                        uc5.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    ((n85.a.C0205a) p51.b(1, aVar2.i)).j.add(new ddb(str2, list, i10, aw9Var, fA8, fx0Var, fA10, fA11, i6, i8, fA9, fA14, fA12, fA13));
                                    i12 = 3;
                                    i14 = i14;
                                    i5 = 1;
                                }
                                i8 = 0;
                                float fA15 = wsVar.a(typedArrayD3, "strokeMiterLimit", 10, 4.0f);
                                mp1VarB = iza.b(typedArrayD3, wsVar.a, theme, "strokeColor", 3);
                                wsVar.b(typedArrayD3.getChangingConfigurations());
                                float fA16 = wsVar.a(typedArrayD3, "strokeAlpha", 11, 1.0f);
                                float fA17 = wsVar.a(typedArrayD3, "strokeWidth", 4, 1.0f);
                                float fA18 = wsVar.a(typedArrayD3, "trimPathEnd", 6, 1.0f);
                                float fA19 = wsVar.a(typedArrayD3, "trimPathOffset", 7, 0.0f);
                                float fA110 = wsVar.a(typedArrayD3, "trimPathStart", 5, 0.0f);
                                if (iza.c(wsVar.a, "fillType")) {
                                    i9 = 0;
                                } else {
                                    i9 = typedArrayD3.getInt(13, 0);
                                }
                                wsVar.b(typedArrayD3.getChangingConfigurations());
                                typedArrayD3.recycle();
                                shader = mp1VarB2.a;
                                if (shader == null) {
                                    aw9Var = null;
                                } else if (shader != null) {
                                    aw9Var = new gx0(shader);
                                } else {
                                    aw9Var = new aw9(u7d.c(mp1VarB2.c));
                                }
                                shader2 = mp1VarB.a;
                                if (shader2 != null) {
                                    if (shader2 != null) {
                                        aw9Var2 = new gx0(shader2);
                                    } else {
                                        aw9Var2 = new aw9(u7d.c(mp1VarB.c));
                                    }
                                    fx0Var = aw9Var2;
                                } else {
                                    fx0Var = null;
                                }
                                if (i9 == 0) {
                                    i10 = 0;
                                } else {
                                    i10 = 1;
                                }
                                if (aVar2.k) {
                                    uc5.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ((n85.a.C0205a) p51.b(1, aVar2.i)).j.add(new ddb(str2, list, i10, aw9Var, fA8, fx0Var, fA16, fA17, i6, i8, fA15, fA110, fA18, fA19));
                                i12 = 3;
                                i14 = i14;
                                i5 = 1;
                            }
                        } else {
                            i14 = i14;
                            c = '\t';
                            i12 = 3;
                            if (name.equals("clip-path")) {
                                TypedArray typedArrayD4 = iza.d(resources, theme, attributeSetAsAttributeSet, xs.w);
                                wsVar.b(typedArrayD4.getChangingConfigurations());
                                String string4 = typedArrayD4.getString(0);
                                wsVar.b(typedArrayD4.getChangingConfigurations());
                                String str3 = string4 == null ? BuildConfig.FLAVOR : string4;
                                i5 = 1;
                                String string5 = typedArrayD4.getString(1);
                                wsVar.b(typedArrayD4.getChangingConfigurations());
                                if (string5 == null) {
                                    int i22 = zcb.a;
                                } else {
                                    listA = lu7.a(lu7Var, string5);
                                }
                                List list2 = listA;
                                typedArrayD4.recycle();
                                if (aVar2.k) {
                                    uc5.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                aVar2.i.add(new n85.a.C0205a(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                                i14++;
                            } else {
                                i5 = 1;
                                i14 = i14;
                            }
                        }
                    } else {
                        i14 = i14;
                    }
                    i5 = 1;
                    c = '\t';
                    i12 = 3;
                    i14 = i14;
                }
                xmlResourceParser.next();
                i3 = i5;
                xml = xmlResourceParser;
                i11 = i16;
                i12 = i12;
            }
            aVar = new o85.a(aVar2.b(), i11 | wsVar.b);
            o85Var.a.put(bVar, new WeakReference<>(aVar));
        }
        bdb bdbVarC = cdb.c(aVar.a, jt1Var);
        jt1Var.B();
        return bdbVarC;
    }
}
