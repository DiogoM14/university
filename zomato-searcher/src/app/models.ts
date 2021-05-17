export interface ICategoria {
  categories: {
    id: number;
    name: string;
  };
}

export interface ICategoriasResponse {
  categories: ICategoria[];
}

export interface IColecao {
  collection: {
    collection_id: number;
    description: string;
    image_url: string;
    res_count: number;
    share_url: string;
    title: string;
    url: string;
  };
}

export interface IColecoesResponse {
  collections: IColecao[];
  display_text: string;
  has_more: number;
  has_total: number;
  share_url: string;
  user_has_addresses: boolean;
}
