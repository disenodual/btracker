package com.innovamos.btracker.data;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;
import android.text.format.Time;

/**
 * Created by root on 29/05/16.
 */
public class BtrackerContract {
    public static final String CONTENT_AUTHORITY = "com.innovamos.btracker";

    // Use CONTENT_AUTHORITY to create the base of all URI's which apps will use to contact
    // the content provider.
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_BEACONS = "beacons";
    public static final String PATH_CUSTOMERS = "customers";
    public static final String PATH_CUSTOMERS_PRODUCTS = "customers_products";
    public static final String PATH_PRODUCTS = "products";
    public static final String PATH_PRODUCTS_ZONES = "products_zones";
    public static final String PATH_PURCHASES = "purchases";
    public static final String PATH_STORES = "stores";
    public static final String PATH_VISITS = "visits";
    public static final String PATH_ZONES = "zones";


    public static final class BeaconsEntry implements BaseColumns {
        public static final String TABLE_NAME = "beacons";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_UUID = "uuid";
        public static final String COLUMN_MAJOR = "major";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_MINOR = "minor";
        public static final String COLUMN_DETECTION_RANGE = "detection_range";
        public static final String COLUMN_CREATED = "created";
        public static final String COLUMN_MODIFIED = "modified";

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_BEACONS).build();

        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_BEACONS;
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_BEACONS;
    }

    public static final class CustomersEntry implements BaseColumns{
        public static final String TABLE_NAME = "customers";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_MAC = "mac";
        public static final String COLUMN_CREATED = "created";
        public static final String COLUMN_MODIFIED = "modified";
    }

    public static final class CustomersProductsEntry implements BaseColumns{
        public static final String TABLE_NAME = "customers_products";
        public static final String COLUMN_CUSTOMER_ID = "customer_id";
        public static final String COLUMN_PRODUCT_ID = "product_id";
    }

    public static final class ProductsEntry implements BaseColumns{
        public static final String TABLE_NAME = "products";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_DESCRIPTION = "description";
        public static final String COLUMN_PRICE = "price";
        public static final String COLUMN_DISCOUNT = "discount";
        public static final String COLUMN_TERMS = "terms";
        public static final String COLUMN_PICTURE = "picture";
        public static final String COLUMN_PICTURE_DIR = "picture_dir";
        public static final String COLUMN_STATUS = "status";
        public static final String COLUMN_CREATED = "created";
        public static final String COLUMN_MODIFIED = "modified";
        public static final String COLUMN_TYPE = "type";
    }

    public static final class ProductsZonesEntry implements BaseColumns{
        public static final String TABLE_NAME = "products_zones";
        public static final String COLUMN_ZONE_ID = "zone_id";
        public static final String COLUMN_PRODUCT_ID = "product_id";
    }

    public static final class PurchasesEntry implements BaseColumns{
        public static final String TABLE_NAME = "purchases";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_PRODUCT_ID = "product_id";
        public static final String COLUMN_CUSTOMER_ID = "customer_id";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_PRICE = "price";
    }

    public static final class StoresEntry implements BaseColumns{
        public static final String TABLE_NAME = "stores";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_USER_ID = "user_id";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_DESCRIPTION = "description";
        public static final String COLUMN_STATUS = "status";
        public static final String COLUMN_CREATED = "created";
        public static final String COLUMN_MODIFIED = "modified";
    }

    public static final class VisitsEntry implements BaseColumns{
        public static final String TABLE_NAME = "visits";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_TRIGGER_TIME = "trigger_time";
        public static final String COLUMN_LEAVE_TIME = "leave_time";
        public static final String COLUMN_CUSTOMER_ID = "customer_id";
        public static final String COLUMN_ZONE_ID = "zone_id";
        public static final String COLUMN_VIEWED = "viewed";
    }

    public static final class ZonesEntry implements BaseColumns{
        public static final String TABLE_NAME = "zones";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_DESCRIPTION = "description";
        public static final String COLUMN_STORE_ID = "store_id";
        public static final String COLUMN_BEACON_ID = "beacon_id";
        public static final String COLUMN_CREATED = "created";
        public static final String COLUMN_MODIFIED = "modified";
        public static final String COLUMN_ENTRANCE = "entrance";
        public static final String COLUMN_STATUS = "status";
    }

}
