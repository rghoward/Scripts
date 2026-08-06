package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import defpackage.hh8;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public boolean a = false;
    public String b;
    public EnumC0009a c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class EnumC0009a {
        public static final EnumC0009a A;
        public static final /* synthetic */ EnumC0009a[] B;
        public static final EnumC0009a t;
        public static final EnumC0009a u;
        public static final EnumC0009a v;
        public static final EnumC0009a w;
        public static final EnumC0009a x;
        public static final EnumC0009a y;
        public static final EnumC0009a z;

        static {
            EnumC0009a enumC0009a = new EnumC0009a("INT_TYPE", 0);
            t = enumC0009a;
            EnumC0009a enumC0009a2 = new EnumC0009a("FLOAT_TYPE", 1);
            u = enumC0009a2;
            EnumC0009a enumC0009a3 = new EnumC0009a("COLOR_TYPE", 2);
            v = enumC0009a3;
            EnumC0009a enumC0009a4 = new EnumC0009a("COLOR_DRAWABLE_TYPE", 3);
            w = enumC0009a4;
            EnumC0009a enumC0009a5 = new EnumC0009a("STRING_TYPE", 4);
            x = enumC0009a5;
            EnumC0009a enumC0009a6 = new EnumC0009a("BOOLEAN_TYPE", 5);
            y = enumC0009a6;
            EnumC0009a enumC0009a7 = new EnumC0009a("DIMENSION_TYPE", 6);
            z = enumC0009a7;
            EnumC0009a enumC0009a8 = new EnumC0009a("REFERENCE_TYPE", 7);
            A = enumC0009a8;
            B = new EnumC0009a[]{enumC0009a, enumC0009a2, enumC0009a3, enumC0009a4, enumC0009a5, enumC0009a6, enumC0009a7, enumC0009a8};
        }

        public EnumC0009a() {
            throw null;
        }

        public static EnumC0009a valueOf(String str) {
            return (EnumC0009a) Enum.valueOf(EnumC0009a.class, str);
        }

        public static EnumC0009a[] values() {
            return (EnumC0009a[]) B.clone();
        }
    }

    public a(a aVar, Object obj) {
        this.b = aVar.b;
        this.c = aVar.c;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), hh8.f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf = null;
        EnumC0009a enumC0009a = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC0009a = EnumC0009a.y;
            } else if (index == 3) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                enumC0009a = EnumC0009a.v;
            } else if (index == 2) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                enumC0009a = EnumC0009a.w;
            } else {
                EnumC0009a enumC0009a2 = EnumC0009a.z;
                if (index == 7) {
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    enumC0009a = EnumC0009a.u;
                } else if (index == 6) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    enumC0009a = EnumC0009a.t;
                } else if (index == 9) {
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    enumC0009a = EnumC0009a.x;
                } else if (index == 8) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                    enumC0009a = EnumC0009a.A;
                }
                enumC0009a = enumC0009a2;
            }
        }
        if (string != null && objValueOf != null) {
            a aVar = new a();
            aVar.b = string;
            aVar.c = enumC0009a;
            aVar.a = z;
            aVar.b(objValueOf);
            map.put(string, aVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (this.c.ordinal()) {
            case 0:
            case 7:
                this.d = ((Integer) obj).intValue();
                break;
            case 1:
                this.e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f = (String) obj;
                break;
            case 5:
                this.g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.e = ((Float) obj).floatValue();
                break;
        }
    }
}
