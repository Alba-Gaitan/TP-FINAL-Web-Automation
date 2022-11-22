package lippia.web.constants;

public class ShopConstants {


    public static final String BTN_VIEW_BASKET = "xpath://a[text()='View Basket']";
    public static final String TXT_SUBTOTAL = "xpath://*[@id=\"page-34\"]/div/div[1]/div/div/table/tbody/tr[1]/th";
    public static final String TXT_TOTAL = "xpath://*[@id=\"page-34\"]/div/div[1]/div/div/table/tbody/tr[3]/th";
    public static final String BTN_CHECKOUT = "xpath://*[@id=\"page-34\"]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]";
    public static final String ADDITIONAL_INFORMATION = "xpath://*[@id=\"customer_details\"]/div[2]/div/h3";
    public static final String LIST_ORDER = "xpath://*[@id=\"order_review\"]/table[1]";
    public static final String BTN_PLACE_ORDER = "xpath://input[@value='Place order']";
    public static final String BILLING_DETAILS = "xpath://*[@id=\"customer_details\"]/div[1]/div[1]/h3[1]";
    public static final String INPUT_FIRST_NAME = "xpath://*[@id=\"billing_first_name\"]";
    public static final String INPUT_LAST_NAME = "xpath://*[@id=\"billing_last_name\"]";
    public static final String INPUT_COMPANY_NAME = "xpath://*[@id=\"billing_company\"]";
    public static final String INPUT_EMAIL = "xpath://*[@id=\"billing_email\"]";
    public static final String INPUT_PHONE = "xpath://*[@id=\"billing_phone\"]";
    public static final String INPUT_ADRESS = "xpath://*[@id=\"billing_address_1\"]";
    public static final String INPUT_APARMENT = "xpath://*[@id=\"billing_address_2\"]";
    public static final String INPUT_TOWN_CITY = "xpath://*[@id=\"billing_city\"]";
    public static final String INPUT_POST_CODE = "xpath://*[@id=\"billing_postcode\"]";
    public static final String ENTER_CODE_CUPON = "xpath://a[contains(.,'Click here to enter your code')]";
    public static final String INPUT_CODE_CUPON = "xpath://*[@id=\"coupon_code\"]";

    public static final String BTN_APPLY_CUPON = "xpath://*[@id=\"page-35\"]/div/div[1]/form[2]/p[2]/input";
    public static final String LIST_FORMA_PAGO= "xpath://*[@class=\"input-radio\"]";
    public static final String MESSAGE_CONFIRMATION_ORDER= "xpath://p[contains(.,'Thank you. Your order has been received.')]";
    public static final String ORDER_NUMBER= "xpath://li[@class='order']";
    public static final String ORDER_DATE= "xpath://li[contains(@class,'date')]";
    public static final String ORDER_PRICE= "xpath:(//span[@class='woocommerce-Price-amount amount'])[1]";
    public static final String ORDER_PAYMENT = "xpath://li[contains(@class,'method')]";
    public static final String ORDER_PRODUCT = "xpath://td[contains(@class,'product')]";
    public static final String ORDER_SUB_TOTAL = "xpath://*[@id=\"page-35\"]/div/div[1]/table/tfoot/tr[1]/th";
    public static final String ORDER_TOTAL = "xpath://*[@id=\"page-35\"]/div/div[1]/table/tfoot/tr[4]/th";
    public static final String SELECTED_COUNTRY = "xpath://*[@id=\"s2id_billing_country\"]/label";

    public static final String BTN_ADD_TO_BASKET_SHOP = "xpath://a[@href='/shop/?add-to-cart=182']";
    public static final String COUNTRY_INDIA = "xpath:(//div[contains(.,'India')])[14]";
    public static final String INPUT_SEARCH_PAIS = "xpath://*[@id=\"s2id_autogen1_search\"]";
    public static final String TAX_EXTRANJERA = "xpath:(//span[contains(@class,'woocommerce-Price-amount amount')])[3]";
    public static final String TAX_INDIA = "xpath://span[@class='woocommerce-Price-amount amount'][contains(.,'₹3.60')]";



}
