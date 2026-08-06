package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class jub extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        qvb qvbVar = (qvb) this;
        switch (i) {
            case 3:
                avb.b(parcel);
                break;
            case 4:
                avb.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                avb.b(parcel);
                break;
            case 7:
                avb.b(parcel);
                break;
            case 8:
                kwb kwbVar = (kwb) avb.a(parcel, kwb.CREATOR);
                avb.b(parcel);
                lvb lvbVar = (lvb) qvbVar;
                lvbVar.c.post(new kvb(lvbVar, kwbVar));
                break;
            case 9:
                avb.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
