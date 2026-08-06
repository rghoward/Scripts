package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spanned;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hc2 implements yh4 {
    @Override // defpackage.yh4
    public final Object apply(Object obj) {
        ec2 ec2Var = (ec2) obj;
        Bitmap bitmap = ec2Var.d;
        Bundle bundle = new Bundle();
        CharSequence charSequence = ec2Var.a;
        if (charSequence != null) {
            bundle.putCharSequence(ec2.s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = id2.a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (ty8 ty8Var : (ty8[]) spanned.getSpans(0, spanned.length(), ty8.class)) {
                    ty8Var.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(ty8.c, ty8Var.a);
                    bundle2.putInt(ty8.d, ty8Var.b);
                    arrayList.add(id2.a(spanned, ty8Var, 1, bundle2));
                }
                for (oda odaVar : (oda[]) spanned.getSpans(0, spanned.length(), oda.class)) {
                    odaVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(oda.d, odaVar.a);
                    bundle3.putInt(oda.e, odaVar.b);
                    bundle3.putInt(oda.f, odaVar.c);
                    arrayList.add(id2.a(spanned, odaVar, 2, bundle3));
                }
                for (n15 n15Var : (n15[]) spanned.getSpans(0, spanned.length(), n15.class)) {
                    arrayList.add(id2.a(spanned, n15Var, 3, null));
                }
                for (qjb qjbVar : (qjb[]) spanned.getSpans(0, spanned.length(), qjb.class)) {
                    qjbVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(qjb.b, qjbVar.a);
                    arrayList.add(id2.a(spanned, qjbVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(ec2.t, arrayList);
                }
            }
        }
        bundle.putSerializable(ec2.u, ec2Var.b);
        bundle.putSerializable(ec2.v, ec2Var.c);
        bundle.putFloat(ec2.y, ec2Var.e);
        bundle.putInt(ec2.z, ec2Var.f);
        bundle.putInt(ec2.A, ec2Var.g);
        bundle.putFloat(ec2.B, ec2Var.h);
        bundle.putInt(ec2.C, ec2Var.i);
        bundle.putInt(ec2.D, ec2Var.n);
        bundle.putFloat(ec2.E, ec2Var.o);
        bundle.putFloat(ec2.F, ec2Var.j);
        bundle.putFloat(ec2.G, ec2Var.k);
        bundle.putBoolean(ec2.I, ec2Var.l);
        bundle.putInt(ec2.H, ec2Var.m);
        bundle.putInt(ec2.J, ec2Var.p);
        bundle.putFloat(ec2.K, ec2Var.q);
        bundle.putInt(ec2.L, ec2Var.r);
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            xl7.r(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(ec2.x, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }
}
