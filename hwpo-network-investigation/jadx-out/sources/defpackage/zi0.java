package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.hwpo_training_app.R;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zi0 {
    public final a a;
    public final a b = new a();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    public int l;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0295a();
        public Integer A;
        public String C;
        public Locale G;
        public CharSequence H;
        public CharSequence I;
        public int J;
        public int K;
        public Integer L;
        public Integer N;
        public Integer O;
        public Integer P;
        public Integer Q;
        public Integer R;
        public Integer S;
        public Integer T;
        public Integer U;
        public Integer V;
        public Boolean W;
        public Integer X;
        public int t;
        public Integer u;
        public Integer v;
        public Integer w;
        public Integer x;
        public Integer y;
        public Integer z;
        public int B = 255;
        public int D = -2;
        public int E = -2;
        public int F = -2;
        public Boolean M = Boolean.TRUE;

        /* JADX INFO: renamed from: zi0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class C0295a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                a aVar = new a();
                aVar.B = 255;
                aVar.D = -2;
                aVar.E = -2;
                aVar.F = -2;
                aVar.M = Boolean.TRUE;
                aVar.t = parcel.readInt();
                aVar.u = (Integer) parcel.readSerializable();
                aVar.v = (Integer) parcel.readSerializable();
                aVar.w = (Integer) parcel.readSerializable();
                aVar.x = (Integer) parcel.readSerializable();
                aVar.y = (Integer) parcel.readSerializable();
                aVar.z = (Integer) parcel.readSerializable();
                aVar.A = (Integer) parcel.readSerializable();
                aVar.B = parcel.readInt();
                aVar.C = parcel.readString();
                aVar.D = parcel.readInt();
                aVar.E = parcel.readInt();
                aVar.F = parcel.readInt();
                aVar.H = parcel.readString();
                aVar.I = parcel.readString();
                aVar.J = parcel.readInt();
                aVar.L = (Integer) parcel.readSerializable();
                aVar.N = (Integer) parcel.readSerializable();
                aVar.O = (Integer) parcel.readSerializable();
                aVar.P = (Integer) parcel.readSerializable();
                aVar.Q = (Integer) parcel.readSerializable();
                aVar.R = (Integer) parcel.readSerializable();
                aVar.S = (Integer) parcel.readSerializable();
                aVar.V = (Integer) parcel.readSerializable();
                aVar.T = (Integer) parcel.readSerializable();
                aVar.U = (Integer) parcel.readSerializable();
                aVar.M = (Boolean) parcel.readSerializable();
                aVar.G = (Locale) parcel.readSerializable();
                aVar.W = (Boolean) parcel.readSerializable();
                aVar.X = (Integer) parcel.readSerializable();
                return aVar;
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.t);
            parcel.writeSerializable(this.u);
            parcel.writeSerializable(this.v);
            parcel.writeSerializable(this.w);
            parcel.writeSerializable(this.x);
            parcel.writeSerializable(this.y);
            parcel.writeSerializable(this.z);
            parcel.writeSerializable(this.A);
            parcel.writeInt(this.B);
            parcel.writeString(this.C);
            parcel.writeInt(this.D);
            parcel.writeInt(this.E);
            parcel.writeInt(this.F);
            CharSequence charSequence = this.H;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.I;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.J);
            parcel.writeSerializable(this.L);
            parcel.writeSerializable(this.N);
            parcel.writeSerializable(this.O);
            parcel.writeSerializable(this.P);
            parcel.writeSerializable(this.Q);
            parcel.writeSerializable(this.R);
            parcel.writeSerializable(this.S);
            parcel.writeSerializable(this.V);
            parcel.writeSerializable(this.T);
            parcel.writeSerializable(this.U);
            parcel.writeSerializable(this.M);
            parcel.writeSerializable(this.G);
            parcel.writeSerializable(this.W);
            parcel.writeSerializable(this.X);
        }
    }

    public zi0(Context context, a aVar) {
        AttributeSet attributeSetAsAttributeSet;
        int styleAttribute;
        int next;
        aVar = aVar == null ? new a() : aVar;
        int i = aVar.t;
        if (i != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), MetricTracker.Object.BADGE)) {
                    throw new XmlPullParserException("Must have a <" + ((Object) MetricTracker.Object.BADGE) + "> start tag");
                }
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSetAsAttributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayD = vka.d(context, attributeSetAsAttributeSet, bh8.c, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.c = typedArrayD.getDimensionPixelSize(5, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = typedArrayD.getDimensionPixelSize(15, -1);
        this.e = typedArrayD.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.g = typedArrayD.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = typedArrayD.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.h = typedArrayD.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = typedArrayD.getInt(25, 1);
        this.l = typedArrayD.getInt(2, 0);
        a aVar2 = this.b;
        int i2 = aVar.B;
        aVar2.B = i2 == -2 ? 255 : i2;
        int i3 = aVar.D;
        if (i3 != -2) {
            aVar2.D = i3;
        } else {
            boolean zHasValue = typedArrayD.hasValue(24);
            a aVar3 = this.b;
            if (zHasValue) {
                aVar3.D = typedArrayD.getInt(24, 0);
            } else {
                aVar3.D = -1;
            }
        }
        String str = aVar.C;
        if (str != null) {
            this.b.C = str;
        } else if (typedArrayD.hasValue(8)) {
            this.b.C = typedArrayD.getString(8);
        }
        a aVar4 = this.b;
        aVar4.H = aVar.H;
        CharSequence charSequence = aVar.I;
        aVar4.I = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        a aVar5 = this.b;
        int i4 = aVar.J;
        aVar5.J = i4 == 0 ? R.plurals.mtrl_badge_content_description : i4;
        int i5 = aVar.K;
        aVar5.K = i5 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i5;
        Boolean bool = aVar.M;
        aVar5.M = Boolean.valueOf(bool == null || bool.booleanValue());
        a aVar6 = this.b;
        int i6 = aVar.E;
        aVar6.E = i6 == -2 ? typedArrayD.getInt(22, -2) : i6;
        a aVar7 = this.b;
        int i7 = aVar.F;
        aVar7.F = i7 == -2 ? typedArrayD.getInt(23, -2) : i7;
        a aVar8 = this.b;
        Integer num = aVar.x;
        aVar8.x = Integer.valueOf(num == null ? typedArrayD.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        a aVar9 = this.b;
        Integer num2 = aVar.y;
        aVar9.y = Integer.valueOf(num2 == null ? typedArrayD.getResourceId(7, 0) : num2.intValue());
        a aVar10 = this.b;
        Integer num3 = aVar.z;
        aVar10.z = Integer.valueOf(num3 == null ? typedArrayD.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        a aVar11 = this.b;
        Integer num4 = aVar.A;
        aVar11.A = Integer.valueOf(num4 == null ? typedArrayD.getResourceId(17, 0) : num4.intValue());
        a aVar12 = this.b;
        Integer num5 = aVar.u;
        aVar12.u = Integer.valueOf(num5 == null ? jk6.b(context, typedArrayD, 1).getDefaultColor() : num5.intValue());
        a aVar13 = this.b;
        Integer num6 = aVar.w;
        aVar13.w = Integer.valueOf(num6 == null ? typedArrayD.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = aVar.v;
        if (num7 != null) {
            this.b.v = num7;
        } else {
            boolean zHasValue2 = typedArrayD.hasValue(10);
            a aVar14 = this.b;
            if (zHasValue2) {
                aVar14.v = Integer.valueOf(jk6.b(context, typedArrayD, 10).getDefaultColor());
            } else {
                this.b.v = Integer.valueOf(new dba(context, aVar14.w.intValue()).k.getDefaultColor());
            }
        }
        a aVar15 = this.b;
        Integer num8 = aVar.L;
        aVar15.L = Integer.valueOf(num8 == null ? typedArrayD.getInt(3, 8388661) : num8.intValue());
        a aVar16 = this.b;
        Integer num9 = aVar.N;
        aVar16.N = Integer.valueOf(num9 == null ? typedArrayD.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        a aVar17 = this.b;
        Integer num10 = aVar.O;
        aVar17.O = Integer.valueOf(num10 == null ? typedArrayD.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        a aVar18 = this.b;
        Integer num11 = aVar.P;
        aVar18.P = Integer.valueOf(num11 == null ? typedArrayD.getDimensionPixelOffset(19, 0) : num11.intValue());
        a aVar19 = this.b;
        Integer num12 = aVar.Q;
        aVar19.Q = Integer.valueOf(num12 == null ? typedArrayD.getDimensionPixelOffset(26, 0) : num12.intValue());
        a aVar20 = this.b;
        Integer num13 = aVar.R;
        aVar20.R = Integer.valueOf(num13 == null ? typedArrayD.getDimensionPixelOffset(20, aVar20.P.intValue()) : num13.intValue());
        a aVar21 = this.b;
        Integer num14 = aVar.S;
        aVar21.S = Integer.valueOf(num14 == null ? typedArrayD.getDimensionPixelOffset(27, aVar21.Q.intValue()) : num14.intValue());
        a aVar22 = this.b;
        Integer num15 = aVar.V;
        aVar22.V = Integer.valueOf(num15 == null ? typedArrayD.getDimensionPixelOffset(21, 0) : num15.intValue());
        a aVar23 = this.b;
        Integer num16 = aVar.T;
        aVar23.T = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        a aVar24 = this.b;
        Integer num17 = aVar.U;
        aVar24.U = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        a aVar25 = this.b;
        Boolean bool2 = aVar.W;
        aVar25.W = Boolean.valueOf(bool2 == null ? typedArrayD.getBoolean(0, false) : bool2.booleanValue());
        typedArrayD.recycle();
        Locale locale = aVar.G;
        a aVar26 = this.b;
        if (locale == null) {
            aVar26.G = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            aVar26.G = locale;
        }
        this.a = aVar;
    }

    public final boolean a() {
        return this.b.C != null;
    }
}
