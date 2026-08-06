package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fc2 implements yh4 {
    @Override // defpackage.yh4
    public final Object apply(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = ec2.s;
        ec2.a aVar = new ec2.a();
        CharSequence charSequence = bundle.getCharSequence(ec2.s);
        if (charSequence != null) {
            aVar.b(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(ec2.t);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                int size = parcelableArrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = parcelableArrayList.get(i);
                    i++;
                    Bundle bundle2 = (Bundle) obj2;
                    int i2 = bundle2.getInt(id2.a);
                    int i3 = bundle2.getInt(id2.b);
                    int i4 = bundle2.getInt(id2.c);
                    int i5 = bundle2.getInt(id2.d, -1);
                    Bundle bundle3 = bundle2.getBundle(id2.e);
                    if (i5 == 1) {
                        bundle3.getClass();
                        String string = bundle3.getString(ty8.c);
                        string.getClass();
                        spannableStringValueOf.setSpan(new ty8(string, bundle3.getInt(ty8.d)), i2, i3, i4);
                    } else if (i5 == 2) {
                        bundle3.getClass();
                        spannableStringValueOf.setSpan(new oda(bundle3.getInt(oda.d), bundle3.getInt(oda.e), bundle3.getInt(oda.f)), i2, i3, i4);
                    } else if (i5 == 3) {
                        spannableStringValueOf.setSpan(new n15(), i2, i3, i4);
                    } else if (i5 == 4) {
                        bundle3.getClass();
                        String string2 = bundle3.getString(qjb.b);
                        string2.getClass();
                        spannableStringValueOf.setSpan(new qjb(string2), i2, i3, i4);
                    }
                }
                aVar.b(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(ec2.u);
        if (alignment != null) {
            aVar.c = alignment;
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(ec2.v);
        if (alignment2 != null) {
            aVar.d = alignment2;
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(ec2.w);
        if (bitmap != null) {
            aVar.b = bitmap;
            aVar.a = null;
        } else {
            byte[] byteArray = bundle.getByteArray(ec2.x);
            if (byteArray != null) {
                aVar.b = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                aVar.a = null;
            }
        }
        String str2 = ec2.y;
        if (bundle.containsKey(str2)) {
            String str3 = ec2.z;
            if (bundle.containsKey(str3)) {
                float f = bundle.getFloat(str2);
                int i6 = bundle.getInt(str3);
                aVar.e = f;
                aVar.f = i6;
            }
        }
        String str4 = ec2.A;
        if (bundle.containsKey(str4)) {
            aVar.g = bundle.getInt(str4);
        }
        String str5 = ec2.B;
        if (bundle.containsKey(str5)) {
            aVar.h = bundle.getFloat(str5);
        }
        String str6 = ec2.C;
        if (bundle.containsKey(str6)) {
            aVar.i = bundle.getInt(str6);
        }
        String str7 = ec2.E;
        if (bundle.containsKey(str7)) {
            String str8 = ec2.D;
            if (bundle.containsKey(str8)) {
                float f2 = bundle.getFloat(str7);
                int i7 = bundle.getInt(str8);
                aVar.k = f2;
                aVar.j = i7;
            }
        }
        String str9 = ec2.F;
        if (bundle.containsKey(str9)) {
            aVar.l = bundle.getFloat(str9);
        }
        String str10 = ec2.G;
        if (bundle.containsKey(str10)) {
            aVar.m = bundle.getFloat(str10);
        }
        String str11 = ec2.H;
        if (bundle.containsKey(str11)) {
            aVar.o = bundle.getInt(str11);
            aVar.n = true;
        }
        if (!bundle.getBoolean(ec2.I, false)) {
            aVar.n = false;
        }
        String str12 = ec2.J;
        if (bundle.containsKey(str12)) {
            aVar.p = bundle.getInt(str12);
        }
        String str13 = ec2.K;
        if (bundle.containsKey(str13)) {
            aVar.q = bundle.getFloat(str13);
        }
        String str14 = ec2.L;
        if (bundle.containsKey(str14)) {
            aVar.r = bundle.getInt(str14);
        }
        return aVar.a();
    }
}
