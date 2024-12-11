
const ProductResultItem = ({ result }) => {
  const { productName, productId, metroAreaTitle, fullName, projectGroupId } = result;

  return (
    <li className="list-group-item">
      <strong>Product Name:</strong> {productName || "N/A"} <br />
      <strong>Product ID:</strong> {productId || "N/A"} <br />
      <strong>Metro Area Title:</strong> {metroAreaTitle || "N/A"} <br />
      <strong>Project Group Name:</strong> {fullName || "N/A"} <br />
      <strong>Project Group ID:</strong> {projectGroupId || "N/A"}
    </li>
  );
};

